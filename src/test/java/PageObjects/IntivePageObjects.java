package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IntivePageObjects {

	public WebDriver driver;
	
	private WebElement inputAnswer1, inputAnswer4, inputAnswer6, inputAnswer8, inputAnswer9;
	private WebElement inputAnswer10, inputAnswer11, inputName;
	private Select selectOcupations;
	private WebElement linkWait;
	private WebElement buttonSubmit, buttonCheckResults;
	private List<WebElement> listBlackBox, listIAmHere;
	private WebElement textName, textOccupation, textLink, textPosition;
	private WebElement elementRedBox, elementOrangeBox, elementGreenBox, elementPurpleBox;

	
	public IntivePageObjects(WebDriver driver){
		this.driver = driver;		
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

	public void WriteAnswer1(String pageTitle) {
		inputAnswer1.sendKeys(pageTitle);		
	}

	public String GetTitle() {
		 return driver.getTitle();
	}

	public String GetName() {		
		return textName.getText();
	}

	public void WriteName(String name) {
		inputName.sendKeys(name);
	}

	public String GetOccupation() {
		return textOccupation.getText();
	}

	public void SelectOcupation(String occupation) {
		selectOcupations.selectByVisibleText(occupation);
	}

	public List<WebElement>  GetBlackBoxes() {
		return listBlackBox;
	}

	public void WriteAnswer4(String count) {
		inputAnswer4.sendKeys(count);
	}

	public String GetTextLink() {
		return textLink.getText();
	}

	public WebElement FindLink(String link) {
		return driver.findElement(By.linkText(link));
	}

	public WebElement GetRedBox() {
		return elementRedBox;
	}

	public void WriteAnswer6(String classRedBox) {
		inputAnswer6.sendKeys(classRedBox);
	}

	public String GetTextPosition() {
		return textPosition.getText();
	}

	public WebElement FindRadioButton(String position) {
		return driver.findElement(By.xpath("//input[@value='"+position+"']"));
	}

	public String GetTextRedBox() {
		return elementRedBox.getText();
	}

	public void WriteAnswer8(String text) {
		inputAnswer8.sendKeys(text);		
	}

	public WebElement GetOrangeBox() {
		return elementOrangeBox;
	}

	public WebElement GetGreenBox() {
		return elementGreenBox;
	}

	public void WriteAnswer9(String color) {
		inputAnswer9.sendKeys(color);		
	}

	public int GetCountIAmHere() {
		return listIAmHere.size();
	}

	public void WriteAnswer10(String string) {
		inputAnswer10.sendKeys(string);	
	}

	public void WriteAnswer11(String string) {
		inputAnswer11.sendKeys(string);			
	}

	public WebElement GetPurpleBox() {
		return elementPurpleBox;
	}

	public void ClickOnLinkWait() {
		linkWait.click();		
	}

	public void ConfirmAlert() {
		driver.switchTo().alert().accept();		
	}

	public void ClickOnButtonSubmit() {
		buttonSubmit.click();	
	}

	public void ClickOnButtonCheckResults() {
		buttonCheckResults.click();		
	}
	
	
}
