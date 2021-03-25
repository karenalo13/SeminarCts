package ro.acs.cts.main;

import ro.ase.cts.componente.Categorie;
import ro.ase.cts.componente.CategorieFactory;
import ro.ase.cts.componente.CategoriiMedicamente;

public class main {

	public static CategoriiMedicamente getTipCategorie() {
		return CategoriiMedicamente.raceala;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			CategorieFactory fabrica=new CategorieFactory();
			Categorie body=fabrica.newCategorie(CategoriiMedicamente.body,50);
			Categorie durere=fabrica.newCategorie(CategoriiMedicamente.durere,20);
			System.out.println(durere.toString());
			System.out.println(body.toString()); 
			Categorie categorie = fabrica.newCategorie(getTipCategorie(), 30f);
			System.out.println(categorie.toString());
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
		
	}

}
