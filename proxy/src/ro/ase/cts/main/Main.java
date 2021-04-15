package ro.ase.cts.main;

import ro.ase.cts.componente.IRezervare;
import ro.ase.cts.componente.ProxyRezervare;
import ro.ase.cts.componente.Rezervare;

public class Main {

	public static void main(String[] args) {
		IRezervare rezervare = new Rezervare(3, 2);
		rezervare.AnuntaRezervare();

		ProxyRezervare proxy = new ProxyRezervare((Rezervare) rezervare);
		proxy.AnuntaRezervare();
		
		((Rezervare)rezervare).setNrPersoane(4);
		proxy.AnuntaRezervare();

	}

}
