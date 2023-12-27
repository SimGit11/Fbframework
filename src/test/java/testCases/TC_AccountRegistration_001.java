package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistration_001 extends BaseClass {
	@Test
	public void testAccountRegistration() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		
		hp.clickCreateAccount();
		
		Thread.sleep(3000);
		
		AccountRegistration ac= new AccountRegistration(driver);
		ac.setFirstName("Sim");
		ac.setLastName("Singh");
		ac.setEmail("Simsingh@gmail.com");
		ac.setPassword("11sspap");
		ac.setMonth("Nov");
		ac.setDay("10");
		ac.setYear("1995");
		ac.clickMale();
		ac.clickSignup();
		
	}
}

