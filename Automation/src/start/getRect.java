package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.zomato.com/");
int x =a.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getX();
int y=a.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getY();
int Height=a.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getHeight();
int width=a.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getWidth();
System.out.println("X:" +x );
System.out.println("Y:"+ y);
System.out.println("Height:"+Height);
System.out.println("Width:"+ width);
a.close();

	
	}

}
