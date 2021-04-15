package ro.ase.cts.componente;

public class Element implements IOptiuneMeniu{
private String nume;
	
	public Element(String nume){
		this.nume=nume;
	}

	@Override
	public void stergeNod(IOptiuneMeniu optiune) throws Exception {
		throw new Exception("NU este implementata");
		
	}

	@Override
	public void adaugaNod(IOptiuneMeniu optiune) throws Exception {
		throw new Exception("NU este implementata");
		
	}

	@Override
	public IOptiuneMeniu getNod(int index) throws Exception {
		throw new Exception("NU este implementata");
	}

	@Override
	public void descriere() {
		System.out.println("   Item: " + nume);
		
	}
	
	
}
