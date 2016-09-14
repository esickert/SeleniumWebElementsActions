package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetCssValue extends ExtraStuffActionsTest {
// used to validate css styles that are applied to WebElements thru test scripts.
	public void getCssValue()	{

	WebDriver erich = new FirefoxDriver();
	erich.get("http://www.google.com");
	toSleep();
	WebElement search = erich.findElement(By.name("q"));
	System.out.println(search.getCssValue("background-color"));
	toSleep();
	erich.quit();
	
	}
	

	

}
