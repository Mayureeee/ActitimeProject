package start;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_Alert {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("https://demo.actitime.com/login.do");
a.findElement(By.id("username")).sendKeys("admin");
a.findElement(By.name("pwd")).sendKeys("manager");
a.findElement(By.xpath("//div[.='Login ']")).click();
a.findElement(By.xpath("//a[@class='content tasks']")).click();
a.findElement(By.xpath("//div[.='Add New']")).click();
a.findElement(By.xpath("//div[.='+ New Customer']")).click();
a.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Mayuree");
a.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
Thread.sleep(5000);
Alert b=a.switchTo().alert();
b.dismiss();
Thread.sleep(5000);
a.close();
	}

}
