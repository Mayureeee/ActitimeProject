package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rolex_hotel_deselect {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("file:///C:/Users/admin/Desktop/Rolex%20hotel.html");
WebElement element = a.findElement(By.id("doremon"));
Select s= new Select(element);
s.selectByValue("Dm");
s.selectByVisibleText("Sandwich");
s.selectByIndex(8);
Thread.sleep(3000);
s.deselectByValue("Dm");
s.deselectByVisibleText("Sandwich");
s.deselectByIndex(8);
a.close();

	}

}
