package ro.ase.cts.componente;

public class AdapterObj implements InterfataCredit{

	
	private Leasing leasing;
	public AdapterObj(Leasing leasing) {
		this.leasing=leasing;
	}
	@Override
	public void acordaCredit(String numeClient, float suma) {
		leasing.OferaLeasing(numeClient, suma);
		
		
	}
	
}
