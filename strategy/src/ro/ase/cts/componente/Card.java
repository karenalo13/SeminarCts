package ro.ase.cts.componente;

public class Card implements ModPlata {
private double portofel;

public Card(double portofel) {
	super();
	this.portofel = portofel;
}

@Override
public void plateste(double sumaPlatita) {
	if(portofel>=sumaPlatita)
		System.out.println("suma "+sumaPlatita+" a fost platita cu cardul");
	else System.out.println("fonduri insuficiente");
	
}


}
