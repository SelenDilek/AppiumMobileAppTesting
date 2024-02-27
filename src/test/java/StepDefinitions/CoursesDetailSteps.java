package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Page.HomePage;
import Utilities.Methods;

public class CoursesDetailSteps {
    HomePage homePage=new HomePage();
    Methods methods=new Methods();
    @Given("Click courses element in homepage")
    public void clickCoursesElementInHomepage() {
        methods.wait(1);
        homePage.clickElement(homePage.coursesMenu());
    }

    @When("User should see their course")
    public void userShouldSeeTheirCourse() {
        homePage.isDisplayedElement(homePage.detailsButton());
    }
}
