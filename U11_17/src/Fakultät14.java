import java.util.Scanner;

public class Fakultät14 {
	public static void main(String[] args) {

		// Verbindung zur Standard-Eingabe resp.zum Keyboard:
		Scanner eingabe = new Scanner(System.in);

		System.out.print("Zahl");
		int i1 = eingabe.nextInt();
		System.out.println("Fakultät = " + (i1));
		int sum = 1;
		for (int i = 1; i <= i1; i++) {
			if (i < i1) {
				System.out.print(i + " * ");
			} else {
				System.out.print(i);
			}
			sum = sum * i;
		}
		
		
		System.out.print(" = " + sum);
		eingabe.close();
	}
}
