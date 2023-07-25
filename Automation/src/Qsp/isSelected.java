package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	boolean check =driver.findElement(By.name("remember")).isSelected();
	if (check==true) {
		System.out.println("Checkbox is enabled");
	} else {
System.out.println("Checkbox is disabled");
	}
	Thread.sleep(5000);
	driver.close();
}
}
