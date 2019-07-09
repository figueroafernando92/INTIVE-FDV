package INTIVE_FDV.Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise extends Base {		
	
	@Test (priority=1)
	public void Step1() {	
		String pageTitle = intivePage.GetTitle();
		intivePage.WriteAnswer1(pageTitle);
	}
	
	@Test (priority=2)
	public void Step2() {		
		String name = intivePage.GetName();
		intivePage.WriteName(name);
	}
	
	@Test (priority=3)
	public void Step3() {		
		String occupation = intivePage.GetOccupation();
		intivePage.SelectOcupation(occupation);

	}

	@Test (priority=4)
	public void Step4() {		
		int count = intivePage.GetBlackBoxes().size();
		intivePage.WriteAnswer4(String.valueOf(count));

	}

	@Test (priority=5)
	public void Step5() {		
		String link = intivePage.GetTextLink();
		intivePage.FindLink(link).click();
	}

	@Test (priority=6)
	public void Step6() {		
		String classRedBox = intivePage.GetRedBox().getAttribute("className");
		intivePage.WriteAnswer6(classRedBox);	

	}	

	@Test (priority=7)
	public void Step7() {		
		String position = intivePage.GetTextPosition();
		intivePage.FindRadioButton(position).click();

	}
	
	@Test (priority=8)
	public void Step8() {	
		String text = intivePage.GetTextRedBox();
		intivePage.WriteAnswer8(text);	

	}

	@Test (priority=9)
	public void Step9() {	
		Point posOrange = intivePage.GetOrangeBox().getLocation();
		Point posGreen = intivePage.GetGreenBox().getLocation();
		String color;
		if ( posOrange.getY() > posGreen.getY() ) {
			color = "green";
		}
		else {
			color = "orange";
		}
		intivePage.WriteAnswer9(color);		
	}

	@Test (priority=10)
	public void Step10() {	
		int element = intivePage.GetCountIAmHere();
		if (element == 1) {
			intivePage.WriteAnswer10("YES");
		}
		else {
			intivePage.WriteAnswer10("NO");
		}		

	}

	@Test (priority=11)
	public void Step11() {	
		boolean displayed = intivePage.GetPurpleBox().isDisplayed();
		if (displayed) {
			intivePage.WriteAnswer11("YES");
		}
		else {
			intivePage.WriteAnswer11("NO");
		}
	}

	@Test (priority=12)
	public void Step12() {			
		intivePage.ClickOnLinkWait();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Click After Wait"))).click();
	}

	@Test (priority=13)
	public void Step13() {	
		intivePage.ConfirmAlert();
	}

	@Test (priority=14)
	public void Step14() {	
		intivePage.ClickOnButtonSubmit();
	}
	
	@Test (priority=15)
	public void Verify() {	
		String state;
		intivePage.ClickOnButtonCheckResults();
		for(int i= 0; i < 14 ; i++) {
			state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ok_"+String.valueOf(i+1)))).getAttribute("className");	
			
			if(state.contentEquals("ok fail")) {
				Assert.fail("Some test is failed");
			}			
		}

	}	
	
}
