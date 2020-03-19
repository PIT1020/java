package lessenfeburary_march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylist1_28 {

	public static void printListe(ArrayList<int[]> liste) {
		
		for (int i = 0; i < liste.size(); i++) {
			System.out.println();
			int arr [] = liste.get(i);
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}

		}
		}

	
	
	public static void fuelleListe(ArrayList<int[]> liste, int zahl) {
		int laenge = 0;
		for (int i = 0; i < zahl; i++) {
			laenge = laenge + i + 1;
			liste.add(new int [laenge]);
			
			int arr[] = liste.get(i);
			for (int j = 0; j < laenge; j++) {
				arr[j] = i+1;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Zahl:");
		Scanner eingabe = new Scanner(System.in);
		boolean ende = true;
		int zahl = eingabe.nextInt();
		eingabe.close();
		ArrayList<int[]> reihen = new ArrayList<int[]>();
		if (zahl <= 0 || zahl > 9) {
			System.out.println("Zahl:" + zahl);
			System.out.println("ENDE");
			ende = true;
		} else {
			fuelleListe(reihen,zahl);
			printListe(reihen);
		}
	}

}
