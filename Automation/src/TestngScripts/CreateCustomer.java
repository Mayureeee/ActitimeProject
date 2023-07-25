package TestngScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {

	@Test(invocationCount = 5,priority = 3)
	public void createcustomer(){
		Reporter.log("customer created",true);
	}	
		@Test(priority = 1)
		public void modifycustomer() {
			Reporter.log("Customer Modified",true);
		}
		@Test(priority = 2)
		public void editCustomer() {
			Reporter.log("Customer Edited",true);
		}
		@Test(priority = 4)
		public void deleteCustomer() {
			Reporter.log("Customer Deleted",true);
		}
		
	}

