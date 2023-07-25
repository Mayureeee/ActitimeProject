package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.get("file:///C:/Users/admin/Desktop/html/Untitled-2.html");
a.findElement(By.tagName("a")).click();
a.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("maeyuu_p");
a.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("tanvi0704");
a.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);
a.close();
	}

}
