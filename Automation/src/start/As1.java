package start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class As1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver a =new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.youtube.com/");
		a.findElement(By.name("search_query")).sendKeys("Perfect");
		a.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		a.close();
		
		
		

	}

}
