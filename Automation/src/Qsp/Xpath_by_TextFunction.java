//text path by text function
//syntax
//{//tagname[text()='text']}
//ex.{//div[text()='Login ']}
//Q.write a script to login to atitime application
package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_TextFunction {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	driver.close();
	
	
	
	
}
}
