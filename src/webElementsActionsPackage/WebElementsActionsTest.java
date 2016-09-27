package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WebElementsActionsTest  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Date date = new Date();
		
		
//		WebDriver driver1 = new FirefoxDriver();		
//		GetAttributes tom = new GetAttributes();
//		SendKeys dick = new SendKeys();
//		Clear harry = new Clear();
		Submit steve = new Submit();
		GetCssValue samantha = new GetCssValue();
		
		
				
//		tom.getAttributes(driver1);
//		dick.Sendkeys();
//		harry.clear();
		steve.UseSubmit();
		samantha.getCssValue();
		
		System.out.println("Tha..that's all folks!");
	}

}
