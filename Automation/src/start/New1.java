package start;

import org.openqa.selenium.chrome.ChromeDriver;

public class New1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://www.tinder.com/");
	Thread.sleep(2000);
	driver.close();}

}
