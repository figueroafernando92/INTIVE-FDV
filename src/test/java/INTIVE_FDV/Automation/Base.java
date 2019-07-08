package INTIVE_FDV.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Base {
	
	protected ChromeOptions options = new ChromeOptions();
	protected WebDriver driver = new ChromeDriver(options.addArguments("--start-maximized"));
	protected SoftAssert softAssert = new SoftAssert();
	protected WebDriverWait wait = new WebDriverWait(driver, 20);
	protected long TInicio = System.currentTimeMillis();

	protected WebElement inputAnswer1;
	protected WebElement inputAnswer4;
	protected WebElement inputAnswer6;
	protected WebElement inputAnswer8;
	protected WebElement inputAnswer9;
	protected WebElement inputAnswer10;
	protected WebElement inputAnswer11;
	protected WebElement inputName;
	protected Select selectOcupations;
	protected WebElement linkWait;
	protected WebElement buttonSubmit;
	protected WebElement buttonCheckResults;
	protected List<WebElement> listBlackBox;
	protected WebElement textName, textOccupation, textLink, textPosition;
	protected WebElement elementRedBox, elementOrangeBox, elementGreenBox, elementPurpleBox;
	protected List<WebElement> listIAmHere;
	@BeforeTest
	public void Before() {
		driver.get("http://exercises.fdvs.com.ar/semisenior.html");
		
		inputAnswer1 = driver.findElement(By.id("answer1"));
		inputAnswer4 = driver.findElement(By.id("answer4"));
		inputAnswer6 = driver.findElement(By.id("answer6"));
		inputAnswer8 = driver.findElement(By.id("answer8"));
		inputAnswer9 = driver.findElement(By.id("answer9"));
		inputAnswer10 = driver.findElement(By.id("answer10"));
		inputAnswer11 = driver.findElement(By.id("answer11"));
		inputName = driver.findElement(By.id("name"));
		selectOcupations = new Select(driver.findElement(By.id("occupation")));
		listBlackBox = driver.findElements(By.className("blackbox"));
		linkWait = driver.findElement(By.linkText("Wait"));
		buttonSubmit = driver.findElement(By.id("submitbutton"));
		buttonCheckResults = driver.findElement(By.id("checkresults"));
		textName = driver.findElements(By.tagName("li")).get(1).findElement(By.tagName("b"));
		textOccupation = driver.findElements(By.tagName("li")).get(2).findElement(By.tagName("b"));
		textLink = driver.findElements(By.tagName("li")).get(4).findElement(By.tagName("b"));
		textPosition = driver.findElements(By.tagName("li")).get(6).findElement(By.tagName("b"));
		elementRedBox = driver.findElement(By.id("redbox"));
		elementOrangeBox = driver.findElement(By.id("orangebox"));
		elementGreenBox = driver.findElement(By.id("greenbox"));
		elementPurpleBox = driver.findElement(By.id("purplebox"));
		listIAmHere = driver.findElements(By.id("IAmHere"));
		
	}
	
	
	@AfterTest
	public void tearDown() {		
		driver.close();		
	}
}
