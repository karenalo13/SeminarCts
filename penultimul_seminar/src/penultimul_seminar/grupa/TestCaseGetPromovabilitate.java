package penultimul_seminar.grupa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import penultimul_seminar.clase.Grupa;
import penultimul_seminar.clase.IStudent;

public class TestCaseGetPromovabilitate {
	private IStudent studentStub= new StudentStub();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Grupa grupa = new Grupa(1010);
		grupa.adaugaStudent(studentStub);
		
		assertEquals(1,grupa.getPromovabilitate(), 0.01f);
	}
}
