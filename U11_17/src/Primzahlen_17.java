import java.util.Scanner;

public class Primzahlen_17 {
	public static void main(String[] args) {

		Scanner eingabe = new Scanner(System.in);
		System.out.print("Untere Grenze");
		int u = eingabe.nextInt();
		System.out.print("Obere Grenze");
		int o = eingabe.nextInt();
		for (int i = 2; i < o; i++) {
			boolean isPrimezahl = true;
			for (int j = 2; j < i && isPrimezahl; j++) {
				if ((i % j) == 0) {
					isPrimezahl = false;
				}
			}
			if (isPrimezahl && i >= u) {
				System.out.print(i + " ");
			}
		}
		eingabe.close();
	}
}
