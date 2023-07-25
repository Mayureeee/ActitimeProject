package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.zomato.com/");
int x=a.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getLocation().getX();
int y=a.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getLocation().getY();
System.out.println(x);
System.out.println(y);
Thread.sleep(5000);
	a.close();}

}
