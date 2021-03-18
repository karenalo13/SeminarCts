package ro.ase.cts.clase;

public class cabinetVeterinar {
private String nume;
private String adresa;
private int nrAngajati;
private float  buget;

	//instanta statica este initializata la mom declararii
//eager initialization
	public final static cabinetVeterinar instance=new cabinetVeterinar("VetZOO" , "Matei Basarab" , 4 , 3400.2f);

// trb private
	private cabinetVeterinar(String nume, String adresa, int nrAngajati, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrAngajati = nrAngajati;
		this.buget = buget;
	}
	// funtie publica si statica returneaza instanta;
	public static cabinetVeterinar getInstance() {
		return instance;
	}
	@Override
	public String toString() {
		return "cabinetVeterinar [nume=" + nume + ", adresa=" + adresa + ", nrAngajati=" + nrAngajati + ", buget="
				+ buget + "]";
	}
	
	
	
	
}
