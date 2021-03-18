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
		public static synchronized cabinetVeterinarLazy getInstance(String nume, String adresa, int nrAngajati, float buget) {
			if( instance==null)
				instance =new cabinetVeterinarLazy(nume , adresa,nrAngajati, buget);
							
			 return instance;
}
		@Override
		public String toString() {
			return "cabinetVeterinar [nume=" + nume + ", adresa=" + adresa + ", nrAngajati=" + nrAngajati + ", buget="
					+ buget + "]";
		}
		public String getNume() {
			return nume;
		}
		public void setNume(String nume) {
			this.nume = nume;
		}
		public String getAdresa() {
			return adresa;
		}
		public void setAdresa(String adresa) {
			this.adresa = adresa;
		}
		public int getNrAngajati() {
			return nrAngajati;
		}
		public void setNrAngajati(int nrAngajati) {
			this.nrAngajati = nrAngajati;
		}
		public float getBuget() {
			return buget;
		}
		public void setBuget(float buget) {
			this.buget = buget;
		}
		public static cabinetVeterinarLazy getInstance() {
			return instance;
		}
		public static void setInstance(cabinetVeterinarLazy instance) {
			cabinetVeterinarLazy.instance = instance;
		}
		
		
		
		
	
}
