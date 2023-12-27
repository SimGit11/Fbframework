package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ResourceBundle rb;
	public static WebDriver driver;
	public Logger logger;
	@BeforeClass
	public void setup()
	{
		rb= ResourceBundle.getBundle("config");
		logger = (Logger) LogManager.getLogger(this.getClass());
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("appUrl"));   // remote App URL
		driver.manage().window().maximize();
	}
	public String randomeString()
{
	String generatedString=RandomStringUtils.randomAlphabetic(5);
	return generatedString;
}

public String randomeNumber()
{
	String generatedString=RandomStringUtils.randomNumeric(10);
	return generatedString;
}

public String randomAlphaNumeric()
{
	String str=RandomStringUtils.randomAlphabetic(3);
	String num=RandomStringUtils.randomNumeric(3);
	
	return (str+"@"+num);
}
public String captureScreen(String tname) throws IOException {
	
	/*SimpleDateFormat sd=	new SimpleDateFormat("yyyyMMddhhmmss");
	Date dt=new Date();
	sd.format(dt);*/

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
	
	
	FileUtils.copyFile(source, new File(destination));
	
	return destination;

}
@AfterClass
public void tearDown()
{	driver.close();
}
}
