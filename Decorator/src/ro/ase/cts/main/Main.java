package ro.ase.cts.main;

import ro.ase.cts.componente.AbstractDecorator;
import ro.ase.cts.componente.Card;
import ro.ase.cts.componente.ConcretDecorator;
import ro.ase.cts.componente.ICard;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICard card = new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decorator = new ConcretDecorator(card);
		decorator.platesteContactless();
		
	}

}
