package ro.ase.cts.main;

import ro.ase.cts.componente.Command;
import ro.ase.cts.componente.Constituire;
import ro.ase.cts.componente.ContBancar;
import ro.ase.cts.componente.Depunere;
import ro.ase.cts.componente.ManagerComenzi;
import ro.ase.cts.componente.Retragere;

public class Main {

	public static void main(String[] args) {
 
		
		
		ManagerComenzi manager= new ManagerComenzi();
		ContBancar cont=new ContBancar("Gigi");
		manager.invoca(new Constituire(cont, 50));
		manager.invoca(new Depunere(cont, 50));
		manager.invoca(new Depunere(cont, 50));
		manager.invoca(new Retragere(cont, 50));
		manager.executaComanda();
		manager.executaComanda();
		manager.executaComanda();
		manager.executaComanda();
	}

}
