package TestngScripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeSuite
public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	@BeforeTest
	public void launchbrowser() {
			Reporter.log("browser is launched",true);
		}
	@BeforeMethod
	public void login() {
			Reporter.log("logged in succefully",true);
		}
	@Test
	public void createcustomer() {
			Reporter.log("customer created succefully",true);
		}
	@AfterMethod
	public void logout() {
			Reporter.log("logout succefully",true);
		}
	@AfterTest
	public void closebrowser() {
			Reporter.log("broweser closed succefully",true);
		}
	
	
	
	
	
	
}
