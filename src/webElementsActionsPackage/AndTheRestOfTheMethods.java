package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AndTheRestOfTheMethods extends ExtraStuffActionsTest	{

	public void theRestOfTheMethods()	{
	
		WebDriver erich = new FirefoxDriver();
		erich.get("http://www.google.com");
		
		WebElement search = erich.findElement(By.className("gb_P")); 
		System.out.println(search.getText());      // OUTPUT: Gmail
		System.out.println(search.getLocation());  // OUTPUT: (748, 19)
		System.out.println(search.getTagName());   // OUTPUT: "a" refers to anchor but I don't remember what this refers to.
		System.out.println(search.isDisplayed());  //returns a boolean OUTPUT: true/false
		
		toSleep();
		
	}
		
}
