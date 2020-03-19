import java.util.Scanner;

public class Uberlauf13 {

	public static void main(String[] args) {

		// Verbindung zur Standard-Eingabe resp.zum Keyboard:
		Scanner eingabe = new Scanner(System.in);

		byte var = 0;
		for (byte i = 0; i < 300; i++) {
			System.out.println(var);
			var++;
		}
	}
}