package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IntivePageObjects {

	public WebDriver driver;
	
	public WebElement inputAnswer1;
	public WebElement inputAnswer4;
	public WebElement inputAnswer6;
	public WebElement inputAnswer8;
	public WebElement inputAnswer9;
	public WebElement inputAnswer10;
	public WebElement inputAnswer11;
	public WebElement inputName;
	public Select selectOcupations;
	public WebElement linkWait;
	public WebElement buttonSubmit;
	public WebElement buttonCheckResults;
	public List<WebElement> listBlackBox;
	public WebElement textName, textOccupation, textLink, textPosition;
	public WebElement elementRedBox, elementOrangeBox, elementGreenBox, elementPurpleBox;
	public List<WebElement> listIAmHere;
	
	public IntivePageObjects(WebDriver driver){
		this.driver=driver;
		
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
}
