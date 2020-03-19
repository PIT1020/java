
import java.util.Scanner;

public class U03_StdIN {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Ein String : ");
		String str = eingabe.next();
		System.out.println("Ein String = " + str);		
		
		System.out.println("Ganze Zahl : ");
		int i = eingabe.nextInt();
		System.out.println("Zahl = " + i);
		
		System.out.println("Gleitkomma-Zahl : ");
		double d = eingabe.nextDouble();
		System.out.println("Zahl = " + d);
		
		System.out.println("Ende.");
		eingabe.close();

	}
	
}