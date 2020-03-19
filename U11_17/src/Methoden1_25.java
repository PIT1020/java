import java.util.Arrays;
import java.util.Scanner;

public class Methoden1_25 {
	
	public static int gross (int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max)
				max = arr[i];
			}
		return max;
}


	public static void main(String[] args) {
		//Scanner eingabe = new Scanner(System.in);
		int [] arr = {1,2,3};
		int groessteZahl = gross(arr);
		System.out.println(groessteZahl);
		
}}
