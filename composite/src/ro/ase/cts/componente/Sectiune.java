package ro.ase.cts.componente;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuneMeniu{

	List<IOptiuneMeniu> lista;
	String nume;
	
	public Sectiune(String nume){
		lista=new ArrayList<IOptiuneMeniu>();
		this.nume=nume;
	}

	@Override
	public void stergeNod(IOptiuneMeniu optiune) throws Exception {
		lista.remove(optiune);
		
	}

	@Override
	public void adaugaNod(IOptiuneMeniu optiune) throws Exception {
		lista.add(optiune);
		
	}

	@Override
	public IOptiuneMeniu getNod(int index) throws Exception {
		return lista.get(index);
	}

	@Override
	public void descriere() {
		System.out.println("Categoria "+nume);
		for(IOptiuneMeniu sectiune:lista){
			sectiune.descriere();
		}
		
	}
	
	
}
