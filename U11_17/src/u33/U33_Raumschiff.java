package u33;

import forschungsanstalt.Experiment;
import forschungsanstalt.ForschungsAnstalt;

public class U33_Raumschiff {

	private int mRaumschiff;
	private int mExperimentNummer;
	private String mName;
	private Besatzung_U33 mBesatzung;
	private ForschungsAnstalt mNameForschungsanstalt;

	public U33_Raumschiff(int pRaumschiff, String pName, Besatzung_U33 pBesatzung, 
			ForschungsAnstalt pNameForschungsAnstalt) {
		mRaumschiff = pRaumschiff;
		mName = pName;
		mBesatzung=pBesatzung;
		mBesatzung.linkRaumschiff(this);
		mNameForschungsanstalt = pNameForschungsAnstalt;		
	}

	public void print() {
		print("");
		mBesatzung.print("  ");
	}
	
	public void print(String string) {

		System.out.println("Raumschiff.print()");
		System.out.println("Nummer  :  " + mRaumschiff);
		System.out.println("Name    :  " + mName);
	}
	
	void printForschungsschiff(String string) {
		System.out.print("Experimente des Forschungsschiffes:");
		for (int i = 0; i < Besatzung_U33.NummerOfAstronauts; i++) {
			mBesatzung.getAstronaut(i+1).printExperimente
		}
		mNameForschungsanstalt.print();
		
	}
	
	

	public Experiment linkAstronautExperiment(int mExperimentNummer, int mBesatzung) {
		mBesatzung= mExperimentNummer;
		return null;
		
	}

}
