package ro.ase.cts.v2Componente;

public class Masa {
		private int nrMasa;
		private Stare stare;
		public Masa(int nrMasa) {
			super();
			this.nrMasa = nrMasa;
			this.stare=new Libera();
		}
		
		
		public void rezervaMasa()
		{
			if(stare instanceof Libera)
			{
				stare=new Rezervata();
				stare.afisareDescriere();
			}
		}
		
		public void elibereazaMasa()
		{
			if(!(stare instanceof Libera))
			{
				stare=new Libera();
				stare.afisareDescriere();
			}
		}
		
		public void ocupaMasa()
		{
			if(!(stare instanceof Ocupata))
			{
				stare=new Ocupata();
				stare.afisareDescriere();
			}
		}
		
		
		
		
		
		
}
