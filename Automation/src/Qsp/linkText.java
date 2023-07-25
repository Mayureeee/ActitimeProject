package Qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("firstname")).sendKeys("Mayuri");
	
		driver.findElement(By.name("lastname")).sendKeys("Pawar");
		driver.findElement(By.name("reg_email__")).sendKeys("pawarmayu@12");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pawar@1234");
		driver.findElement(By.name("birthday_day")).sendKeys("19");
		driver.findElement(By.name("birthday_month")).sendKeys("Mar");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		Thread.sleep(5000);
		driver.close();
}
}
