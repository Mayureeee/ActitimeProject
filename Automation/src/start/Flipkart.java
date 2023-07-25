package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.flipkart.in/");
		a.findElement(By.xpath("//button@class='_2KpZ6l _2doB4z'"));
		a.findElement(By.name("q")).sendKeys("Hp laptop");
		a.findElement(By.xpath("//button[@type='submit']")).click();
		String text =a.findElement(By.xpath("//div[contains(text(),'HP 14s Intel Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14s - dy2508TU Thin and Light Laptop')]")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		a.close();
	}

}
