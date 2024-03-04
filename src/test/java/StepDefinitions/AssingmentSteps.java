package StepDefinitions;

import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page.HomePage;
import Utilities.Methods;

public class AssingmentSteps {
    HomePage homePage=new HomePage();
    Methods methods=new Methods();
    LoginPage loginPage = new LoginPage();
    @Given("Click assignment element in homepage")
    public void clickAssignmentElementInHomepage() {
        homePage.clickElement(homePage.assignmentMenu());
    }

    @When("User should see homeworks and click")
    public void userShouldSeeHomeworksAndClick() {
        loginPage.passwordLabel();
        methods.wait(1);
        homePage.isDisplayedElement(homePage.assingmentDate());
        homePage.clickElement(homePage.visibleAssingment());

    }

    @Then("User should have access to the assignment information")
    public void userShouldHaveAccessToTheAssignmentInformation() {
        homePage.isDisplayedElement(homePage.assingmentInfo());
    }
}
