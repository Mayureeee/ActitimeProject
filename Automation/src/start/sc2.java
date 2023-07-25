//print title
package start;

import org.openqa.selenium.chrome.ChromeDriver;

public class sc2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
ChromeDriver s= new ChromeDriver();
s.manage().window().maximize();
s.get("https://www.instagram.com/");
String title = s.getTitle();
System.out.println(title);
Thread.sleep(5000);
s.close();

	}

}
