package start;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement element=a.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
Actions b=new Actions(a);
b.doubleClick(element).perform();
Alert c=a.switchTo().alert();
c.accept();
a.close();


	}

}
