package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatolinktext {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver a = new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.zomato.com/");
	a.findElement(By.linkText("Investor Relations")).click();
	a.findElement(By.className("subtype-data")).click();
	Thread.sleep(5000);
	a.close();

}
}
