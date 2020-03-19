import java.util.Scanner;

public class Cast12 {
	public static void main(String[] args) {

		// Verbindung zur Standard-Eingabe resp.zum Keyboard:
		Scanner eingabe = new Scanner(System.in);

		System.out.print("Geben Sie einen Franken-Betrag an: ");
		double franken = eingabe.nextDouble();
		double rappenDouble = franken * 100;
		int rappenInt = (int) rappenDouble;
		System.out.println("Umgerechnet in Rappen: " + (rappenInt));

	}
}