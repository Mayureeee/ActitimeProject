package TestngScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertNotEquals {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public void assertnotequals(){
	WebDriver a =new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.google.com");
	String expectedtitle = "Google";
	String actualTitle = a.getTitle();
	Assert.assertNotEquals(actualTitle, expectedtitle);
	a.close();
}
}