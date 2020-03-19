import java.util.Scanner;

public class U4_Rechnen {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("1.Ganze Zahl");
		int i = eingabe.nextInt();
		System.out.println("1.Ganze Zahl="+i);
		
		System.out.println("2.Ganze Zahl");
		int d = eingabe.nextInt();
		System.out.println("2.Ganze Zahl="+d);

		int s = (i+d);
		System.out.println("Summe="+s);
		
		int diff = (i-d);
		System.out.println("Differenz="+diff);
		
		int p = (i*d);
		System.out.println("Produkt="+p);
		
		int q = (i/d);
		System.out.println("Quotient="+q);
		
		int r = (i%d);
		System.out.println("Rest="+r);
		
		
		System.out.println("1.Gleitkommazahl");
		double di = eingabe.nextDouble();
		System.out.println("1.Gleitkommazahl="+di);
		
		System.out.println("2.Gleitkommazahl");
		double dd = eingabe.nextDouble();
		System.out.println("2.Gleitkommazahl="+dd);

		double ds = (di+dd);
		System.out.println("Summe="+ds);
		
		double ddiff = (di-dd);
		System.out.println("Differenz="+ddiff);
		
		double dp = (di*dd);
		System.out.println("Produkt="+dp);
		
		double dq = (di/dd);
		System.out.println("Quotient="+dq);
		
		double dr = (di%dd);
		System.out.println("Rest="+dr);
		
		
	}

}
