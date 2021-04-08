package ro.ase.cts.componente;

public class ConcretDecorator extends  AbstractDecorator {

	public ConcretDecorator(ICard iCard) {
		super(iCard);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		System.out.println(super.getiCard().getDetinatorCard() + " plateste contactless");
	}

}
