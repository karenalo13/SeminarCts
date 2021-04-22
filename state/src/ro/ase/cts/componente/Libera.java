package ro.ase.cts.componente;

public class Libera implements StareMasa {

	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof Libera ))
		{
			System.out.println("Masa cu nr "+masa.getNume()+" a fost eliberata");
			masa.setStareMasa(this);
			
		}
		else
		{
			System.out.println("Masa este deja libera");
		}
		
	}

}
