package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class de {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(6000);
	
		

	}

}
