package ro.ase.cts.componente;

public class CategorieFactory {

	public Categorie newCategorie(CategoriiMedicamente categoriiMedicamente,float pret)  throws Exception{
		switch(categoriiMedicamente) {
			case raceala:
				return new Raceala(pret);
			case body:
				return new Body(pret);
			case durere:
				return new Durere(pret);
		default:
			throw new Exception("ceva naspa"); 
				
		
			}
		}
}
