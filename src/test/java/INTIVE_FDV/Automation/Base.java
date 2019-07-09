package INTIVE_FDV.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import PageObjects.IntivePageObjects;

public class Base {
	
	protected ChromeOptions options = new ChromeOptions();
	protected WebDriver driver = new ChromeDriver(options.addArguments("--start-maximized"));
	protected SoftAssert softAssert = new SoftAssert();
	protected WebDriverWait wait = new WebDriverWait(driver, 20);
	protected long TInicio = System.currentTimeMillis();
	protected IntivePageObjects intivePage;
	
	@BeforeTest
	public void Before() {
		driver.get("http://exercises.fdvs.com.ar/semisenior.html");		
		intivePage = new IntivePageObjects(driver);
	}	
	
	@AfterTest
	public void tearDown() {		
		driver.close();		
	}
}
