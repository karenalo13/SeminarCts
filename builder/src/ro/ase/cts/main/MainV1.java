package ro.ase.cts.main;

import ro.ase.cts.componenteV1.Rezervare;
import ro.ase.cts.componenteV1.RezervareBuilder;

public class MainV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	Rezervare rezervare1=new RezervareBuilder().setBautura(true).setCod(4).build();
	Rezervare rezervare2=new RezervareBuilder().setMancare(true).setCod(7).build();
	
	System.out.println(rezervare1.toString());
	System.out.println(rezervare2.toString());
	}

}
