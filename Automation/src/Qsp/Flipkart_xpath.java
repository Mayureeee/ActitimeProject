package Qsp;
//wrie a scrpt for open flipkart search for something ex.iphone13
//and then click on the first product by text function and close the page (2app)


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Flipkart_xpath {
static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("iphone13");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}