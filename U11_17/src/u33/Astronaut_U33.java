package u33;

public class Astronaut_U33 {

	private Besatzung_U33 mKommandant;
	private String mName;

	public Astronaut_U33(String pName) {
		mName = pName;
	}

	public void setKommandant(Besatzung_U33 pBesatzung) {
		mKommandant = pBesatzung;

	}

	public void print() {
		System.out.println(mName);
		if (mKommandant != null) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
