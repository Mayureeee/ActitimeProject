package start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementss {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.flipkart.com/");
a.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
List<WebElement> alllink = a.findElements(By.xpath("//a"));
int count = alllink.size();
for(int i=0;i<count;i++)
{
	String link = alllink.get(i).getText();
    System.out.println(link);
	}
Thread.sleep(3000);
a.close();
	}

}
