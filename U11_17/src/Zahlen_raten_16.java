import java.util.Scanner;

public class Zahlen_raten_16 {

	public static void main(String[] args) {
		boolean ende = false;
		int zufallsVariable = 0;
		int anzahlversuche = 0;
		zufallsVariable = (int) (Math.random() * 101);

		Scanner eingabe = new Scanner(System.in);

		do {
			System.out.print(" Geben Sie eine Zahl ein");
			int Eingabe = eingabe.nextInt();
			anzahlversuche++;
			if (Eingabe == zufallsVariable) {
				System.out.print("Bingo");
				ende = true;
			} else if (Eingabe < zufallsVariable) {
				System.out.print("Sorry, die Zahl ist zu klein");
			} else {
				System.out.print("Sorry, die Zahl ist zu gross");
			}
		} while (!ende);
		eingabe.close();
		System.out.print("Anzahl Versuche = " + anzahlversuche);
	}
}