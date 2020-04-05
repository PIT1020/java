package u33;

import forschungsanstalt.ForschungsAnstalt;

public class WeltraumStaffel {
	
	public U33_Raumschiff [] Raumschiff = new U33_Raumschiff[2];
	public Besatzung_U33 [] Besatzung = new Besatzung_U33[3];
	

	public void addBesatzung(int pNr, String pName1, String pName2, String pName3, int pKommandant) {
		Besatzung[pNr-1] = new Besatzung_U33 (pName1, pName2, pName3, pKommandant);
		
	}

	public void addRaumschiff(int pNr, int pSchiffNr, String pName, int BesatzungsNR,
			ForschungsAnstalt pNameForschungsanstalt) {
		Raumschiff[pNr-1] = new U33_Raumschiff (pSchiffNr, pName,Besatzung[BesatzungsNR-1],pNameForschungsanstalt);
		
	}
	
	public void addRaumschiff(int pNr, int pSchiffNr, String pName, int BesatzungsNR) {
		addRaumschiff(pNr,pSchiffNr, pName,BesatzungsNR,null);
		
	}
	

	public U33_Raumschiff getRaumschiff(int pNr) {
		return Raumschiff[pNr-1];
		
	}

	public Besatzung_U33 getBesatzung(int pNr) {
		return Besatzung[pNr-1];
	}

}
