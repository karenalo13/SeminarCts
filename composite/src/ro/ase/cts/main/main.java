package ro.ase.cts.main;

import ro.ase.cts.componente.Element;
import ro.ase.cts.componente.IOptiuneMeniu;
import ro.ase.cts.componente.Sectiune;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IOptiuneMeniu meniu = new Sectiune("Meniu restaurant");
		IOptiuneMeniu optiune1 = new Sectiune("Bauturi");
		IOptiuneMeniu optiune2 = new Sectiune("Desert");
		
		IOptiuneMeniu item1 = new Element("Frappe");
		IOptiuneMeniu item2 = new Element("Apa plata");
		IOptiuneMeniu item3 = new Element("Papanasi");
		try {
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			
			optiune2.adaugaNod(item3);
			
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			meniu.descriere();
			
			optiune1.stergeNod(item1);
			optiune2.adaugaNod(item1);
			
			meniu.descriere();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
