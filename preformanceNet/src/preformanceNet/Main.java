package preformanceNet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ButtonBar.ButtonData;
import java.util.Optional;

public class Main extends Application {

    private XCFileReader xcFileReader;
    private TrackFileReader trackMeetScorer;
    private HypotheticalResults hypotheticalResults;
    private ChoiceBox<String> sportChoiceBox;
    private ChoiceBox<String> distanceChoiceBox;
    private ChoiceBox<String> meetChoiceBox;
    private ChoiceBox<String> levelChoiceBox;

    @Override
    public void start(Stage primaryStage) {
        xcFileReader = new XCFileReader(); // Initialize xcFileReader instance
        trackMeetScorer = new TrackFileReader(); // Initialize TrackMeetScorer instance
        hypotheticalResults = new HypotheticalResults(); // Initialize HypotheticalResults instance

        // Create choice box for selecting sport
        sportChoiceBox = new ChoiceBox<>();
        sportChoiceBox.getItems().addAll("Cross Country", "Track and Field");

        // Create choice boxes for race distance and meet
        distanceChoiceBox = new ChoiceBox<>();
        meetChoiceBox = new ChoiceBox<>();

        // Create choice box for selecting level
        levelChoiceBox = new ChoiceBox<>();
        levelChoiceBox.getItems().addAll("FS Girls", "FS Boys", "V Girls", "V Boys");

        // Create submit button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(event -> {
            String sport = sportChoiceBox.getValue();
            String distance = distanceChoiceBox.getValue();
            String meet = meetChoiceBox.getValue();
            String level = levelChoiceBox.getValue(); // Get the selected level

            // Load data based on the selected sport, distance, meet, and level
            if (sport != null && distance != null && meet != null && level != null) {
                String filePath = constructFilePath(sport, distance, meet, level);
                xcFileReader.loadRunnersFromFile(filePath);
                xcFileReader.printSchoolSumsForTopFiveRunners();
                xcFileReader.updateAndPrintRunners();

                // If the selected sport is Track and Field, execute TrackMeetScorer
                if ("Track and Field".equals(sport)) {
                    trackMeetScorer.loadTrackRunnersFromFile(filePath); // Load track runners
                    trackMeetScorer.printTopEightRunnersScores();
                    trackMeetScorer.printTopEightRunnersScores(); // Calculate and print school sums
                }

                // Ask user if they want to create hypothetical results
                askForHypotheticalResults();
            }
        });

        // Layout setup
        VBox root = new VBox(10, sportChoiceBox, distanceChoiceBox, meetChoiceBox, levelChoiceBox, submitButton);
        Scene scene = new Scene(root, 300, 250);

        // Stage setup
        primaryStage.setScene(scene);
        primaryStage.setTitle("PerformanceNet");
        primaryStage.show();

        // Event handling for sport selection
        sportChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if ("Cross Country".equals(newValue)) {
                distanceChoiceBox.getItems().setAll("2 mile", "5k");
                meetChoiceBox.getItems().setAll("XC One", "XC Two", "XC Three");
            } else if ("Track and Field".equals(newValue)) {
                distanceChoiceBox.getItems().setAll("100", "200", "400", "800", "1600", "3200");
                meetChoiceBox.getItems().setAll("TF1", "TF2");
            }
        });
    }

    private String constructFilePath(String sport, String distance, String meet, String level) {
        // Construct file path based on selected sport, distance, meet, and level
        return sport.toUpperCase() + distance.replace(" ", "") + meet + level.replace(" ", "") + ".txt";
    }

    private void askForHypotheticalResults() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Create Hypothetical Results");
        alert.setHeaderText("Would you like to create hypothetical results?");
        alert.setContentText("Choose your option.");

        ButtonType buttonTypeYes = new ButtonType("Yes");
        ButtonType buttonTypeNo = new ButtonType("No", ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == buttonTypeYes) {
            hypotheticalResults.hypoResults(xcFileReader);
            
            // If the selected sport is Track and Field, recalculate and print school sums
            String sport = sportChoiceBox.getValue();
            if ("Track and Field".equals(sport)) {
                trackMeetScorer.printTopEightRunnersScores();
               // Creating an ArrayList to store the runners information and file parsing.


            }
        }
    }
}
