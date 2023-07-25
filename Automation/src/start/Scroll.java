package start;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
static {
	System.setProperty("webdriver.chrome.driver", "./driver.chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a=new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("https://www.bbc.com/");
JavascriptExecutor j=(JavascriptExecutor)a;
Thread.sleep(5000);
j.executeScript("window.scrollBy(0,2000)");
Thread.sleep(5000);
j.executeScript("window.scrollBy(0,-2000)");
Thread.sleep(5000);
a.close();
	}
}
