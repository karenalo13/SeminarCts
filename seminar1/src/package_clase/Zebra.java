package package_clase;

public class Zebra extends Animal{

	private int numar_dungi;
	
	public Zebra(String nume, float greutate) {
		super(nume, greutate);
		// TODO Auto-generated constructor stub
	}

	public Zebra(String nume, float greutate, int numar_dungi) {
		super(nume, greutate);
		this.numar_dungi = numar_dungi;
	}

	public int getNumar_dungi() {
		return numar_dungi;
	}

	public void setNumar_dungi(int numar_dungi) {
		this.numar_dungi = numar_dungi;
	}
	

}
