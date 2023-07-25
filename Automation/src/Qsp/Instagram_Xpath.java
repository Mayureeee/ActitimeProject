package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Xpath {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("maeyuu_p");
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("tanvi0704");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(500000);
	driver.close();
	
	}

}
