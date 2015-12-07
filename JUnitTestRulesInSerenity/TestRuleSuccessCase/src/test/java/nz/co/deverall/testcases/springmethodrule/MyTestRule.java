package nz.co.deverall.testcases.springmethodrule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class MyTestRule implements TestRule {
	
	@Override
	public Statement apply(Statement base, Description description) {
		System.out.println("Applied simple test rule!");
		return base;
	}
	
}
 