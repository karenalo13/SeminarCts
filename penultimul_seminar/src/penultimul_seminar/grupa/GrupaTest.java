package penultimul_seminar.grupa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import penultimul_seminar.clase.Grupa;
import penultimul_seminar.clase.Student;

public class GrupaTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void constructorTest() {
		Grupa g=new Grupa(1005);
		assertEquals(1005,g.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimInf() {
		Grupa g=new Grupa(1000);
		assertEquals(1000,g.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimSup() {
		Grupa g=new Grupa(1100);
		assertEquals(1100,g.getNrGrupa());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testConstructorPosibilaEroare() {
		Grupa g=new Grupa(900);
		assertEquals(900,g.getNrGrupa());
	}
	@Test(timeout = 1000)
	public void performantaTest() {
		Grupa grupa = new Grupa(1050);
	}
	
	@Test
	public void testListaWrite() {
		Grupa g=new Grupa(1004);
		for(int i=0;i<10;i++) {
			
			Student stud=new Student();
			stud.adaugaNota(i+1);
			g.adaugaStudent(stud);
		}
		assertEquals(0.6,g.getPromovabilitate(),.01f);
		
		
		
	}
	
	
	@Test
	public void testListaLimInf() {
		Grupa g=new Grupa(1004);
		for(int i=0;i<10;i++) {
			
			Student stud=new Student();
			stud.adaugaNota(3);
			g.adaugaStudent(stud);
		}
		assertEquals(0f,g.getPromovabilitate(),.01f);
		
	}
	@Test
	public void testListaLimSup() {
		Grupa g=new Grupa(1004);
		for(int i=0;i<10;i++) {
			
			Student stud=new Student();
			stud.adaugaNota(7);
			g.adaugaStudent(stud);
		}
		assertEquals(1f,g.getPromovabilitate(),.01f);
		
	}
	
	@Test
	public void testBoundPromovabilitate()
	{
		Grupa g=new Grupa(1010);
		assertEquals(0f,g.getPromovabilitate(),.001f);
	}
	@Test
	public void CardinalitiPromovabilitateTest() {
		Grupa g=new Grupa(1004);
		Student stud=new Student();
		stud.adaugaNota(7);
		g.adaugaStudent(stud);
		assertEquals(1f,g.getPromovabilitate(),.01f);
		
	}

	
}
