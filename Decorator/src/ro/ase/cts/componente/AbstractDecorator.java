package ro.ase.cts.componente;

public abstract  class AbstractDecorator implements ICard{
	private ICard iCard;

	public AbstractDecorator(ICard iCard) {
		super();
		this.iCard = iCard;
	}

	@Override
	public void platesteFizic() {
		this.iCard.platesteFizic();
		
	}

	@Override
	public void platesteOnline() {
		this.iCard.platesteOnline();
		
	}
	
	public abstract void platesteContactless();

	@Override
	public String getDetinatorCard() {
		return iCard.getDetinatorCard();
	}

	public ICard getiCard() {
		return iCard;
	}

	public void setiCard(ICard iCard) {
		this.iCard = iCard;
	}
	
	
	
	
}
