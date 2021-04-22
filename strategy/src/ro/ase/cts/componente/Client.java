package ro.ase.cts.componente;

public class Client {

	private ModPlata modPlata;
	private String nume;
	
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata=new Cash();
	}


	public ModPlata getModPlata() {
		return modPlata;
	}


	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteNota(double suma) {
		System.out.println(this.nume+" plateste nota");
		this.modPlata.plateste(suma);

	}
}
