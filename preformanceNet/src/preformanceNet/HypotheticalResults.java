package preformanceNet;
import java.util.Scanner;
public class HypotheticalResults {
   public void hypoResults(XCFileReader xcFileReaderInstance) {
       Scanner scanner = new Scanner(System.in);
       boolean continueModifying = true;
       while (continueModifying) {
           System.out.println("Who would you like to change?");
           int runnerIndex = Integer.parseInt(scanner.nextLine());
           System.out.println("Enter new time for the runner: ");
           String newTime = scanner.nextLine();
           xcFileReaderInstance.modifyRunnerData(runnerIndex, newTime);
           xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
           xcFileReaderInstance.updateAndPrintRunners();
           System.out.println("Do you want to continue modifying runners? (yes/no)");
           String userInput = scanner.nextLine().toLowerCase();
           continueModifying = userInput.equals("yes");
       }
       // Close scanner
       scanner.close();
   }

public void hypoResults(TrackFileReader trackMeetScorerInstance) {
	Scanner scanner = new Scanner(System.in);
	
    boolean continueModifying = true;
    while (continueModifying) {
        System.out.println("Who would you like to change?");
        int runnerIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new time for the runner: ");
        String newTime = scanner.nextLine();
        trackMeetScorerInstance.modifyRunnerData(runnerIndex, newTime);
        trackMeetScorerInstance.printTopEightRunnersScores();
        trackMeetScorerInstance.updateAndPrintRunners();
        System.out.println("Do you want to continue modifying runners? (yes/no)");
        String userInput = scanner.nextLine().toLowerCase();
        continueModifying = userInput.equals("yes");
    }
    // Close scanner
    scanner.close();
}
}
