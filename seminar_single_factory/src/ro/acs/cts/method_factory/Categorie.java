package ro.acs.cts.method_factory;

public abstract class Categorie {

	float pretDeBaza;

	public Categorie(float pretDeBaza) {
		super();
		this.pretDeBaza = pretDeBaza;
	}

	

	public float getPretDeBaza() {
		return pretDeBaza;
	}

	public void setPretDeBaza(float pretDeBaza) {
		this.pretDeBaza = pretDeBaza;
	}
	
}
