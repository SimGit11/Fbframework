package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistration_002 extends BaseClass {

	@Test
	public void testAccountRegistration1() throws InterruptedException {
	HomePage hp = new HomePage(driver);
	hp.clickCreateAccount();
	
	
	AccountRegistration ac = new AccountRegistration (driver);
	ac.setFirstName(randomeString().toUpperCase());
	ac.setLastName(randomeString().toUpperCase());
	ac.setEmail(randomeString()+"@gmail.com");

	ac.setPassword(randomAlphaNumeric());
	ac.setMonth("Jan");
	ac.setDay("11");
	ac.setYear("1995");
	ac.clickMale();
	ac.clickSignup();
	
	Thread.sleep(2000);

}
	}
