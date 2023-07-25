package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tinder_by_css {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://tinder.com/");
a.findElement(By.cssSelector("Px(24px) Py(8px)")).click();
Thread.sleep(5000);
a.close();

	}

}
