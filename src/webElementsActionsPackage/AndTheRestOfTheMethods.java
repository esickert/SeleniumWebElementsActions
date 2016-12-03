package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AndTheRestOfTheMethods extends ExtraStuffActionsTest	{  //this is not really correct 

	public void theRestOfTheMethods()	{
	
		WebDriver eric = new FirefoxDriver();
		eric.get("http://www.google.com");
		
		WebElement search = eric.findElement(By.linkText("Images"));   //this is gmail link
		
		System.out.println("The text on the Images link is: " + search.getText());      // OUTPUT: Gmail
		System.out.println(search.getLocation());  // OUTPUT: (748, 19)
		System.out.println(search.getTagName());   // OUTPUT: "a" refers to anchor but I don't remember what this refers to.
		System.out.println("The Images button is displayed: " + search.isDisplayed());  //returns a boolean OUTPUT: true/false
		System.out.println("The name of the tag for the Images button is: " + search.getTagName());
		System.out.println("Is the Images button link on the webpage:  " + search.isDisplayed());
		System.out.println("Is Images enabled on the google web page?: " + search.isEnabled());
		WebElement find = eric.findElement(By.linkText("Privacy"));		
		System.out.println("Is Privacy button link enabled in google webpage?: " + find.isEnabled());
		

		toSleep(); 
/**
 * below navigates to a test webpage with checkboxes. currently isSelected() return false for this setup. 
 * Not sure is this is correct!! I dont think this works!!!
*/

		eric.navigate().to("https://www.bankofamerica.com/sitemap/state-select.go");
		WebElement discover = eric.findElement(By.id("stateListId"));
		System.out.println("Is the list selected?: " + discover.isSelected());
	
		toSleep();
		eric.quit();   //ok this worked!!!! closed the browser.
	}
}
