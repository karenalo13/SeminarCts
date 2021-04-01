package ro.ase.cts.componenteV2;

import ro.ase.cts.componenteV2.Rezervare;

public class RezervareBuilder implements Builder {

	
	private boolean mancare;
	private boolean scaun;
	private boolean muzica;
	private boolean bautura;
	private String genMuzica;
	private int cod;
	
	public RezervareBuilder() {
		super();
		this.mancare = false;
		this.scaun = false;
		this.muzica = false;
		this.bautura = false;
		this.genMuzica = "clasica";
		this.cod = 1;
	}
	
	
	public RezervareBuilder(int cod) {
		super();
		this.mancare = false;
		this.scaun = false;
		this.muzica = false;
		this.bautura = false;
		this.genMuzica = "clasica";
		this.cod = cod;
	}
	
	



	public RezervareBuilder setMancare(boolean mancare) {
		this.mancare = mancare;
		return this;
	}








	public RezervareBuilder setScaun(boolean scaun) {
		this.scaun = scaun;
		return this;
	}


 



	public RezervareBuilder setMuzica(boolean muzica) {
		this.muzica = muzica;
		return this;
	}


 

	public RezervareBuilder setBautura(boolean bautura) {
		this.bautura = bautura;
		return this;
	}

 



	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

 


	public RezervareBuilder setCod(int cod) {
		this.cod = cod;
		return this;
	}




	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(mancare,scaun,muzica,bautura,genMuzica,cod);
		
	}

}
