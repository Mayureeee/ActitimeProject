package start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class As2 {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver s= new ChromeDriver();
s.manage().window().maximize();
s.get("file:///C:/Users/admin/Desktop/html/Web.html");
s.findElement(By.id("pappu")).click();
s.close();



	}

}
