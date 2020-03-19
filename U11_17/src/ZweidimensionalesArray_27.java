import java.util.Arrays;
import java.util.Scanner;

public class ZweidimensionalesArray_27 {

	public static int printArray(int[][] zweiarray) {

		int ret = 100;
		Scanner eingabe = new Scanner(System.in);
		int zahl = 0;
		for (int i = 0; i < zweiarray.length; i++) {
			for (int j = 0; j < zweiarray[i].length; j++) {
				zahl = eingabe.nextInt();
				zweiarray[i][j] = zahl;
			}
		}
		eingabe.close();
		ret = 1;
		return ret;
	}

	public static int transponieren(int[][] tarray) {

		int ret = 101;
		for (int i = 0; i < tarray.length; i++) {
			for (int j = i+1; j < tarray[i].length; j++) {
				int temp = tarray[i][j];
				tarray[i][j] = tarray[j][i];
				tarray[j][i] = temp;
			} 
		}
		ret = 2;
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[4][4];
		printArray(array);
		System.out.println("Ausgabe");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		transponieren(array);
		System.out.println("Transponierte Matrix");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
