package ro.ase.cts.componente;

public class Retragere extends Command{

	public Retragere(ContBancar cont,int suma) {
		super(cont,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().retragere(super.getSuma());
		
	}

}
