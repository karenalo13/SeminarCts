package ro.ase.cts.componente;

public class Rezervata implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if( masa.getStareMasa() instanceof Libera) {
			System.out.println("Masa a fost rezervata " +masa.getNume());
			masa.setStareMasa(new Rezervata());
		}
		else {
			System.out.println("Actiune imposibil de realizat");
		}
		
	}

}
