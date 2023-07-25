package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.amazon.in/");
a.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
Thread.sleep(3000);
a.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(3000);
String text = a.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (128 GB) - Space Black']")).getText();
System.out.println(text);
a.close();
	}

}
