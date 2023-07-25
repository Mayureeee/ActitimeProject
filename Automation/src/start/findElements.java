package start;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class findElements {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		WebDriver a= new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.amazon.com/");
	List<WebElement> alllink = a.findElements(By.xpath("//a"));
	int count = alllink.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String link = alllink.get(i).getText();
	    System.out.println(link);
		}
	Thread.sleep(3000);
	a.close();
		}

	}
