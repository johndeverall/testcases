package nz.co.deverall.testcases.springmethodrule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMethodRuleHappiness {

	public static void main(String[] args) { 
		ApplicationContext ctx = SpringApplication.run(SpringMethodRuleHappiness.class, args);
	}
	
}
