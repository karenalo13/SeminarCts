package ro.ase.cts.componente;

public class Masa {
	private StareMasa stareMasa;
	private String nume;
	
	
	
	public Masa(String nume) {
		super();
		this.nume = nume;
		this.stareMasa=new Libera();
	}



	public StareMasa getStareMasa() {
		return stareMasa;
	}



	public void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}



	public String getNume() {
		return nume;
	}



	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	public void rezervareMasa()
	{
		modificaStareMasa(new Ocupata());
		
	}
	
	public void eliberareMasa()
	{
		Libera libera=new Libera();
		 libera.modificaStare(this);
	}
	
	public void ocupaMasa()
	{
		Ocupata ocupata=new Ocupata();
		ocupata.modificaStare(this);
	}
	
	public void modificaStareMasa(StareMasa stare) {
		stare.modificaStare(this);
		
	}

}
