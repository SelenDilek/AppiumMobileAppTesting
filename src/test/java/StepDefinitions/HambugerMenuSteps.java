package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Page.HamburgerPage;
import Utilities.Hooks;
import Utilities.Methods;

public class HambugerMenuSteps extends Hooks {

    HamburgerPage hamPage=new HamburgerPage();
    Methods methods=new Methods();
    @Given("Click hamburger menu button")
    public void clickHamburgerMenuButton() {
        hamPage.clickElement(hamPage.hbMenu());
        methods.wait(1);
    }

    @When("USer click all hamburger menu element and verify")
    public void userClickAllHamburgerMenuElementAndVerify() {
        methods.wait(1);
        hamPage.isDisplayedElement(hamPage.hbHome());
        hamPage.isDisplayedElement(hamPage.hbCalendar());
        hamPage.clickElement(hamPage.hbCalendar());
        hamPage.clickElement(hamPage.backButton());
        methods.wait(1);
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbCourses());
        hamPage.clickElement(hamPage.hbCourses());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbAssignment());
        hamPage.clickElement(hamPage.hbAssignment());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbGrading());
        hamPage.clickElement(hamPage.hbGrading());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbChat());
        hamPage.clickElement(hamPage.hbChat());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbMessages());
        hamPage.clickElement(hamPage.hbMessages());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbAnnouncement());
        hamPage.clickElement(hamPage.hbAnnouncement());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
        hamPage.isDisplayedElement(hamPage.hbSettings());
        hamPage.clickElement(hamPage.hbSettings());
        hamPage.clickElement(hamPage.backButton());
        hamPage.clickElement(hamPage.hbMenu());
    }
}
