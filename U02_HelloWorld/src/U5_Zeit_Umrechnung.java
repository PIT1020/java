import java.util.Scanner;

public class U5_Zeit_Umrechnung {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Sekunden : ");
		int i = eingabe.nextInt();
		System.out.println("Sekunden = " + i);		
		
		int d = (i / 86400);
		System.out.println("Tage = " + d);
		
		int n = (i / 3600);
		System.out.println("Stunden = " + n);
		
		int t = (i / 60);
		System.out.println("Tage = " + t);
		
		int s = (i % 60);
		System.out.println("Sekunden = " + s);
		
	    boolean p = (i < 0);
		System.out.println("Good Bye");

	}

}
