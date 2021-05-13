package ro.ase.cts.componente;

public abstract class SpectatorAbstract {

	public abstract void asezareLaCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlCorporal();
	public abstract 	void intrarePeStadion();
	public abstract void ocupareLoc();
	
	public final void intrareaSpectatoruluiPeStadion() {
		asezareLaCoada();
		prezintaBilet();
		realizareControlCorporal();
		intrarePeStadion();
		ocupareLoc();
	}
	
}
