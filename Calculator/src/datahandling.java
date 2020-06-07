import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class datahandling {

	public static ArrayList<Integer> input = new ArrayList<>();

	public static ArrayList<Integer> readCsv(ArrayList<Integer> input) throws IOException {
		String row;
		BufferedReader csvReader = new BufferedReader(new FileReader("/home/peer/Desktop/Testfile.csv"));
		while ((row = csvReader.readLine()) != null) {
			String[] data = row.split(";");
			int size = data.length;
		    int [] NumbersOfCsv = new int [size];
		    for(int i=0; i<size; i++) {
		         NumbersOfCsv[i] = Integer.parseInt(data[i]);
		         input.add(NumbersOfCsv[i]);
		    }
		}
		csvReader.close();
		return input;
	}

}
