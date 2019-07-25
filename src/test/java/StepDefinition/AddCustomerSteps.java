package StepDefinition;

import java.util.Map;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {

	
	@When("the user fill in valid customer details")
	public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
		AddCustomerPage addcust = new AddCustomerPage();
		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		addcust. getRdo_done().click();
		
		addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		addcust.getTxt_email().sendKeys(customerDetailsMap.get("email"));
		addcust.getTxt_address().sendKeys(customerDetailsMap.get("address"));
		addcust.getTxt_phnnum().sendKeys(customerDetailsMap.get("phoneNum"));
		
	    
	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomerPage addcust = new AddCustomerPage();
		addcust.getClk_submit().click();
	    
	}

@When("the user fill invalid customer details")
public void the_user_fill_invalid_customer_details(DataTable customerDetails) {
	AddCustomerPage addcust = new AddCustomerPage();
	Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
	addcust. getRdo_done().click();
	
	addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
	addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
	addcust.getTxt_email().sendKeys(customerDetailsMap.get("email"));
	addcust.getTxt_address().sendKeys(customerDetailsMap.get("address"));
	addcust.getTxt_phnnum().sendKeys(customerDetailsMap.get("phoneNum"));
	
    
}




    
}

