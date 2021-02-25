package package_clase;

public class Girafa extends Animal{

	

	private float inaltime;

	public Girafa(String nume, float greutate) {
		super(nume, greutate);
		// TODO Auto-generated constructor stub
	}
	

	public Girafa(String nume, float greutate, float inaltime) {
		super(nume, greutate);
		this.inaltime = inaltime;
	}


	public float getInaltime() {
		return inaltime;
	}

	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}

	
	
}
