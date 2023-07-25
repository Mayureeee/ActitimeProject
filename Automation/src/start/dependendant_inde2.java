package start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class dependendant_inde2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver a= new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.flipkart.in/");
		a.findElement(By.xpath("//button@class='_2KpZ6l _2doB4z'"));
		a.findElement(By.name("q")).sendKeys("Oneplus 7t");
		a.findElement(By.xpath("//button[@type]")).click();
	}

}
