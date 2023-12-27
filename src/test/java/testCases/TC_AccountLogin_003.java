package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import testBase.BaseClass;

public class TC_AccountLogin_003 extends BaseClass {

	@Test
	public void testlogin() {
		
		AccountLogin al = new AccountLogin(driver);
		al.setEmail("simsingh485@gmail.com");
		al.setPassword("Letmein1++");
		al.clickLogin();
	}

}
