package ro.ase.cts.componente;

public abstract class Command {
	
	private ContBancar cont;
	private int suma;
	
	
	public Command(ContBancar cont,int suma) {
		super();
		this.cont = cont;
		this.suma=suma;
		
	}


	public int getSuma() {
		return suma;
	}



	public abstract void executa();



	public ContBancar getCont() {
		return cont;
	}
	
	

}
