package StepDefinition;



import org.openqa.selenium.Alert;

import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class AccessPageSteps {
	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		AccessPage access = new AccessPage();
		Assert.assertTrue(access.getLbl_custId().isDisplayed());
	}
	@Then("the user should see the error message")
	public void the_user_should_see_the_error_message() throws InterruptedException {
		AddCustomerPage addcust = new AddCustomerPage();
    	Thread.sleep(2000);
    	Alert a = Hooks.driver.switchTo().alert();
    	a.accept();
	}
}

