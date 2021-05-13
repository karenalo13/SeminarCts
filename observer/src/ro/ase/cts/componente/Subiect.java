package ro.ase.cts.componente;

public interface Subiect {

	void aboneazaClient(Observer observer);
	void dezaboneazaClient(Observer observer);
	void trimiteMesaj(String mesaj);
}
