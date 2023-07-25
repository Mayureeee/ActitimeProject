package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.amazon.in/");
a.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
a.findElement(By.id("nav-search-submit-button")).click();
a.findElement(By.xpath("//span[contains(text(),'Apple iPhone 14 Pro Max (128 GB) - Space Black')][1]")).click();
Thread.sleep(5000);
a.close();
	}

}
