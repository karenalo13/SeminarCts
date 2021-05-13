package facade.ro.ase.cts.componente;

public class Medic {
	private String nume;
	private String specializare;
	public Medic(String nume, String specializare) {
		super();
		this.nume = nume;
		this.specializare = specializare;
	}
	
	public boolean internabil(Pacient pacient) {
		
			return pacient.isStareGrava();
	
	}
	
	
	
	
	
	
}
