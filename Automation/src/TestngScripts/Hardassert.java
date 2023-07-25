package TestngScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Hardassert {
	static {
		
	}
	public void hardassert(){
	WebDriver a =new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.google.com");
	String expectedtitle = "Google";
	String actualTitle = a.getTitle();
	Assert.assertEquals(actualTitle, expectedtitle);
	a.close();
	
}
}
