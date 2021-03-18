package ro.ase.cts.clase;

public class cabinetVeterinarLazy {

	private String nume;
	private String adresa;
	private int nrAngajati;
	private float  buget;

		//instanta statica este initializata la mom declararii
	//lazy initialization
		public  static cabinetVeterinarLazy instance=null;

	// trb private
		private cabinetVeterinarLazy(String nume, String adresa, int nrAngajati, float buget) {
			super();
			this.nume = nume;
			this.adresa = adresa;
			this.nrAngajati = nrAngajati;
			this.buget = buget;
		}
		// funtie publica si statica returneaza instanta;
		public static cabinetVeterinarLazy getInstance(String nume, String adresa, int nrAngajati, float buget) {
			if( instance==null)
				instance =new cabinetVeterinarLazy(nume , adresa,nrAngajati, buget);
							
			 return instance;
}
		@Override
		public String toString() {
			return "cabinetVeterinar [nume=" + nume + ", adresa=" + adresa + ", nrAngajati=" + nrAngajati + ", buget="
					+ buget + "]";
		}
		
		
	
}
