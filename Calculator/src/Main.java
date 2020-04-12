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

		@SuppressWarnings("rawtypes")
		ComboBox comboBoxBerechnungen = new ComboBox(
				FXCollections.observableArrayList("Multiplikation", "Addition", "Subktraktion"));
		Label l = new Label("");
		comboBoxBerechnungen.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent e) {
				try {
					datahandling.readCsv(input);
				} catch (IOException f) {
					f.printStackTrace();
				}
				do {
					if (comboBoxBerechnungen.getValue().equals("Multiplikation")) {
						int result = calculate.Multiplikation(input);
						l.setText(Integer.toString(result));
					}
					if (comboBoxBerechnungen.getValue().equals("Addition")) {
						int result = calculate.Addition(input);
						l.setText(Integer.toString(result));
					}
					if (comboBoxBerechnungen.getValue().equals("Subtraktion")) {
						int result = calculate.Subtraktion(input);
						l.setText(Integer.toString(result));
					}

				} while (false);
			}
		});

		openButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(final ActionEvent e) {
				File file = fileChooser.showOpenDialog(stage);
				if (file != null) {
					FileChooserSample.openFile(file);
				}
			}
		});

		final GridPane inputGridPane = new GridPane();
		GridPane.setConstraints(openButton, 0, 0);
		GridPane.setConstraints(comboBoxBerechnungen, 2, 0);
		GridPane.setConstraints(l, 2,2);
		inputGridPane.setHgap(6);
		inputGridPane.setVgap(6);
		inputGridPane.getChildren().addAll(openButton, comboBoxBerechnungen,l);
		final Pane rootGroup = new VBox(12);
		rootGroup.getChildren().addAll(inputGridPane);
		rootGroup.setPadding(new Insets(200, 200, 200, 200));

		stage.setScene(new Scene(rootGroup));
		stage.show();
	}

	public static void main(String[] args) {

		Application.launch();

	}
}
