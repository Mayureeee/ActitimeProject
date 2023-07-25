package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver()	;
a.manage().window().maximize();
a.navigate().to("https://www.amazon.in/");
a.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
a.findElement(By.id("nav-search-submit-button")).click();
a.findElement(By.xpath("//span[.='Apple iPhone 14 (128 GB) - Blue'][1]")).click();
Thread.sleep(3000);
a.quit();
	}

}
