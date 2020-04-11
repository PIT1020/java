package u32;

import java.util.ArrayList;

public class Sportler {

	public String getSportler;
	private String getSieger;
	public ArrayList<Wettbewerb> Wettbewerbe = new ArrayList<>();
	public ArrayList<Wettbewerb> Siege = new ArrayList<>();
	private Wettbewerb Sieger;

	public Sportler(String Sportlereingabe) {
		getSportler = Sportlereingabe;
	}
	
	public String checkSieger() {
		return getSieger;
	}
	
	public String getSportlerName() {
		return getSportler;
	}
		
	public void addWettbewerb(Wettbewerb einzelneWettbewerbe) {
		Wettbewerbe.add(einzelneWettbewerbe);
		einzelneWettbewerbe.addSportler(this);
	}
	
	public boolean addSieg(Wettbewerb einzelneWettbewerbe) {
		if(Wettbewerbe.contains(einzelneWettbewerbe)) {
			return true;
		}
		if (Wettbewerbe.contains(einzelneWettbewerbe)) {
			Siege.add(Sieger);
			einzelneWettbewerbe.setSieger(this);
			return true;
		}
		;
		return false;
	}
		
	public void print() {
		System.out.println("Sportler : ");
		System.out.println("Name : "+ getSportler);
		System.out.print("Wettbewerbe : ");
		for (int i = 0; i < Wettbewerbe.size(); i++) {
			System.out.print(Wettbewerbe.get(i).getWettbewerbName());		
			if (Wettbewerbe.get(i) == Sieger)
				System.out.println(" : SIEGER");
			else {
				System.out.println("");
			}			
		}
		System.out.println(" Siege: ");
			for (int i = 0; i < Siege.size(); i++) {
			if (i > 0)
			System.out.println(Siege.get(i).getWettbewerbName());
			else {
				System.out.println("");
			}
			
		}
	}
}