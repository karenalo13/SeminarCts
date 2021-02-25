package main;

import package_clase.Girafa;
import package_clase.Zebra;
import package_clase.Zoo;
import package_clase.Zookeeper;

public class Main {

	public static void main(String[] args) {
		
		Zookeeper ingrijitor=new Zookeeper("Costelus");
		Zoo gradina=new Zoo();
		Girafa girafa=new Girafa("Gigi",50);
		Girafa gif=new Girafa("Giga",50,150);
		
		gradina.addAnimal(gif);
		gradina.addAnimal(girafa);
		gradina.feedAllAnimals();
		Zebra zeb=new Zebra("zeb", 50, 50);
		gradina.addAnimal(zeb);
		gradina.feedAllAnimals();
	}

}
