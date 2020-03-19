import java.util.Scanner;

public class VokabelTrainer_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Beginn der Eingabe:");
		// String Vok1 = eingabe.nextLine();
		int columns = 3; //Question:Answer:Number
		int rows = 0;
		final int max = 10; //max Numer of records
		final int min = 1;
		int Vokabeln = 0;
		String input = null;
		boolean end = false;
		String[][] array = new String[max][columns];
		do {
			System.out.println((Vokabeln + 1) + " Vokabel:" + " ");
			input = eingabe.nextLine();
			if (input.length() == 0) {
				end = true;
			} else {
				String[] fields = input.split(":"); //
				array[Vokabeln] = fields;
				Vokabeln++;
				if (Vokabeln == max) {
					end = true;
				}
			}
		} while (!end);
		System.out.println("Ende der Eingabe");
		System.out.println("Beginn des Trainings");
		
		int currentrecord = 0;
		while (Vokabeln > 0) {
			int jump = ((int)(max * Math.random()))+1;
			currentrecord = (currentrecord * jump)% max;
			while (array[currentrecord] == null) {
				currentrecord = currentrecord++ % max;
			}
			
		System.out.print(array[currentrecord][rows]);
		String answer = eingabe.next();
		if (array[currentrecord][min].equals(answer)) {
			System.out.println("OK");
			Vokabeln--;}
			else {System.out.println("NOK");
		}
			}
			
		}

	}
