package preformanceNet;
import java.util.Scanner;
public class TrackAndField {
   private TrackFileReader trackMeetScorerInstance;
   private HypotheticalResults hypotheticalResults;
  
   public TrackAndField() {
       trackMeetScorerInstance = new TrackFileReader();
       hypotheticalResults = new HypotheticalResults();

   }
   public void trackNField() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Choose race distance");
       System.out.println("1. 100\n2. 200\n3. 400\n4. 800\n5. 1600\n6. 3200");
       String distance = scanner.nextLine();
       if (distance.equals("1")) { // 100m races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys\n3. Varsity Girls\n4. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) { //tf 1
                   String filePath = "TRACK AND FIELD100TF1FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD100TF2FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD100TF1FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD100TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("3")) { // varsity girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD100TF1VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD100TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("4")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF1");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD100TF1VBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               }else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD100TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               	   }
           }
       }if (distance.equals("2")) { // 200m races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys\n3. Varsity Girls\n4. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) { //tf 1
                   String filePath = "TRACK AND FIELD200TF1FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD200TF1FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("3")) { // varsity girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD200TF1VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("4")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF1");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD200TF1VBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               }else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               	   }
           }
       } if (distance.equals("3")) { // 400m races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys\n3. Varsity Girls\n4. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) { //tf 1
                   String filePath = "TRACK AND FIELD400TF1FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD400TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD400TF1FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD400TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("3")) { // varsity girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD400TF1VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD400TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("4")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF1");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD400TF1VBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               }else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD400TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               	   }
           }
       }if (distance.equals("4")) { // 800m races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys\n3. Varsity Girls\n4. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) { //tf 1
                   String filePath = "TRACK AND FIELD800TF1FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD800TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD800TF1FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD800TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("3")) { // varsity girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD800TF1VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD800TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("4")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF1");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD800TF1VBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               }else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD800TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               	   }
           }
       }if (distance.equals("5")) { // 1600m races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys\n3. Varsity Girls\n4. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) { //tf 1
                   String filePath = "TRACK AND FIELD1600TF1FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD1600TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD1600TF1FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD1600TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("3")) { // varsity girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD1600TF1VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD1600TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("4")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF1");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD1600TF1VBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();

               }else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD1600TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               	   }
           }
       }if (distance.equals("6")) { // 3200m races
           System.out.println("Choose a level: ");
           System.out.println("1. Frosh/Soph Girls\n2. Frosh/Soph Boys\n3. Varsity Girls\n4. Varsity Boys");
           String divisionOne = scanner.nextLine();
           String race = "";
           if (divisionOne.equals("1")) { // Frosh/Soph Girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) { //tf 1
                   String filePath = "TRACK AND FIELD3200TF1FSGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD3200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("2")) { // Frosh/Soph boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD3200TF1FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD3200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("3")) { // varsity girls
               System.out.println("Choose a race: ");
               System.out.println("1. TF 1\n2. TF 2");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD3200TF1VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               } else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD3200TF2VGirls.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
                   }
           } else if (divisionOne.equals("4")) { // varsity boys
               System.out.println("Choose a race: ");
               System.out.println("1. TF1");
               race = scanner.nextLine();
               if (race.equals("1")) {
                   String filePath = "TRACK AND FIELD3200TF1VBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               }else if (race.equals("2")) { // tf 2 
                   String filePath = "TRACK AND FIELD3200TF2FSBoys.txt";
                   trackMeetScorerInstance.loadTrackRunnersFromFile(filePath);
                   trackMeetScorerInstance.printTopEightRunnersScores();
                   trackMeetScorerInstance.updateAndPrintRunners();
               	   }
           }
       }
       System.out.println("Would you like to create hypothetical results? (yes/no)");
       String createHypothetical = scanner.nextLine();
       if (createHypothetical.equalsIgnoreCase("yes")) {
           hypotheticalResults.hypoResults(trackMeetScorerInstance);
   }
}
}