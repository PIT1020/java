package forschungsanstalt;

public class ForschungsAnstalt {

	private String mNameForschungsAnstalt;
	private String mExperimentName;
	private int mExperimentNummer;
	public Experiment [] Experimente = new Experiment[10];
	
	public void setupExperiment(int pExperimentNummer, String pExperimentName) {
		Experimente[pExperimentNummer-1] = new Experiment(pExperimentName);
		
	}
	
	public ForschungsAnstalt(String pNameForschungsAnstalt) {
		mNameForschungsAnstalt = pNameForschungsAnstalt;
		
	}

	public void print() {
		
	}

}
