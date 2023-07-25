//Id locator
package start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sc6 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chrome.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver a = new ChromeDriver();
a.manage().window().maximize();

a.get("file:///C:/Users/admin/Desktop/html/heading.html/Auto.html");
Thread.sleep(5000);
a.findElement(By.id("Tiger")).click();
a.findElement(By.id("email")).sendKeys("8879749296");
Thread.sleep(5000);
a.close();
	}

}
