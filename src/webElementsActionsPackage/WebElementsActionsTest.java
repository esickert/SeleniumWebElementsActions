package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Date;

public class WebElementsActionsTest  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		
		WebDriver driver1 = new FirefoxDriver();		
		GetAttributes tom = new GetAttributes();
		SendKeys dick = new SendKeys();
		
		tom.getAttributes(driver1);
//		dick.Sendkeys();
		
		System.out.println("Th..tha..that's all folks!");
	}

}
