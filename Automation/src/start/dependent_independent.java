package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependent_independent {
static {
	System.setProperty("webdriver.chrome.driver"," (./driver/chromedriver.exe)");
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.amazon.in/");
a.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
a.findElement(By.id("nav-search-submit-button")).click();
String price = a.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro (256 GB) - Space Black']/../../../../../../../div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]"
		)).getText();
System.out.println(price);
Thread.sleep(5000);
a.close();
	}

}
