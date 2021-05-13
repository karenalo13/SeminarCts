package ro.ase.cts.main;

import ro.ase.cts.componente.Client;
import ro.ase.cts.componente.Sala;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client clientPopescu = new Client("Popescu");
		Client clientVasilescu = new Client("Vasilescu");
		Client clientIonescu = new Client("Ionescu");
		
		Sala sala = new Sala("Sala sportiva");
		
		sala.aboneazaClient(clientIonescu);
		sala.aboneazaClient(clientVasilescu);
		sala.aboneazaClient(clientPopescu);
		sala.anuntaMeciFotbal();
		sala.dezaboneazaClient(clientIonescu);
		sala.anuntaMeciVolei();
	}

}
