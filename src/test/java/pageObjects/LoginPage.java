package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//WebElements

@FindBy (xpath = "//input [@role= 'combobox']")
WebElement searchFacebook;


public void searchFacebook(String txt)
{searchFacebook.sendKeys(txt);
searchFacebook.sendKeys(Keys.RETURN);}












}
