package ro.ase.cts.exercitiu;

import ro.ase.cts.clase.cabinetVeterinarLazy;

public class Iad {

	
	 private String locatie;
	 private int nrAngajati;
	 private float temperaturaMaxima;
	 
	 private  static Iad instance=null;

	private Iad(String locatie, int nrAngajati, float temperaturaMaxima) {
		super();
		this.locatie = locatie;
		this.nrAngajati = nrAngajati;
		this.temperaturaMaxima = temperaturaMaxima;
	}
	 
	public static synchronized Iad getInstance(String locatie, int nrAngajati, float temperaturaMaxima) {
		if( instance==null)
			instance =new Iad(locatie , nrAngajati,temperaturaMaxima);
						
		 return instance;
	}

	@Override
	public String toString() {
		return "Iad [locatie=" + locatie + ", nrAngajati=" + nrAngajati + ", temperaturaMaxima=" + temperaturaMaxima
				+ "]";
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public int getNrAngajati() {
		return nrAngajati;
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public float getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(float temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

		
	
}
