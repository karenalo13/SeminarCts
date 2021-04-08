package ro.ase.cts.componente;

public class Card implements ICard {
  String detinatorCard;

public Card(String detinatorCard) {
	super();
	this.detinatorCard = detinatorCard;
}

@Override
public void platesteFizic() {
	System.out.println(this.detinatorCard+" a platit fizic");
	
}

@Override
public void platesteOnline() {
	// TODO Auto-generated method stub
	System.out.println(this.detinatorCard+" a platit online");
}

public String getDetinatorCard() {
	return detinatorCard;
}

public void setDetinatorCard(String detinatorCard) {
	this.detinatorCard = detinatorCard;
}
  
}
