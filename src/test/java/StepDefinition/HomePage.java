   package StepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement lnk_addcustomer;

	public WebElement getLnk_addcustomer() {
		return lnk_addcustomer;
	}
	
	
	
	
}
