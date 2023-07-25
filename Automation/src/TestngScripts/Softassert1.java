package TestngScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Softassert1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		}
		public void assertnotequals(){
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.google.com");
		String expectedtitle = "Soogle";
		String actualTitle = a.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedtitle);
		a.close();
		s.assertAll();
	}
		
}
