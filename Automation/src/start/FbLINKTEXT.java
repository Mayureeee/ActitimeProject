package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLINKTEXT {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.facebook.com/");
a.findElement(By.linkText("Create new account")).click();
Thread.sleep(3000);
a.findElement(By.name("firstname")).sendKeys("Mayuree");
a.findElement(By.name("lastname")).sendKeys("Pawar");
a.findElement(By.name("reg_email__")).sendKeys("8879749296");
a.findElement(By.name("reg_passwd__")).sendKeys("asdfghjkl@1");

Thread.sleep(5000);
a.close();
	}

}
