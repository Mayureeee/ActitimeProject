package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependent_inde1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a =new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.amazon.in/");
a.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung s23 ultra 5g");
a.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(3000);
String price = a.findElement(By.xpath("//span[text()='Samsung Galaxy S23 Ultra 5G (Phantom Black, 12GB, 256GB Storage)']"
		+ "/../../../../../../../div[2]/div[1]/div/div[3]/div[1]/div/div[1]/div[2]/a/span[1]/span[2]")).getText();
	System.out.println(price);
	Thread.sleep(5000);
	a.close();}

}
