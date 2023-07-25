package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcss {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver a = new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://tinder.com/");
	Thread.sleep(5000);
 String tag = a.findElement(By.xpath("//h1[.='Start something epic.']")).getCssValue("color");
	System.out.println(tag);
	Thread.sleep(3000);
	a.close();
	
		}
}