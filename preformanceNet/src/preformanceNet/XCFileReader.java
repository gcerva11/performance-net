package preformanceNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Runner implements Comparable<Runner> {
    private int grade;
    private int placement;
    private String name;
    private String time;
    private String school;

    public Runner(int placement, int grade, String name, String time, String school) {
        this.placement = placement;
        this.grade = grade;
        this.name = name;
        this.time = time;
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int newPlacement) {
        this.placement = newPlacement;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public int compareTo(Runner other) {
        return Integer.compare(this.placement, other.placement);
    }
}

public class XCFileReader {
    private List<Runner> runners = new ArrayList<>();
    private List<Runner> topRunnersBySchool = new ArrayList<>();

    public void loadRunnersFromFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                String[] parts = line.split("\\s+");

                if (parts.length >= 5) {
                    int placement = Integer.parseInt(parts[0]);
                    int grade = Integer.parseInt(parts[1]);
                    String name = parts[2] + " " + parts[3];
                    String time = parts[4];
                    String school = parts[5];

                    Runner runner = new Runner(placement, grade, name, time, school);
                    runners.add(runner);

                    // Add runner to top runners list if within top 5 for the school
                    if (topRunnersBySchool.size() < 5) {
                        topRunnersBySchool.add(runner);
                    } else {
                        // Replace lowest placement runner if current runner has better placement
                        int minPlacementIndex = minPlacement(topRunnersBySchool);
                        Runner minPlacementRunner = topRunnersBySchool.get(minPlacementIndex);
                        if (runner.compareTo(minPlacementRunner) < 0) {
                            topRunnersBySchool.set(minPlacementIndex, runner);
                        }
                    }
                } else {
                    System.out.println("Incomplete data in line: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }

    private int minPlacement(List<Runner> runners) {
        int minIndex = 0;
        int minPlacement = Integer.MAX_VALUE;
        for (int i = 0; i < runners.size(); i++) {
            Runner runner = runners.get(i);
            if (runner.getPlacement() < minPlacement) {
                minPlacement = runner.getPlacement();
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void modifyRunnerData(int runnerIndex, String newTime) {
        int actualIndex = runnerIndex - 1;

        if (actualIndex >= 0 && actualIndex < runners.size()) {
            Runner runner = runners.get(actualIndex);

            if (!newTime.trim().isEmpty()) {
                runner.setTime(newTime);
                System.out.println("Runner's time has been updated.");

                // Bubble sort based on updated times
                Collections.sort(runners);

                // Update placement based on the sorted list
                for (int i = 0; i < runners.size(); i++) {
                    runners.get(i).setPlacement(i + 1);
                }

                updateTopRunners();
                updateAndPrintRunners();
            } else {
                System.out.println("No changes made to the runner's time.");
            }
        } else {
            System.out.println("Invalid runner index.");
        }
    }

    public void updateAndPrintRunners() {
        bubbleSort();

        System.out.println("\nPlacement\tGrade\tName\t\t\tTime\t\t\tSchool");
        for (Runner runner : runners) {
            System.out.printf("%-10d%-8d%-24s%-16s%-16s%n",
                    runner.getPlacement(), runner.getGrade(),
                    runner.getName(), runner.getTime(), runner.getSchool());
        }
    }

    private void bubbleSort() {
        // Bubble sort based on times
        for (int i = 0; i < runners.size() - 1; i++) {
            for (int j = 0; j < runners.size() - i - 1; j++) {
                Runner current = runners.get(j);
                Runner next = runners.get(j + 1);

                if (current.getTime().compareTo(next.getTime()) > 0) {
                    Collections.swap(runners, j, j + 1);
                }
            }
        }

        // Update placement based on the sorted list
        for (int i = 0; i < runners.size(); i++) {
            runners.get(i).setPlacement(i + 1);
        }
    }

    public void updateTopRunners() {
        topRunnersBySchool.clear();
        Map<String, List<Runner>> topRunnersMap = new HashMap<>();

        for (Runner runner : runners) {
            String school = runner.getSchool();
            List<Runner> schoolRunners = topRunnersMap.getOrDefault(school, new ArrayList<>());

            if (schoolRunners.size() < 5) {
                schoolRunners.add(runner);
            }

            topRunnersMap.put(school, schoolRunners);
        }

        topRunnersMap.values().forEach(topRunnersBySchool::addAll);
    }
    
  
public void printSchoolSumsForTopFiveRunners() {
    Map<String, Integer> schoolCounts = new HashMap<>();
    Map<String, Integer> schoolPoints = new HashMap<>();

    // Count runners and calculate total points for each school
    for (Runner runner : runners) {
        String school = runner.getSchool();
        int placement = runner.getPlacement();
        
        // Count the number of runners for each school
        schoolCounts.put(school, schoolCounts.getOrDefault(school, 0) + 1);
        
        // Add points to the school's total if the runner is in the top 5
        if (schoolCounts.get(school) <= 5) {
            schoolPoints.put(school, schoolPoints.getOrDefault(school, 0) + placement);
        }
    }

    // Print schools with 5 or more runners and their total points
    System.out.println("Schools with 5 or more runners and total points for top 5 runners:");
    for (Map.Entry<String, Integer> entry : schoolCounts.entrySet()) {
        String school = entry.getKey();
        int count = entry.getValue();
        
        if (count >= 5) {
            int points = schoolPoints.getOrDefault(school, 0);
            System.out.println(school + ": " + points + " points");
        }
    }
}
}
