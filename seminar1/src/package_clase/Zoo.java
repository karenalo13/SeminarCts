package package_clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> lista_animale=null;
	private Zookeeper ingrijitor;
	
	public Zoo(List<Animal> lista_animale, Zookeeper ingrijitor) {
		super();
		this.lista_animale = lista_animale;
		this.ingrijitor = ingrijitor;
	}
	public Zoo() {
		super();
		lista_animale=new ArrayList<Animal>();
		ingrijitor=new Zookeeper("Gigi");
	}

	
	
	public List<Animal> getLista_animale() {
		return lista_animale;
	}



	public void setLista_animale(List<Animal> lista_animale) {
		this.lista_animale = lista_animale;
	}



	public Zookeeper getIngrijitor() {
		return ingrijitor;
	}



	public void setIngrijitor(Zookeeper ingrijitor) {
		this.ingrijitor = ingrijitor;
	}

	public void addAnimal(Animal a) {
		lista_animale.add(a);
	}

	public void feedAllAnimals() {
		for(Animal a :lista_animale) {
			ingrijitor.feed(a);
		}
	}
}
