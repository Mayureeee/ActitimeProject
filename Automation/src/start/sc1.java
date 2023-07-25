package start;

import org.openqa.selenium.chrome.ChromeDriver;

public class sc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.zomato.com/mumbai");
Thread.sleep(2000);
driver.manage().window().minimize();
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.close();

	}

}
