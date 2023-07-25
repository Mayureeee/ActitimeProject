package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver a= new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.facebook.com/");
	int height = a.findElement(By.id("passContainer")).getSize().getHeight();
	int width = a.findElement(By.id("passContainer")).getSize().getWidth();
	System.out.println(height);
	System.out.println(width);
	Thread.sleep(5000);
	a.close();
		}}