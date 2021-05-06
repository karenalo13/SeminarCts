package ro.ase.cts.componente;


public class ContEconomii extends Cont{

	public ContEconomii(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold() >=  suma) {
			System.out.println(super.getNumeClient() + " a realiza plata de " +  suma + " din contul de economii");
		}
		else {
			super.getSuccesor().plateste(suma);
		}
	}
}