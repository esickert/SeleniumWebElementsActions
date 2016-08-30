package webElementsActionsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SendKeys extends ExtraStuffActionsTest	{

	public void Sendkeys() {
		// TODO Auto-generated constructor stub
		WebDriver tom = new FirefoxDriver();
		tom.get("http://www.yahoo.com");
		WebElement sam = tom.findElement(By.name("p"));
		sam.sendKeys(Keys.chord(Keys.SHIFT,"apple corp"));  //turns lower case to upper case (hold shift while typing "apple corp")
		toSleep();
		sam.sendKeys(Keys.ENTER);  //sends ENTER to element p
	}
//the following code will hold down the ctrl key while typing "a"	
//	String selectAll = Keys.chord(Keys.CONTROL, "a");
//  driver.findElement(By.whatever("anything")).sendKeys(selectAll);

}
