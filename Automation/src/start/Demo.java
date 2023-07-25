package start;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
		
	}

	
}
