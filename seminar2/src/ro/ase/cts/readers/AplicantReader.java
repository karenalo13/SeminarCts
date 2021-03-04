package ro.ase.cts.readers;
import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
public abstract class AplicantReader {
	private String filename;
	
	public AplicantReader(String filename) {
		super();
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	public abstract List<Aplicant> citesteAplicanti()  throws FileNotFoundException, NumberFormatException  ;

}
