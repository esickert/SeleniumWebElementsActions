package webElementsActionsPackage;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;

public class Submit extends ExtraStuffActionsTest {
	
	public Submit()	{
	}
	
	public void UseSubmit()	{
		System.out.println("This uses the submit method");
	 
		WebDriver sam = new FirefoxDriver();
		sam.get("http://www.google.com");
		toSleep();
		WebElement erich = sam.findElement(By.className("gsfi"));
		toSleep();
		erich.sendKeys("This is testing submit");     //this is a webElement
		toSleep();
		erich.submit();
		toSleep();
		sam.quit();
	}
	
	
	
}
