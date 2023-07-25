package TestngScripts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)    //linking


public class Football extends BaseClass {

	@Test
	public void messi() {
		
		Reporter.log("Best Football Player",true);
		Assert.fail();
	}
	public void ronaldo() {
		Reporter.log(null);
	}
	
}
