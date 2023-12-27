package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
public HomePage(WebDriver driver) {
		super(driver);
	}

//Elements 
@FindBy (xpath = "//a[@rel='async']")
 WebElement lnkRegister;
@FindBy (name = "login")
 WebElement lnklogin;

public void clickCreateAccount()
	{;
	//lnkRegister.click()
	Actions act = new Actions (driver);
	act.moveToElement(lnkRegister).click().perform();
}
public void clicklogin()
{
	Actions act = new Actions (driver);
	act.moveToElement(lnklogin).click().perform(); }

}
