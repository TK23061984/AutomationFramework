package stepDefinitions;

import org.junit.Test;

import Helper.Utilities;
import common.Log;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uiFramework.WebDriver;

public class ShoppingCart {

	static Log _log = null;
	WebDriver _driver = Utilities.WebDriver(new Log("ShoppingCart"));
	
	@Given("^the user browses the site (.*)$")
	public void NavigateTo(String url) throws Throwable {
		System.out.println("^the user browses the site (.*)");
		if(_driver == null){
			System.out.println("Driver is null");
		}
			
		_driver.navigate("www.Amazon.com");
		_log.info("the user browses the site");
	}

	@When("^the user searches for (.*)$")
	public void Search(String product) throws Throwable {
		_log.info("the user searches for" + product);
	}

	@Then("^the current page will be the search result page$")
	public void VerifyCurrentPage() throws Throwable {
		_log.info("the current page will be the search result page");
	}

	@When("^the user adds the (.*) product in the search result to the cart$")
	public void AddToCart(String index) throws Throwable {
		_log.info("the user adds the (.*) product in the search result to the cart");
	}

	@Then("^the shopping cart has the added product$")
	public void VerifyCart() throws Throwable {
		_log.info("VerifyCart");
	}
	
	

}
