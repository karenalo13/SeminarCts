package penultimul_seminar.grupa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import penultimul_seminar.clase.Grupa;
import penultimul_seminar.clase.Student;

public class GrupaTestSetUp {
	Grupa grupa ;
	@Before
	public void setUp() throws Exception {
		 grupa = new Grupa(1050);
			for(int i=0;i<35;i++) {
				
				Student stud=new Student();
				stud.adaugaNota(7);
				grupa.adaugaStudent(stud);
			}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 1000)
	public void performantaTestPromovabilitate() {
		
		grupa.getPromovabilitate();
	}
	
	
}
