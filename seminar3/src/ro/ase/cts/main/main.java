package ro.ase.cts.main;

import ro.ase.cts.clase.cabinetVeterinar;
import ro.ase.cts.clase.cabinetVeterinarLazy;
import ro.ase.cts.exercitiu.Iad;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		cabinetVeterinar clinica1= cabinetVeterinar.getInstance();
//		cabinetVeterinar clinica2= cabinetVeterinar.getInstance();
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
//		cabinetVeterinarLazy clinica1= cabinetVeterinarLazy.getInstance("ClinicaMea","Matei Basarab",4,4444.4f);
//		cabinetVeterinarLazy clinica2= cabinetVeterinarLazy.getInstance("ClinicaMea2","Mat1ei Basarab",6,41444.4f);
//		clinica1.setAdresa("Bucuresti");
//		clinica2.setBuget(6000.66f);
//		
//		System.out.println(clinica1.toString());
//		System.out.println(clinica2.toString());
		
		
		Iad primulLocInCarePoposim= Iad.getInstance("sus",3000,900.75f);
		Iad zonaFierbinte= Iad.getInstance("mai sus",2000,1755.65f);
		
		System.out.println(zonaFierbinte.toString());
		System.out.println(primulLocInCarePoposim.toString());
		
		primulLocInCarePoposim.setLocatie("In ceruri");
		zonaFierbinte.setTemperaturaMaxima(6666.66f);
		
		System.out.println(zonaFierbinte.toString());
		System.out.println(primulLocInCarePoposim.toString());
		
		
		
	}

}
