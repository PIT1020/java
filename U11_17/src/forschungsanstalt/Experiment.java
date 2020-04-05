package forschungsanstalt;

public class Experiment {
	
	private String mExperimentName;
	
	public Experiment(String pExperimentName) {
		mExperimentName=pExperimentName;
		
	}
	
	public void print() {
		System.out.print(mExperimentName);
		
	}

}
