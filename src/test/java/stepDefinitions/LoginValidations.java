package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.*;

public class LoginValidations {
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("User is on the login page");
	}
	
	@When("User enters the Username as (.+) and Password as (.+)")
	public void userEntersUsernameAndPassword(String username, String password) {
		System.out.println("User enters the " + username + " and " + password);
	}

	@When("User enters the Username and Password")
	public void userEntersUsernameAndPassword(io.cucumber.datatable.DataTable datatable) {
		System.out.println("********");
		List<String> asList = datatable.asList();
		for (String eachCredential : asList) {
			System.out.println(eachCredential);
		}
		System.out.println("********");
	}

	@And("User clciks on the Login button")
	public void user_clciks_on_the_login_button() {
		System.out.println("User clicks on the Login button");
	}

	@Then("Application hompage will be displayed")
	public void application_hompage_will_be_displayed() {
		System.out.println("Application page is loaded");
	}

	@Given("User launches a specific application URL")
	public void user_launches_a_specific_application_url() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("URL launched successfully");
	}

	@When("User enters the username as User1 and password as Password1")
	public void user_enters_the_username_as_user1_and_password_as_password1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("U1 and P1 success");
	}

	@When("User enters the username as User2 and password as Password2")
	public void user_enters_the_username_as_user2_and_password_as_password2() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("U2 and P2 success");
	}

	@When("User enters the username as User3 and password as Password3")
	public void user_enters_the_username_as_user3_and_password_as_password3() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("U3 and P3 success");
	}

	@When("User enters the username as User4 and password as Password4")
	public void user_enters_the_username_as_user4_and_password_as_password4() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("U4 and P4 success");
	}

	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println();
	}

	@When("User enters the wrong username as <Username> and password as <Password>")
	public void user_enters_the_wrong_username_as_username_and_password_as_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters the invalid credentials");
	}

	@Then("Application displays error message")
	public void application_displays_error_message() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("App displays the error message");
	}

}
