package ro.ase.cts.componente;

public class Client implements AbstractPrototype {

	private int code;
	private int varsta;
	private String nume;
	
	//validare Varsta
	public Client(int code, int varsta, String nume) {
		super();
		this.code = code;
		this.varsta = varsta;
		this.nume = nume;
	}
	

	private Client() {
		super();
	}


	@Override
	public String toString() {
		return "Client [code=" + code + ", varsta=" + varsta + ", nume=" + nume + "]";
	}

	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		Client copie=new Client();
		copie.code=this.code;
		copie.varsta = this.varsta;
		copie.nume = this.nume;
		return copie;
		
		
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public int getVarsta() {
		return varsta;
	}


	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	
	
	

}
