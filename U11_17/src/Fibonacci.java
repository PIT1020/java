
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// Verbindung zur Standard-Eingabe resp.zum Keyboard:
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Anzahl der zu berechnenden Fibonacci Zahl");
		int i1 = eingabe.nextInt();
		System.out.println("Eingabewert = " + (i1));
		int num1 = 1, num2 = 1;
		for (int i = 1; i <= i1; i++) {
			System.out.print(num1 + " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		eingabe.close();
	}
}
