package start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOpt {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("file:///C:/Users/admin/Desktop/Rolex%20hotel.html");
WebElement hotel = a.findElement(By.id("doremon"));
Select s=new Select(hotel);
s.selectByIndex(2);
s.selectByValue("Dm");
s.selectByVisibleText("Burger");
List<WebElement> text = s.getAllSelectedOptions();
int count = text.size();
for (int i = 0; i < count; i++) {
	String option = text.get(i).getText();
	System.out.println(option);
}
a.close();

	}

}
