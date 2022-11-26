package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefination {
	
	@Given("User is on the landing Page")
	public void user_is_on_the_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User name is on ladding page");
	}
	@When("User is register with following deatails")
	public void user_is_register_with_following_deatails(DataTable dataTable) {
	 
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(0).get(2));
		System.out.println(data.get(0).get(3));
		System.out.println(data.get(0).get(4));

		
	}
	@Then("User Successfully Registered")
	public void user_successfully_registered() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User is succesfully registered");
	}
	@Then("Verify thet Succesfully Registered is displayed")
	public void verify_thet_succesfully_registered_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Verify User is successfully register");
	}

}
