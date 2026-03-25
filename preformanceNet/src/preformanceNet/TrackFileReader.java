package preformanceNet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class TrackRunner implements Comparable<TrackRunner> {
    private int grade;
    private int placement;
    private String name;
    private String time;
    private String school;

    public TrackRunner(int placement, int grade, String name, String time, String school) {
        this.placement = placement;
        this.grade = grade;
        this.name = name;
        this.time = time;
        this.school = school;
    }

    // Getters and setters

    @Override
    public int compareTo(TrackRunner other) {
        return Integer.compare(this.placement, other.placement);
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
}

public class TrackFileReader {
    private List<TrackRunner> runners = new ArrayList<>();
    private List<TrackRunner> topRunnersBySchool = new ArrayList<>();

    public void loadTrackRunnersFromFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+");

                if (parts.length >= 6) {
                    int placement = Integer.parseInt(parts[0]);
                    int grade = Integer.parseInt(parts[1]);
                    String name = parts[2] + " " + parts[3];
                    String time = parts[4];
                    String school = parts[5];

                    TrackRunner trackRunner = new TrackRunner(placement, grade, name, time, school);
                    runners.add(trackRunner);
                } else {
                    System.out.println("Incomplete data in line: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        }
    }

    public void modifyRunnerData(int runnerIndex, String newTime) {
        int actualIndex = runnerIndex - 1;

        if (actualIndex >= 0 && actualIndex < runners.size()) {
            TrackRunner runner = runners.get(actualIndex);

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

    public void updateAndPrintRunners() { //organizes list
        bubbleSort();

        System.out.println("\nPlacement\tGrade\tName\t\t\tTime\t\t\tSchool");
        for (TrackRunner runner : runners) {
            System.out.printf("%-10d%-8d%-24s%-16s%-16s%n",
                    runner.getPlacement(), runner.getGrade(),
                    runner.getName(), runner.getTime(), runner.getSchool());
        }
    }

    private void bubbleSort() {
        // Bubble sort based on times
        for (int i = 0; i < runners.size() - 1; i++) {
            for (int j = 0; j < runners.size() - i - 1; j++) {
                TrackRunner current = runners.get(j);
                TrackRunner next = runners.get(j + 1);

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
        Map<String, List<TrackRunner>> topRunnersMap = new HashMap<>();

        for (TrackRunner runner : runners) {
            String school = runner.getSchool();
            List<TrackRunner> schoolRunners = topRunnersMap.getOrDefault(school, new ArrayList<>());

            if (schoolRunners.size() < 5) {
                schoolRunners.add(runner);
            }

            topRunnersMap.put(school, schoolRunners);
        }

        topRunnersMap.values().forEach(topRunnersBySchool::addAll);
    }

    public void printTopEightRunnersScores() {
        Map<String, Integer> schoolPoints = new HashMap<>();

        // Sort runners by placement
        placementSort();

        // Calculate points for top 8 runners
        for (int i = 0; i < Math.min(8, runners.size()); i++) {
            TrackRunner trackRunner = runners.get(i);
            String school = trackRunner.getSchool();
            int placement = trackRunner.getPlacement();
            int points = getPointsForPlacement(placement);

            // Add points to the school's total
            schoolPoints.put(school, schoolPoints.getOrDefault(school, 0) + points);
        }

        // Build a string to hold the total points for each school
        StringBuilder result = new StringBuilder("Total points for each school:\n");
        for (Map.Entry<String, Integer> entry : schoolPoints.entrySet()) {
            String school = entry.getKey();
            int points = entry.getValue();
            result.append(school).append(": ").append(points).append(" points\n");
        }
        System.out.println(result.toString());
    }

    // Helper method to get points based on placement
    private int getPointsForPlacement(int placement) {
        switch (placement) {
            case 1:
                return 10;
            case 2:
                return 8;
            case 3:
                return 6;
            case 4:
                return 5;
            case 5:
                return 4;
            case 6:
                return 3;
            case 7:
                return 2;
            case 8:
                return 1;
            default:
                return 0; // No points for placements beyond 8th
        }
    }

    // Bubble sort to sort track runners based on their placements
    private void placementSort() {
        int n = runners.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (runners.get(j).getPlacement() > runners.get(j + 1).getPlacement()) {
                    // Swap the TrackRunners if they are in the wrong order
                    TrackRunner temp = runners.get(j);
                    runners.set(j, runners.get(j + 1));
                    runners.set(j + 1, temp);
                }
            }
        }
    }
}

