package ro.ase.cts.main;

import ro.ase.cts.componenteV2.Rezervare;
import ro.ase.cts.componenteV2.RezervareBuilder;

public class MainV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RezervareBuilder builder=new RezervareBuilder();
		builder.setBautura(true);
		builder.setCod(2);
		
		Rezervare rezervare1=builder.build();
		
		
		builder.setBautura(false).setCod(5).setMancare(true);
		
		
		Rezervare rezervare2=builder.build();
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
	}

}
