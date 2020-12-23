package StepDefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private String title;
	private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    
	    
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		 title=loginPage.getLoginPageTitle();
	    System.out.println("Title of the page is" + title) ;

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot password link should be present")
	public void forgot_password_link_should_be_present() {
		
		Assert.assertTrue(loginPage.isForgotPasswordLinkExists());
	    
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	   
	}

	@When("user enyters password {string}")
	public void user_enyters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_Login_Button() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.Login();
	    
	}

	@Then("user gets the title of the accounts page")
	public void user_gets_the_title_of_the_home_page() {
		
	   	}


}
	