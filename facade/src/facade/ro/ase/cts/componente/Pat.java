package facade.ro.ase.cts.componente;

public class Pat {
	private int numar;
	private boolean liber;
	public Pat(int numar, boolean liber) {
		super();
		this.numar = numar;
		this.liber = liber;
	}
	public int getNumar() {
		return numar;
	}
	public boolean isLiber() {
		return liber;
	}
	public void setLiber(boolean liber) {
		this.liber = liber;
	}
	
	
}
