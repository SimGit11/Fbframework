package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountLogin extends BasePage {

	public AccountLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//Elements
	@FindBy (name = "email")
	WebElement txtEmail;
	@FindBy (xpath = "//input [@type = 'password']")
	WebElement txtPassword;
	@FindBy (name = "login")
	WebElement bttnLogin;
	
public void setEmail(String email) 
{   txtEmail.sendKeys(email); }
public void setPassword(String passwrd)
{txtPassword.sendKeys(passwrd);}

public void clickLogin()
{	Actions act = new Actions (driver);
	act.moveToElement(bttnLogin).click().perform();
}
}