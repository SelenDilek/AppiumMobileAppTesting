package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page.HomePage;

public class ExcusesSteps {
    HomePage homePage=new HomePage();
    @Given("Click attendance button in homepage")
    public void clickAttendanceButtonInHomepage() {
        homePage.clickElement(homePage.attendanceMenu());
    }

    @When("Click excuses and plus button for create excuses")
    public void clickExcusesAndPlusButtonForCreateExcuses() {
        homePage.clickElement(homePage.excusesButton());
        homePage.clickElement(homePage.excusesPlusButton());
    }

    @Then("User should create excuses")
    public void userShouldCreateExcuses() {
    homePage.clickElement(homePage.excuseType());
    homePage.clickElement(homePage.excuseDateRange());
    homePage.clickElement(homePage.dateFrom());
    homePage.clickElement(homePage.decTwelveSelect());
    homePage.clickElement(homePage.dateTo());
    homePage.clickElement(homePage.decThirdSelect());
    homePage.sendKeysMethod(homePage.excuseTextArea(),"I am so sick.");
    homePage.clickElement(homePage.sendButton());
    }
}
