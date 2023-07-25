package Qsp;//xpathcontains

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_xpath_bycontains {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung galaxy s22 5g");
    driver.findElement(By.id("nav-search-submit-button")).click();
}
}
