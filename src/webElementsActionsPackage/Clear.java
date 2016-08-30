package webElementsActionsPackage ;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Clear extends ExtraStuffActionsTest{
	
	Clear()	{
	}

	public void clear() {
		System.out.println("\nThis testing the method clear!!\n");
		WebDriver harry = new FirefoxDriver();
		harry.get("http://www.google.com");
		WebElement search = harry.findElement(By.name("q"));
		search.sendKeys("This is a test!!! of clear");
		toSleep();
		search.clear();
		toSleep();
		System.out.print("\nYes that box just cleared\n");
		toSleep();
		search.sendKeys("And again!!!!");
		toSleep();
		search.clear();
		harry.quit();
		
		
		
		// TODO Auto-generated constructor stub
	}

}
