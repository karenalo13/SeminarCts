package ro.acs.cts.main;

import ro.acs.cts.method_factory.FactoryCategorie;
import ro.acs.cts.method_factory.FactoryDurere;
import ro.acs.cts.method_factory.FactoryGripa;
import ro.acs.cts.method_factory.Categorie;
import ro.acs.cts.method_factory.FactoryBody;

public class main_factoryMethod {

	public static FactoryCategorie getTipFactory() {
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie,float pret) {
		Categorie categorie=factoryCategorie.createCategorie(pret);
		System.out.println(categorie.toString());
	}
	
	public static void main(String[] args) {
		printeazaCategorie(getTipFactory(), 30);

	}

}
