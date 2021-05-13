package ro.ase.cts.componente;

public class SpectatorPeluza extends SpectatorAbstract{

	@Override
	public void asezareLaCoada() {
		System.out.println("spectatorul de peluza s-a asezat la coada");
	}

	@Override
	public void prezintaBilet() {
		System.out.println("spectatorul de peluza a prezentat biletul");
	}

	

	@Override
	public void intrarePeStadion() {
		System.out.println("spectatorul a intrat in peluza");
	}

	@Override
	public void ocupareLoc() {
		System.out.println("spectatorul de peluza a ocupat un loc");		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("spectatorul de peluza a fost controlat");
	}
}

