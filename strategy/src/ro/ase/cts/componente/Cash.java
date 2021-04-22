package ro.ase.cts.componente;

public class Cash implements ModPlata {

	@Override
	public void plateste(double sumaPlatita) {
		System.out.println("suma "+ sumaPlatita+" a fost platita cash" );
	}

}
