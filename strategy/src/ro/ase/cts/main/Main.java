package ro.ase.cts.main;

import ro.ase.cts.componente.Card;
import ro.ase.cts.componente.Cash;
import ro.ase.cts.componente.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Client client= new Client("Gigi");
			
			client.setModPlata(new Cash());
			client.platesteNota(20);
			
			client.setModPlata(new Card(200));
			client.platesteNota(100);

			client.platesteNota(300);
	}

}
