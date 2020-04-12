import java.util.ArrayList;

public class calculate {

	ArrayList<Integer> input = new ArrayList<>();
	private static int baseValueM = 1;
	private static int baseValue;

	public static int Multiplikation(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			baseValueM = baseValueM * input.get(i);
		}
		return baseValueM;
	}

	public static int Addition(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			baseValue = baseValue + input.get(i);
		}
		System.out.print(baseValue);
		return baseValue;
	}

	public static int Subtraktion(ArrayList<Integer> input) {
		int i = 0;
		while (i < input.size()) {
			for (int j = 1; j < input.size(); j++) {
				baseValue = input.get(j-1);
				baseValue = baseValue - input.get(j);
			}
			break;
		}
		return baseValue;
	}

	public static int Division(ArrayList<Integer> input) {
		int i=0;
		while (i < input.size()) {
		for (int j = 0; j < input.size(); j++) {
			baseValue = input.get(j-1);
			baseValue = (baseValue / input.get(j));
		}
		break;
		}
		return baseValue;
	}

}
