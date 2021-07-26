package testclass;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageclass.WebConfig;

public class RunTest implements WebConfig{


	WebConfig testEnvironment;




	@BeforeTest
	@Parameters({"environment"})
	public void beforeTest(String environemnt) {
		ConfigFactory.setProperty("env", environemnt);
		testEnvironment = ConfigFactory.create(WebConfig.class);
	}

	@Test(priority=1)
	public String url() {
		// TODO Auto-generated method stub
		return url();
	}
	
	@Test(priority=2)
	public void sample() {
		System.out.println(url());
	}
}


