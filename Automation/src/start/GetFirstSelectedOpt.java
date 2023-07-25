package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOpt {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver a=new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("file:///C:/Users/admin/Desktop/Rolex%20hotel.html");
WebElement Hotel = a.findElement(By.id("doremon"));
	Select s=new Select(Hotel);
	s.selectByIndex(2);
	s.selectByValue("Fr");
	s.selectByVisibleText("Dora Cake");
	String option = s.getFirstSelectedOption().getText();
	System.out.println(option);
	a.close();
	
	
	}

}
//op: Dora Cake
