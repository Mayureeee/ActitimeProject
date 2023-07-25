package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleSelectDropdown {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("https://www.facebook.com/");
a.findElement(By.linkText("Create new account")).click();
WebElement element = a.findElement(By.id("day"));
Select s=new Select(element);
s.selectByIndex(18);
WebElement element1 = a.findElement(By.id("month"));
Select s1=new Select(element1);
s1.selectByIndex(2);
WebElement element2 = a.findElement(By.id("year"));
Select s2=new Select(element2);
s2.selectByValue("2000");
Thread.sleep(5000);
a.close();




	}

}
