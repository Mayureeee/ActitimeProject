package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_method {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.facebook.com/");
Thread.sleep(5000);
a.findElement(By.name("email")).sendKeys("Mayuree");
Thread.sleep(5000);
a.findElement(By.name("email")).clear();
Thread.sleep(5000);
a.close();
	}

}
