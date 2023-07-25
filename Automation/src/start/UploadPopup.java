package start;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a = new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
a.get("https://www.foundit.in/");
a.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"));
File f= new File("./Test Data/QSP/Mp_Manual.pdf");
String path = f.getAbsolutePath();
Thread.sleep(5000);
a.findElement(By.id("file-upload")).sendKeys(path);
Thread.sleep(5000);
a.close();


	}

}
