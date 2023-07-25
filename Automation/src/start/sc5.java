package start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sc5 {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver a=new ChromeDriver();
a.manage().window().maximize();
Thread.sleep(5000);
a.get("file:///C:/Users/admin/Desktop/html/heading.html/Auto.html");
a.findElement(By.id("cheetah")).click();
Thread.sleep(5000);
a.close();
	}

}
