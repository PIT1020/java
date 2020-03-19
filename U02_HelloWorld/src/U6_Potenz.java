import java.util.Scanner;

public class U6_Potenz {

	public static void main(String[] args) {
		
Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Basis");
		double b = eingabe.nextInt();
		System.out.println("Basis="+b);
		boolean p = (b < 0);
		System.out.println("Good Bye");
		
		System.out.println("Komponent");
		double k = eingabe.nextInt();
		System.out.println("Komponent="+k);
		
		double d = Math.pow(b, k);
		System.out.println("2^3 ="+d);


	}

}
