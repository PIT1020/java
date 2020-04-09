import java.util.ArrayList;

public class calculate {

	ArrayList<Integer> input = new ArrayList<>();
	private static int baseValueM = 1;
	private static int baseValue;

	public static void Multiplikation(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			baseValueM = baseValueM * input.get(i);
		}
		System.out.print(baseValueM);
	}

	public static void Addition(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			baseValue = baseValue + input.get(i);
		}
		System.out.print(baseValue);
	}

	public static void Subtraktion(ArrayList<Integer> input) {
		int i = 0;
		while (i < input.size()) {
			for (int j = 1; j < input.size(); j++) {
				baseValue = input.get(j-1);
				baseValue = baseValue - input.get(j);
			}
			break;
		}
		System.out.print(baseValue);
	}

	public static void Division(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			baseValue = input.get(i) / baseValue;
		}
		System.out.print(baseValue);
	}

}
