package ro.ase.cts.main;

import ro.ase.cts.componente.AdapterObj;
import ro.ase.cts.componente.InterfataCredit;
import ro.ase.cts.componente.Leasing;

public class Main {

	
	
	public static void OferaInfoCredit(InterfataCredit interfataCredit,String nume , Float suma) {
		
		
		interfataCredit.acordaCredit(nume, suma);
	}
	
	
	public static void main(String[] args) {
		Leasing leasing=new Leasing();
		AdapterObj adapter=new AdapterObj(leasing);
		OferaInfoCredit(adapter,"regele",100f);
	}

}
