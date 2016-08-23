package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.*;

public class GetAttributes extends ExtraStuffActionsTest{
	// TODO Auto-generated constructor stub
	Date date = new Date();
	
	public void getAttributes(WebDriver driver1)	{
	
	driver1.get("http://www.google.com");
		System.out.println(date + " Successfully opened Google");
		toSleep();

		WebElement searchButton = driver1.findElement(By.name("btnK"));  //this identifies the search button!!!
		System.out.println("The name of the button is: " + searchButton.getAttribute("name"));
		System.out.println("The name of the value is: " + searchButton.getAttribute("value"));
		System.out.println("The name of the aira-label is: " + searchButton.getAttribute("aria-label"));
		toSleep();
		
/**
*  NOTE: this uses '.equals', NOT == for 'getAttribute', this is VERY IMPORTANT
*  reference selenium java api !!!
*/
		if ((((searchButton.getAttribute("value")).equals("Google Search"))))
			System.out.println("The attributes are equal = true");
		else 
			System.out.println("The attributes are equal = f**king false");
		toSleep();
		driver1.navigate().to("http://www.bing.com");
		toSleep();
		driver1.quit();

		
/** 
 * this is just a memory kick for me on ArrayList syntax
 */		
/*		ArrayList<Integer> test = new ArrayList<Integer>(); 
		for(int i =0; i <= 10;i++)	{
			test.add(i);
		}
		for(int i = 0; i <= 10; i++)	{
			 System.out.print(test.get(i) + "  ");
		}
		driver1.quit();   */
	}
}


