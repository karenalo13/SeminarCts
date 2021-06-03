package penultimul_seminar.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import penultimul_seminar.grupa.GrupaTest;
import penultimul_seminar.grupa.GrupaTestSetUp;
import penultimul_seminar.grupa.GrupaWithFakeTest;
import penultimul_seminar.grupa.TestCaseDummy;
import penultimul_seminar.grupa.TestCaseGetPromovabilitate;


@RunWith(Suite.class)
@SuiteClasses({GrupaTest.class, GrupaTestSetUp.class, GrupaWithFakeTest.class,
	TestCaseGetPromovabilitate.class, TestCaseDummy.class})
public class SuitaCompleta {
	
}