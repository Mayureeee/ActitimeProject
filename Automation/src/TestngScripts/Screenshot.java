package TestngScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		}
	public static void main(String[] args) throws IOException {
		
		
			WebDriver a =new ChromeDriver();
			a.manage().window().maximize();
			a.get("https://www.facebook.com/");
			TakesScreenshot t=(TakesScreenshot)a;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/dhoni.jpg");
		Files.copy(src, dest);
		a.close();
	}

}
