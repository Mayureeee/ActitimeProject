package start;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
{System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a= new ChromeDriver();
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
a.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
WebElement src=a.findElement(By.xpath("//h1[.='Block 1']"));
WebElement dest=a.findElement(By.xpath("//h1[.='Block 4']"));
Actions b=new Actions(a);
Thread.sleep(5000);
b.dragAndDrop(src, dest).perform();
Thread.sleep(5000);
a.close();

	}

}
