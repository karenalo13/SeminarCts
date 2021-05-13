package facade.ro.ase.cts.componente;

public class Pacient {
	private boolean stareGrava;
	private String nume;
	public Pacient(boolean stareGrava, String nume) {
		super();
		this.stareGrava = stareGrava;
		this.nume = nume;
	}
	@Override
	public String toString() {
		return "Pacient [stareGrava=" + stareGrava + ", nume=" + nume + "]";
	}
	public boolean isStareGrava() {
		return stareGrava;
	}
	public String getNume() {
		return nume;
	}
	
	
	
	

}
