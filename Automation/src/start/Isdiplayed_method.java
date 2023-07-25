package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdiplayed_method {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.facebook.com/");
boolean logo = a.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	if (logo==true) {
		System.out.println("Logo is displayed");
	} else {
System.out.println("Logo is not displayed");
	}
	Thread.sleep(5000);
a.close();
}
}
