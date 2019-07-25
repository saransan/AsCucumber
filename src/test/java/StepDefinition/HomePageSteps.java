package StepDefinition;

import cucumber.api.java.en.Given;

public class HomePageSteps {
	
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    HomePage home=new HomePage();
	    home.getLnk_addcustomer().click();
	    
	}

}
