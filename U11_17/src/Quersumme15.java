import java.util.Scanner;

public class Quersumme15 {
	public static void main(String[]args) {

		// Verbindung zur Standard-Eingabe resp.zum Keyboard:
				Scanner eingabe = new Scanner(System.in);
				
				int z1 = eingabe.nextInt();
				int q = 0;
				int z2 = z1;
				while (0 != z2) {
					q = q +(z2 % 10);
					z2 = z2 /10;
				}
				System.out.println(z1 + "=" + q);
	}
}
