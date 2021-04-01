package ro.ase.cts.componente;

public class Bilet implements AbstractPrototype{

	private int cod;
	private String echipa1;
	private String echipa2;
	private String data;
	
	
	
	
	public Bilet(int cod, String echipa1, String echipa2, String data) {
		super();
		this.cod = cod;
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.data = data;
	}
	
	
	
	private Bilet() {
		super();
	}



	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	@Override
	public String toString() {
		return "Bilet [cod=" + cod + ", echipa1=" + echipa1 + ", echipa2=" + echipa2 + ", data=" + data + "]";
	}
	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		Bilet copie=new Bilet();
		copie.cod=this.cod;
		copie.data=this.data;
		copie.echipa1=this.echipa1;
		copie.echipa2=this.echipa2;
		return copie;
	}
	
	
	
	
}
