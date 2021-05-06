package ro.ase.cts.componente;


public class ContCredit extends Cont{

	public ContCredit(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() >=  suma) {
			System.out.println(super.getNumeClient() + " a realiza plata de " +  suma + " din contul de credit");
		}
		else {
			super.getSuccesor().plateste(suma);
		}
	}
}
