package ro.ase.cts.componente;

public class Constituire extends Command {

	public Constituire(ContBancar cont, int suma) {
		super(cont,suma);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void executa() {
		super.getCont().constituire(super.getSuma());
		
	}

}
