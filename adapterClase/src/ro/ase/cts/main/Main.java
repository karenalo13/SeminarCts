package ro.ase.cts.main;

import ro.ase.cts.componente.AdapterClase;
import ro.ase.cts.componente.InterfataCredit;

public class Main {

	
	
	public static void OferaInfoCredit(InterfataCredit interfataCredit,String nume , Float suma) {
		
		
		interfataCredit.acordaCredit(nume, suma);
	}
	
	
	public static void main(String[] args) {
		
		AdapterClase adapter=new AdapterClase();
		OferaInfoCredit(adapter,"regele",100f);
	}

}
