package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.readers.ReadAngajati;

public class Main {

		public static void main(String[] args) {
			List<Angajat> listaAngajati;
			try {
				listaAngajati =ReadAngajati.readAngajati("angajati.txt");
				for(Angajat angajat:listaAngajati)
					System.out.println(angajat.toString());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	

}
