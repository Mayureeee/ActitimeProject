//Q.wast verify whether the facebook logo is displayed or not.
package Qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayes {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
boolean logo=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
if (logo==true) {
	System.out.println("Logo is displayed");
} else {
System.out.println("Logo is not displayed");
}
Thread.sleep(5000);
driver.close();

	}
	

}
