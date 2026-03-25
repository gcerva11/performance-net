package preformanceNet;
import java.util.Scanner;
public class CrossCountry {
   private XCFileReader xcFileReaderInstance;
   private HypotheticalResults hypotheticalResults;
   public CrossCountry() {
       xcFileReaderInstance = new XCFileReader();
       hypotheticalResults = new HypotheticalResults();
   }
   public void crossCountry() {
   Scanner scanner = new Scanner(System.in);
       System.out.println("Choose race distance");
       System.out.println("1. 2 mile\n2. 5k");
       String distance = scanner.nextLine();
      
       if (distance.equals("1")) { // 2 mile races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. XC 1\n2.XC 2\n3.XC 3"); //choose race
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "CROSS COUNTRY2mileXC OneFSGirls.txt"; //file
                   xcFileReaderInstance.loadRunnersFromFile(filePath); //call file reader
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners(); //call to print top 5
                   xcFileReaderInstance.updateAndPrintRunners(); // call to print array of runners
               } else if (race.equals("2")) {
                   String filePath = "CROSS COUNTRY2mileXC TwoFSGirls.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("3")) {
                   String filePath = "CROSS COUNTRY2mileXC ThreeFSGirls.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. XC 1\n2.XC 2\n3.XC 3");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "CROSS COUNTRY2mileXC OneFSBoys.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("2")) {
                   String filePath = "CROSS COUNTRY2mileXC TwoFSBoys.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("3")) {
                   String filePath = "CROSS COUNTRY2mileXC ThreeFSBoys.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               }
           }
       } else if (distance.equals("2")) { // 5k races
           System.out.println("Choose a level: ");
           System.out.println("1. Varsity Girls\n2. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // varsity girls
               System.out.println("1. XC 1\n2.XC 2\n3.XC 3");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "CROSS COUNTRY5KXC OneVGirls.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("2")) {
                   String filePath = "CROSS COUNTRY5KXC TwoVGirls.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("3")) {
                   String filePath = "CROSS COUNTRY5KXC ThreeVGirls.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.updateAndPrintRunners();
               }
           } else if (divisionOne.equals("2")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. XC 1\n2.XC 2\n3.XC 3");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "CROSS COUNTRY5KXC OneVBoys.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("2")) {
                   String filePath = "CROSS COUNTRY5KXC TwoVBoys.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               } else if (race.equals("3")) {
                   String filePath = "CROSS COUNTRY5KXC ThreeVBoys.txt";
                   xcFileReaderInstance.loadRunnersFromFile(filePath);
                   xcFileReaderInstance.printSchoolSumsForTopFiveRunners();
                   xcFileReaderInstance.updateAndPrintRunners();
               }
           }
       }
           System.out.println("Would you like to create hypothetical results? (yes/no)");
           String createHypothetical = scanner.nextLine();
           if (createHypothetical.equalsIgnoreCase("yes")) {
               hypotheticalResults.hypoResults(xcFileReaderInstance);
  
       }
       scanner.close();
   }
}


