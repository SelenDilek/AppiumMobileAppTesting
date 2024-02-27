package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page.PlatformPage;
import Utilities.Hooks;

public class PlatformSteps extends Hooks {

    PlatformPage platPage=new PlatformPage();

    @Given("Navigate to campus application")
    public void navigateToCampusApplication() {
        setUp();
    }

    @When("Click and verify platforms")
    public void clickAndVerifyPlatforms() {
        platPage.clickElement(platPage.livePlatform());
        platPage.isDisplayedElement(platPage.livePlatform());
        platPage.clickElement(platPage.demoPlatform());
        platPage.isDisplayedElement(platPage.demoPlatform());
        platPage.clickElement(platPage.testPlatform());
        platPage.isDisplayedElement(platPage.testPlatform());
        platPage.clickElement(platPage.technoStudyPlatform());
        platPage.isDisplayedElement(platPage.technoStudyPlatform());
    }

    @Then("Select a platform and click continue button")
    public void selectAPlatformAndClickContinueButton() {
        platPage.clickElement(platPage.technoStudyPlatform());
        platPage.clickElement(platPage.contButton());
    }

    @Then("User enters the required information and click sign in button")
    public void userEntersTheRequiredInformationAndClickSignInButton() {
    }
}
