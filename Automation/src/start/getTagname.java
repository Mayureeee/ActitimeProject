package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a = new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.instagram.com/");
		Thread.sleep(3000);
		String Tagname = a.findElement(By.xpath("//i[@aria-label='Instagram']")).getTagName();
		System.out.println("Tagname:"+ Tagname);
		a.close();
		
	}
}
