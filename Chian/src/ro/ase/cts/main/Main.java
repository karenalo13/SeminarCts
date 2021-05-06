package ro.ase.cts.main;

import ro.ase.cts.componente.Cont;
import ro.ase.cts.componente.ContCredit;
import ro.ase.cts.componente.ContCurent;
import ro.ase.cts.componente.ContEconomii;
import ro.ase.cts.componente.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cont contCurent = new ContCurent(1500, "Madalin", null );
		Cont contEconomii = new ContEconomii(2500, "Madalin", null);
		Cont contCredit = new ContCredit(3200, "Madalin", null);
		Cont contIndisponibil = new ContIndisponibil("Madalin");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(500);
		contCurent.plateste(2000);
		contCurent.plateste(3500);
	
		
		
	
	}

}
