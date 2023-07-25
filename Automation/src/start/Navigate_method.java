package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.navigate().to("file:///C:/Users/admin/Desktop/html/Untitled-2.html");
a.findElement(By.id("zabba")).click();
a.navigate().back();
a.navigate().forward();
a.navigate().refresh();
a.close();

}

}
