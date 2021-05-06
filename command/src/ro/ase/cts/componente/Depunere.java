package ro.ase.cts.componente;

public class Depunere extends Command{

	public Depunere(ContBancar cont,int suma) {
		super(cont,suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		super.getCont().depunere(super.getSuma());		
	}

}
