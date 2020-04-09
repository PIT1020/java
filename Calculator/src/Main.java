import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	
	public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello Katrin, du bist süss");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
    }
	

	public static void main(String[] args) {
		
		
			
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int [] arrayTest ={10,2};
		System.out.println("Eingabe der Daten");
		for (int i = 0; i < arrayTest.length; i++) {
			input.add(arrayTest[i]);
		}
		System.out.println("Eingabe der Rechenmethode");
		String Methode = scanner.nextLine();
		validateModell.validate(Methode);
		calculate.Addition(input);
		launch();

	}

}
