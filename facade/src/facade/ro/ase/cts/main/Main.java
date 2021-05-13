package facade.ro.ase.cts.main;

import facade.ro.ase.cts.componente.FacadeInternare;
import facade.ro.ase.cts.componente.Pacient;

public class Main {

	public static void main(String[] args) {
		Pacient pacien1=new Pacient(true,"Frone");
		Pacient pacien2=new Pacient(false,"Fanel");
				
		System.out.println(FacadeInternare.verificaPacient(pacien1));
		System.out.println(FacadeInternare.verificaPacient(pacien2));
		
				
	}
}
