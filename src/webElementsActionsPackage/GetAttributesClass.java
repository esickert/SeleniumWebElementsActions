package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.Date;

public class GetAttributesClass {
	// TODO Auto-generated constructor stub
	Date date = new Date();
	
	public void getAttributes(WebDriver driver1)	{
	
	driver1.get("http://www.google.com");
		System.out.println(date + " Successfully opened Google");

		WebElement searchButton = driver1.findElement(By.name("btnK"));
		System.out.println("The name of the button is: " + searchButton.getAttribute("name"));
		System.out.println("The name of the value is: " + searchButton.getAttribute("value"));
		System.out.println("The name of the aira-label is: " + searchButton.getAttribute("aria-label"));
		/**
		 *  NOTE: this uses equals and NOT ==, this is VERY IMPORTANT
		 */
		 		if ((((searchButton.getAttribute("value")).equals("Google Searc"))))
			System.out.println("The attributes are equal = true");
		else 
			System.out.println("The attributes are equal = f**king false");
	}
	

}


