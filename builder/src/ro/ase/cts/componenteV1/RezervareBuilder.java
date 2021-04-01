package ro.ase.cts.componenteV1;

public class RezervareBuilder implements Builder {

	
	private Rezervare instanta;
	
	public RezervareBuilder(){
		instanta=new Rezervare(false,false,false ,false ,"gen",1);
	}
	public RezervareBuilder(int cod){
		instanta=new Rezervare(false,false,false ,false ,"gen",cod);
	}
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return instanta;
	}
	
	

	public RezervareBuilder setMancare(boolean mancare) {
		this.instanta.setMancare(mancare) ;
		return this;
	}




	public RezervareBuilder setScaun(boolean scaun) {
		this.instanta.setScaun(scaun) ;
		return this;
	}


	public RezervareBuilder setMuzica(boolean muzica) {
		this.instanta.setMuzica(muzica) ;
		return this;
	}



	public RezervareBuilder setBautura(boolean bautura) {
		this.instanta.setBautura(bautura) ;
		return this;
	}



	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.instanta.setGenMuzica(genMuzica) ;
		return this;
	}





	public RezervareBuilder setCod(int cod) {
		this.instanta.setCod(cod) ;
		return this;
	}


}
