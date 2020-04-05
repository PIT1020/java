package u33;

public class Besatzung_U33 {

	public Astronaut_U33[] Astronauten = new Astronaut_U33 [3];
	public Astronaut_U33 mKommandant;
	private U33_Raumschiff[] mRaumschiff =new U33_Raumschiff[2];
	private U33_Raumschiff oRaumschiff;
	static final int NummerOfAstronauts = 3;
	

	public Besatzung_U33(String pName1, String pName2, String pName3, int pKommandant) {
		Astronauten [0] = new Astronaut_U33(pName1);
		Astronauten [1] = new Astronaut_U33(pName2);
		Astronauten [2] = new Astronaut_U33(pName3);
		mKommandant =Astronauten[pKommandant-1];
		mKommandant.setKommandant(this);
		
	}
	
	public void linkRaumschiff(U33_Raumschiff pRaumschiff){
		oRaumschiff=pRaumschiff;
	}
	
	public Astronaut_U33 getAstronaut (int pNr) {
		return Astronauten[pNr-1];
	}

	public void print(String string) {
		System.out.println("Besatzung.print()");
		for (int i = 0; i < Astronauten.length; i++) {
			System.out.print("Astronaut " + (i+1)+" "+"  :  "); 
			Astronauten[i].print();
		}

	}

	public void print() {
		print(" ");
		if (oRaumschiff != null) {
			oRaumschiff.print("  ");
		}
	}
}
