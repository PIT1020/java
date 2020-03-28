package lessenfeburary_march;

import java.util.ArrayList;

public class Wettbewerb {

	public String getWettbewerb;
	public ArrayList<Sportler> Teilnehmer = new ArrayList<>();
	public ArrayList<Sportler> Siege = new ArrayList<>();
	private Sportler Sieger;

	public Wettbewerb(String Wettbewerbseingabe) {
		getWettbewerb = Wettbewerbseingabe;
	}

	public String getWettbewerbName() {
		return getWettbewerb;
	}

	public void addSportler(Sportler Sport) {
		if (Teilnehmer.contains(Sport)) {
			return;
		}
		Teilnehmer.add(Sport);
		Sport.addWettbewerb(this);
	}

	public Sportler getSieger() {
		return Sieger;
	}

	public boolean setSieger(Sportler mSieger) {

		if (Teilnehmer.contains(mSieger)) {
			Sieger = mSieger;
			Siege.add(Sieger);
			mSieger.addSieg(this);
		}
		;
		return false;
	}

	public void print() {
		System.out.println("Wettbewerb : ");
		System.out.println("Art : " + getWettbewerb);
		System.out.println("Teilnehmer : ");
		for (int i = 0; i < Teilnehmer.size(); i++) {
				System.out.print(Teilnehmer.get(i).getSportlerName());
				if (Teilnehmer.get(i) == Sieger)
					System.out.println(" : SIEGER");
				else {
					System.out.println("");
				}
		}
	}
}
