package ro.ase.cts.main;

import ro.ase.cts.componente.Spectator;
import ro.ase.cts.componente.SpectatorAbstract;
import ro.ase.cts.componente.SpectatorPeluza;

public class Main {

	public static void main(String[] args) {
		SpectatorAbstract spec=new Spectator();
		spec.intrareaSpectatoruluiPeStadion();
		
		SpectatorAbstract peluza=new SpectatorPeluza();
		peluza.intrareaSpectatoruluiPeStadion();
	}

}
