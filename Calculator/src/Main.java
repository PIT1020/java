import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static ArrayList<Integer> input = new ArrayList<>();
	
	@SuppressWarnings("unchecked")
	public void start(Stage stage) {
	
	 final FileChooser fileChooser = new FileChooser(); 
     final Button openButton = new Button("Upload");
     String Berechnungsarten[] = { "Multiplikation", "Addition", "Subtraktion"}; 

     // Create a combo box 
     @SuppressWarnings({ "unchecked", "rawtypes" })
	ComboBox combo_box_Berechnungen = new ComboBox(FXCollections.observableArrayList(Berechnungsarten)); 

     openButton.setOnAction(
         new EventHandler<ActionEvent>() {
             @Override
             public void handle(final ActionEvent e) {
                 File file = fileChooser.showOpenDialog(stage);
                 if (file != null) {
                     FileChooserSample.openFile(file);
                 }
             }
         });

     combo_box_Berechnungen.setOnAction(
             new EventHandler<ActionEvent>() {
            	 @Override
                 public void handle(final ActionEvent e) {   
                	if( e.getSource() == "Multiplikation") {
                	calculate.Multiplikation(input);
                	}
                 }
             });
     

     final GridPane inputGridPane = new GridPane();
     GridPane.setConstraints(openButton, 0, 0);
     GridPane.setConstraints(combo_box_Berechnungen, 2, 0);
     inputGridPane.setHgap(6);
     inputGridPane.setVgap(6);
     inputGridPane.getChildren().addAll(openButton,combo_box_Berechnungen);

     final Pane rootGroup = new VBox(12);
     rootGroup.getChildren().addAll(inputGridPane);
     rootGroup.setPadding(new Insets(200, 200, 200, 200));
     
     stage.setScene(new Scene(rootGroup));
     stage.show();
 }
	

	public static void main(String[] args) {
		
		
		Application.launch(args);
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		try {
			datahandling.readCsv(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		calculate.Addition(input);

	}

}
