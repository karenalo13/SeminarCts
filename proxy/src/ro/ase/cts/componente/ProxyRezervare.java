package ro.ase.cts.componente;

public class ProxyRezervare implements IRezervare{

	private static final int NR_MINIM_PERSOANE = 4;
	private Rezervare rezervare;

	public ProxyRezervare(Rezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}

	

	@Override
	public void AnuntaRezervare() {
		if(rezervare.getNrPersoane() >= NR_MINIM_PERSOANE) {
			rezervare.AnuntaRezervare();
		} else {
			System.out.println("Persoanele pot veni fizic la restaurant.");
		}
	
	}
	
}
