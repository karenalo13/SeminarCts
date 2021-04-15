package ro.ase.cts.componente;

public interface IOptiuneMeniu {
	void stergeNod(IOptiuneMeniu optiune) throws Exception;
	void adaugaNod(IOptiuneMeniu optiune) throws Exception;
	IOptiuneMeniu getNod(int index) throws Exception;
	void descriere();	
}
