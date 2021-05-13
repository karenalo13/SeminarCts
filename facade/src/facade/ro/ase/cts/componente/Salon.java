package facade.ro.ase.cts.componente;

import java.util.ArrayList;
import java.util.List;

public class Salon {
	
	private List<Pat> pat;

	public Salon(int nrPaturi) {
		super();
		setPaturi(nrPaturi);
	}

	private void setPaturi(int nrPaturi) {
		this.pat = new ArrayList<Pat>();
		for(int i=0;i<nrPaturi;i++)
		{
		if(i%2==0) {
			pat.add(new Pat(i+1,true));
		}
		else {
			pat.add(new Pat(i+1,false));
		}
		}
	}
	
	public boolean arePaturiLibere()
	{
		for(int i=0;i<pat.size();i++)
		{
			if(pat.get(i).isLiber()) return true;
		}
		
		return false;
		
	}
	
	
}
