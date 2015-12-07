package net.serenitybdd.demos.acceptance;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.demos.calculator.CalculatorApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/calculator")
@SpringApplicationConfiguration(CalculatorApp.class)
public class CalculateResults {
	
	@Rule
	public final SpringMethodRule springMethodRule = new SpringMethodRule();
	
	@Rule
	public final MyTestRule myTestRule = new MyTestRule();
	
	@ClassRule
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();
	
	private static int count = 0;
	
	@BeforeClass
	public static void beforeClass() { 
		count++;
	}
	
	@Before
	public void thisShouldRunBeforeEachMethod() { 
		count++;
	}
	
	@Test
	public void instantiates() { 
		assertTrue(true);
	}
	
	@Test
	public void secondTest() { 
		assertTrue(true);
	}
	
	@AfterClass()
	public static void test() { 
		// Should be 3. One for the @BeforeClass and twice for the @Before run before the two unit tests.
		assertEquals(3, count); 
	}
	
}
