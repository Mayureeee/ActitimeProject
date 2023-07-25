package start;

import org.openqa.selenium.chrome.ChromeDriver;

public class sc3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
ChromeDriver a=new ChromeDriver();
a.manage().window().maximize();
a.get("https://www.instagram.com/");
String url=a.getCurrentUrl();
System.out.println(url);
Thread.sleep(5000);
a.close();
	}

}
