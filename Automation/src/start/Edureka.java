package start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edureka {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("https://www.edureka.co");
//a.findElement(By.xpath("(//button[@class='close close_exit_popup'])[2]")).click();
a.findElement(By.linkText("Corporate Training")).click();
a.findElement(By.xpath("//button[@class='trackButton demo-req-btn ga_corp_info']")).click();
Thread.sleep(3000);
a.findElement(By.xpath("(//input[@aria-required='true'])[7]")).sendKeys("Mayuri");
a.findElement(By.xpath("(//input[@placeholder='Enter Company Name'])[3]")).sendKeys("aqm");

Thread.sleep(3000);
WebElement element = a.findElement(By.xpath("(//select[@class='form-control required'])[3]"));
Select s= new Select(element);
s.selectByIndex(2);



a.findElement(By.xpath("(//input[@class='form-control'])[8]")).sendKeys("pawarmayuri");
a.findElement(By.xpath("(//input[@class='form-control required corpnumval'])[3]")).sendKeys("123456");

Thread.sleep(5000);
a.close();


	}

}
