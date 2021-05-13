package ro.ase.cts.componente;

public class Client implements Observer {

	private String nume;
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println(nume + " ai primit un mesaj: " +mesaj);
	}

}
