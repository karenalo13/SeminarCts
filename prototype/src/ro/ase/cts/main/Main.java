package ro.ase.cts.main;

import ro.ase.cts.componente.Bilet;
import ro.ase.cts.componente.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client=new Client(30,40,"Mihai");
		Client copie=(Client)client.copiaza();
		System.out.println(client.toString());
		System.out.println(copie.toString());
		
		
		Bilet bilet1=new Bilet(1,"Steaua","Dinamo","25/01/2005");
		
		Bilet bilet2=(Bilet)bilet1.copiaza();
		bilet2.setCod(2);
		
		Bilet bilet3=(Bilet)bilet1.copiaza();
		bilet3.setCod(3);
		
		System.out.println(bilet2.toString());
		System.out.println(bilet3.toString());
		
		
	}

}
