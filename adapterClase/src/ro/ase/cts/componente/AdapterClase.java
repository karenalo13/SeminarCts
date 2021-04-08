package ro.ase.cts.componente;

public class AdapterClase extends Leasing implements InterfataCredit {
	
	
	
	
	public AdapterClase() {
		super();
		
	}
@Override
public void acordaCredit(String numeClient, float suma) {
		super.OferaLeasing(numeClient, suma);
	}

}
