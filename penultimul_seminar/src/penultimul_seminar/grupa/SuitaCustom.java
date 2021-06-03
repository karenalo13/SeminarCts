package penultimul_seminar.grupa;

import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import penultimul_seminar.suite.categorii.TesteGetPromovabilitate;
import penultimul_seminar.suite.categorii.TesteNormale;



@RunWith(Categories.class)
@SuiteClasses({ GrupaTest.class, GrupaTestSetUp.class, GrupaWithFakeTest.class, TestCaseDummy.class,
		TestCaseGetPromovabilitate.class })
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {
	
}