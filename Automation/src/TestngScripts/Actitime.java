package TestngScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime {
static {
	System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
}

@Test
public void  actitimeLogin() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement unbox =driver.findElement(By.id("username"));
	driver.navigate().refresh();
	Thread.sleep(3000);
	unbox.sendKeys("admin");
	driver.close();
	
}



}
