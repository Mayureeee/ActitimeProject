package TestngScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TitleCompare {
@Test
public void titlecompare() {
	WebDriver a =new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.google.com");
	String expectedtitle = "Google";
	String actualTitle = a.getTitle();
	if (expectedtitle.equals(actualTitle)) {
		Reporter.log("Title is matching");
	} else {
Reporter.log("Title is not matching");

	}
	a.close();
	
}


}
