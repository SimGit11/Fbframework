package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_LoginPage_004 extends BaseClass{
@Test
public void testLogin() throws IOException, InterruptedException
{	AccountLogin al = new AccountLogin(driver);

	logger.info("Providing email");
	al.setEmail(rb.getString("email"));
	logger.info("Provind password");
	al.setPassword(rb.getString("password"));
	logger.info("Clicking on login button");
	al.clickLogin();
	Thread.sleep(1000);
	captureScreen("Account logged in");}
@Test
public void testMarketplacefeature() throws IOException, InterruptedException {
	LoginPage lp = new LoginPage(driver);
	logger.info("searching a value on marketplace");
	lp.searchFacebook(rb.getString("searchValue"));
	Thread.sleep(1000);
	captureScreen("Searched Value");
}
}
