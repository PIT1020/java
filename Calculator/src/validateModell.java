
public class validateModell {

	static final int Multiplikation =1;
	static final int Division =2;
	static final int Addition =3;
	static final int Subtraktion =4;
	
	
	public static int validate(String methode) {
		if (methode == "Addition") {
			return Addition;
		}
		if (methode == "Multiplikation") {
			return Multiplikation;
		}
		if (methode == "Division") {
			return Division;
		}
		if (methode == "Subtraktion") {
			return Subtraktion;
		}
		else {	
		return 0;
		}
		
	}

}
