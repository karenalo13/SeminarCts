package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pachet.Student;

public class StudentTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorNumeCorect() {
		String nume="Vasile";
		Student stud=new Student(nume);
		assertEquals(nume,stud.getNume());
	}
	
	@Test
	public void testVerificareAddNota() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test
	public void testDimensiuneListaCorecta() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
		
	}
	
	@Test
	public void testMedie() {
		Student student=new Student();
		int nota=8;
		student.adaugaNota(nota);
		assertEquals(8f,student.calculeazaMedie(),0.001f);
		
	}
	
	@Test
	public void testMedieMultipleNote() {
		Student student=new Student();
		int nota=8;
		int nota2=9;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertEquals(8.5f,student.calculeazaMedie(),0.001f);
		
	}
	
	
	@Test
	public void testMedieFaraNote() {
		Student student=new Student();
		assertEquals(0f,student.calculeazaMedie(),0.001f);
		
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void testVerificaGetNota() {
		Student student=new Student();
		int nota=8;
		int nota2=9;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		assertEquals(nota,student.getNota(-1)) ;
		
	}
	
	
	
	@Test 
	public void testVerificaGetNotaJU3() {
		Student student=new Student();
		int nota=8;
		
		student.adaugaNota(nota);
		
		try { int s=student.getNota(-1) ;
		fail("Aici nu trebuie sa ajungem");}
			catch(IndexOutOfBoundsException eroare) {
				
			}
		
		
	}
	
	
	
	

}
