package ro.ase.cts.main;

import ro.ase.cts.componente.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa=new Masa("1");
		masa.rezervareMasa();
		masa.rezervareMasa();
		masa.ocupaMasa();
		masa.eliberareMasa();

	}

}
