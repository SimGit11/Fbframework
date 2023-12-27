package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AccountRegistration extends BasePage {
	
	public AccountRegistration(WebDriver driver) {
		super(driver);
	}
//WebElements
	@FindBy (xpath ="//input[@placeholder='First name']")
	WebElement txtFirstname;
	@FindBy (name="lastname")
	WebElement txtLastname;
	@FindBy (name="reg_email__")
	WebElement txtEmail;
	@FindBy (name ="reg_email_confirmation__")
	WebElement txtreenterEmail;
	@FindBy (name="reg_passwd__")
	WebElement txtPassword;
	@FindBy (xpath ="//select[@title='Month']")
	WebElement dropdownMonth;
	@FindBy (xpath ="//select[@title='Day']")
	WebElement dropdownDay;
	@FindBy (xpath ="//select[@title='Year']")
	WebElement dropdownYear;
	@FindBy (xpath ="//input[@value='1']")
	WebElement bttnFemale;
	@FindBy (xpath ="//input[@value='2']")
	WebElement bttnMale;
	@FindBy (xpath ="//input[@value='-1']")
	WebElement bttnCustom;
	@FindBy (name="websubmit")
	WebElement bttnSignup;
	
	public void setFirstName (String fname) {
	txtFirstname.sendKeys(fname);}
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);}
	public void setEmail (String email) {
		txtEmail.sendKeys(email);}
	public void setReenterEmail (String email) {
		txtreenterEmail.sendKeys(email);}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd); }
	public void setMonth (String month) {
		Select slctmonth= new Select(dropdownMonth);
		slctmonth.selectByVisibleText(month);}
	public void setDay (String day) {
		Select slctday = new Select (dropdownDay);
		slctday.selectByVisibleText(day);}
	public void setYear (String year) {
		Select slctyear= new Select (dropdownYear);
		slctyear.selectByVisibleText(year);}
	public void clickFemale () {
		bttnFemale.click();}
	public void clickMale() {
		bttnMale.click();}
	public void clickCustom() {
		bttnCustom.click();}
	public void clickSignup() {
		bttnSignup.click();}
		

}
	

