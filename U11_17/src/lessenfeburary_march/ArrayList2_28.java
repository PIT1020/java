package lessenfeburary_march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayList2_28 {

	public static void main(String[] args) {
		// ein einfaches Array ohne Features
		String[] charlist = { "A", "B", "C", "D", "E", "F", "G", "H" };
		int[] counter = new int [charlist.length];
		// generiere eine Liste mit mehreren Features
		List<String> unusedChars =  new LinkedList<String>(Arrays.asList(charlist));
		
		//System.out.print(unusedChars);
		int[] charlength = new int[charlist.length];
		ArrayList<String> arraylist = new ArrayList<String>();
		final int maxwordlength = 3;
		int count = 0;
		Random random = new Random();
		boolean complete = false;

		while (unusedChars.size() > 0) {
			// Gefäss um Buchstaben und verstauen
			StringBuilder sb = new StringBuilder();
			// Zufällige Zahl zwischen 1 und 7
			int wordLength = random.nextInt(maxwordlength) + 1;
			// Loop über die Länge 1-3 der Buchstaben
			for (int i = 0; i < wordLength; i++) {
				int indexOfChar = random.nextInt(charlist.length);
				// index bekann counter hoczaehlen fuer richtigen index
				// Beziehe ich einen Char und nenne diesen c
				String c = charlist[indexOfChar];
				counter[indexOfChar] = counter[indexOfChar]+1;
				// hier entferne ich aus dem String den zufälligen Buchstaben
				unusedChars.remove(c);
				// Füge ich dem String einen Buchstaben
				sb.append(c);
			}
			// Füge die Buchstaben zur ArrayList hinzu
			arraylist.add(sb.toString());
		} System.out.println("Word-List :"+arraylist);
		for (int i = 0; i < charlist.length; i++) {
			System.out.print(charlist[i]+ counter[i]+" ");
			
		} 
		Collections.sort(arraylist);
		System.out.println("");
		System.out.print("Sorted List:"+arraylist);
	} 

}