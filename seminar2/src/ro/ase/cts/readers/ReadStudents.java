package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class ReadStudents extends AplicantReader {

	public ReadStudents(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> citesteAplicanti() throws FileNotFoundException, NumberFormatException  {
		Scanner input = new Scanner(new File(super.getFilename()));
		input.useDelimiter(",|\n");
		List<Aplicant> aplicanti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			String nume = input.next();
			String prenume = (input.next()).toString();
			int varsta = Integer.valueOf(input.nextInt());
			int punctaj = Integer.valueOf(input.nextInt());
			int nr = Integer.valueOf(input.nextInt());
			String[] vect = new String[5];
			for (int i = 0; i < nr; i++)
				vect[i] = input.next();
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
			aplicanti.add(s);
		}
		input.close();
		return aplicanti;
	}
	
}
