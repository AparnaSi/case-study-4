package stepdef;

 

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class class01 {
	@When("user searches for")
	public void user_searches_for( DataTable dataTable) {
	     List<String> pod=dataTable.asList();
	     for(String nod:pod)
	     {
	    	 System.out.println(nod);
	     }
	}

	@When("verify product displayed")
	public void verify_product_displayed() {
	   
	}

	@Then("close the applicaion")
	public void close_the_applicaion() {
	     	}


}
