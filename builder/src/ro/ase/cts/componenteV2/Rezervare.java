package ro.ase.cts.componenteV2;

public class Rezervare {

	private boolean mancare;
	private boolean scaun;
	private boolean muzica;
	private boolean bautura;
	private String genMuzica;
	private int cod;
	
	
	
	public Rezervare(boolean mancare, boolean scaun, boolean muzica, boolean bautura, String genMuzica, int cod) {
		super();
		this.mancare = mancare;
		this.scaun = scaun;
		this.muzica = muzica;
		this.bautura = bautura;
		this.genMuzica = genMuzica;
		this.cod = cod;
	}



	public boolean isMancare() {
		return mancare;
	}



	public void setMancare(boolean mancare) {
		this.mancare = mancare;
	}



	public boolean isScaun() {
		return scaun;
	}



	public void setScaun(boolean scaun) {
		this.scaun = scaun;
	}



	public boolean isMuzica() {
		return muzica;
	}



	public void setMuzica(boolean muzica) {
		this.muzica = muzica;
	}



	public boolean isBautura() {
		return bautura;
	}



	public void setBautura(boolean bautura) {
		this.bautura = bautura;
	}



	public String getGenMuzica() {
		return genMuzica;
	}



	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}



	public int getCod() {
		return cod;
	}



	public void setCod(int cod) {
		this.cod = cod;
	}



	@Override
	public String toString() {
		return "Rezervare [mancare=" + mancare + ", scaun=" + scaun + ", muzica=" + muzica + ", bautura=" + bautura
				+ ", genMuzica=" + genMuzica + ", cod=" + cod + "]";
	}
	
	
}
