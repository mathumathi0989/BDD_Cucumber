package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.userLoginPage;

public class loginPage extends userLoginPage {


	@Given("user navigates to login page")
public void user_navigates_to_login_page() {
 
		userBrowser();
		

}

@When("user enters the login details")
public void user_enters_the_login_details() throws Exception {
 
	user_Id();
	user_Pwd();
	user_btn();
    
}

@Then("user should be able to view the product list page")
public void user_should_be_able_to_view_the_product_list_page() throws Exception {
 title();
 
  
}

@When("user enter  standard_user and secret_sauce in login page")
public void user_enter_standard_user_and_secret_sauce_in_login_page() {

	
    throw new io.cucumber.java.PendingException();
}

@Then("user should be able to view the product list page if logged correctly")
public void user_should_be_able_to_view_the_product_list_page_if_logged_correctly() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("user enter  locked_out_user and {int} in login page")
public void user_enter_locked_out_user_and_in_login_page(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}
