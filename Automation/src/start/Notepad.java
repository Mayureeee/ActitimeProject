package start;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
Runtime.getRuntime().exec("Notepad");
Thread.sleep(3000);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_SHIFT);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_Q);
r.keyRelease(KeyEvent.VK_SHIFT);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_S);
r.keyPress(KeyEvent.VK_P);







	}

}
