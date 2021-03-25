package ro.acs.cts.method_factory;

public class FactoryRaceala implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Raceala(pret);
	}

}
