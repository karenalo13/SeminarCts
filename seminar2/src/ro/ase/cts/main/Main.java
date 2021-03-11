package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ReadAngajati;
import ro.ase.cts.readers.ReadStudents;

public class Main {

		public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
			return reader.citesteAplicanti();
			
			
			
		}
	
	
		public static void main(String[] args) {
			List<Aplicant> listaAplicanti;
			try {
				listaAplicanti =citesteAplicanti(new ReadStudents("studenti.txt"));
				for(Aplicant angajat:listaAplicanti)
					System.out.println(angajat.toString());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	

}
