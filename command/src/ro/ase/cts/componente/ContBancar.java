package ro.ase.cts.componente;

public class ContBancar {

	
	private int sumaCont;
	private String detinator;
	
	
	public ContBancar(String detinator) {
		super();
		this.sumaCont = 0;
		this.detinator = detinator;
	}
	
	public void constituire(int sumaRetrasa) {
		sumaCont=sumaRetrasa;
		System.out.println(" Cont Constituit");
	}
	
	public void retragere(int sumaRetrasa) {
		if(sumaRetrasa> sumaCont) {System.out.println("Nu se poate retrage");
	}
		else {
			sumaCont=sumaCont-sumaRetrasa;
			System.out.println("Suma retrasa");
		}
	}
	
	public void depunere(int sumaDepusa) {
		sumaCont=sumaCont+sumaDepusa;
		System.out.println("Suma depusa");
	}
	
	
}
