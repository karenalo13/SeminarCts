package ro.ase.cts.componente;

public class Ocupata implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof Ocupata))
		{
			masa.setStareMasa(this);
			System.out.println("Masa cu numarul "+masa.getNume()+  " s-a ocupat");
		}
		else
		{
			System.out.println("Masa este ocupata");
		}
		
	}

}
