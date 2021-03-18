package ro.ase.cts.main;

import ro.ase.cts.clase.cabinetVeterinar;
import ro.ase.cts.clase.cabinetVeterinarLazy;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		cabinetVeterinar clinica1= cabinetVeterinar.getInstance();
//		cabinetVeterinar clinica2= cabinetVeterinar.getInstance();
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		cabinetVeterinarLazy clinica1= cabinetVeterinarLazy.getInstance("ClinicaMea","Matei Basarab",4,4444.4f);
		cabinetVeterinarLazy clinica2= cabinetVeterinarLazy.getInstance("ClinicaMea2","Mat1ei Basarab",6,41444.4f);
		clinica1.setAdresa("Bucuresti");
		clinica2.setBuget(6000.66f);
		
		System.out.println(clinica1.toString());
		System.out.println(clinica2.toString());
	}

}
