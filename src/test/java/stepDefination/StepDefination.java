package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.Base;

import java.io.IOException;

public class StepDefination extends Base {
    @Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver = initializeDriver();
    }

    @Given("Navigate to {string} site")
    public void navigate_to_site(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(string);
    }

    @Given("Click on Login link in home page to land on Secure sign in Page")
    public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() {
        // Write code here that turns the phrase above into concrete actions
        LandingPage l = new LandingPage(driver);
        if(l.getPopUpSize()>0)
        {
            l.getPopUp().click();
        }
        l.getLogin().click();
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String usrname, String pswd) {
        // Write code here that turns the phrase above into concrete actions
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(usrname);
        lp.getPassword().sendKeys(pswd);

        lp.getSubmit().click();
    }

    @Then("Verifythatuser is succefully logged in")
    public void verifythatuser_is_succefully_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        PortalHomePage pHP = new PortalHomePage(driver);
        Assert.assertTrue(pHP.getSearchBox().isDisplayed());
    }
    @Then("Close browser")
    public void close_browser(){
        driver.quit();
    }
}