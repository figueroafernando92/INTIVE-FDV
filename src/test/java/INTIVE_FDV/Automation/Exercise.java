package INTIVE_FDV.Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise extends Base {	
	
	@Test (priority=1)
	public void Step1() {	
		String pageTitle;
		pageTitle = driver.getTitle();
		inputAnswer1.sendKeys(pageTitle);
	}
	
	@Test (priority=2)
	public void Step2() {		
		String name = textName.getText();
		inputName.sendKeys(name);
	}
	
	@Test (priority=3)
	public void Step3() {		
		String occupation = textOccupation.getText();
		selectOcupations.selectByVisibleText(occupation);

	}

	@Test (priority=4)
	public void Step4() {		
		int count = listBlackBox.size();
		inputAnswer4.sendKeys(String.valueOf(count));

	}

	@Test (priority=5)
	public void Step5() {		
		String link = textLink.getText();
		driver.findElement(By.linkText(link)).click();
	}

	@Test (priority=6)
	public void Step6() {		
		String classRedBox = elementRedBox.getAttribute("className");
		inputAnswer6.sendKeys(classRedBox);	

	}	

	@Test (priority=7)
	public void Step7() {		
		String position = textPosition.getText();
		driver.findElement(By.xpath("//input[@value='"+position+"']")).click();

	}
	
	@Test (priority=8)
	public void Step8() {	
		String text = elementRedBox.getText();
		inputAnswer8.sendKeys(text);	

	}

	@Test (priority=9)
	public void Step9() {	
		Point posOrange = elementOrangeBox.getLocation();
		Point posGreen = elementGreenBox.getLocation();
		String color;
		if ( posOrange.getY() > posGreen.getY() ) {
			color = "green";
		}
		else {
			color = "orange";
		}
		inputAnswer9.sendKeys(color);		
	}

	@Test (priority=10)
	public void Step10() {	
		int element = listIAmHere.size();
		if (element == 1) {
			inputAnswer10.sendKeys("YES");
		}
		else {
			inputAnswer10.sendKeys("NO");
		}		

	}

	@Test (priority=11)
	public void Step11() {	
		boolean displayed = elementPurpleBox.isDisplayed();
		if (displayed) {
			inputAnswer11.sendKeys("YES");
		}
		else {
			inputAnswer11.sendKeys("NO");
		}
	}

	@Test (priority=12)
	public void Step12() {			
		linkWait.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Click After Wait"))).click();
	}

	@Test (priority=13)
	public void Step13() {	
		driver.switchTo().alert().accept();
	}

	@Test (priority=14)
	public void Step14() {	
		buttonSubmit.click();
	}
	
	@Test (priority=15)
	public void Verify() {	
		String state;
		buttonCheckResults.click();
		for(int i= 0; i < 14 ; i++) {
			state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ok_"+String.valueOf(i+1)))).getAttribute("className");	
			
			if(state.contentEquals("ok fail")) {
				Assert.fail("Some test is failed");
			}			
		}

	}	
	
}
