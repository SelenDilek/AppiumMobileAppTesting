package StepDefinitions;

import io.cucumber.java.en.Given;
import Page.HomePage;
import Utilities.Methods;

public class HomepageElementSteps {
    HomePage homePage=new HomePage();

    Methods methods=new Methods();
    @Given("User click homepage element in homepage and verify")
    public void userClickHomepageElementInHomepageAndVerify() {
        homePage.isDisplayedElement(homePage.calendarMenu());
        homePage.clickElement(homePage.calendarMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.coursesMenu());
        homePage.clickElement(homePage.coursesLabel());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.gradingMenu());
        homePage.clickElement(homePage.gradingMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.attendanceMenu());
        homePage.clickElement(homePage.attendanceMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.assignmentMenu());
        homePage.clickElement(homePage.assignmentMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.myFinanceMenu());
        homePage.clickElement(homePage.myFinanceMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.messageMenu());
        homePage.clickElement(homePage.messageMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.announcementMenu());
        homePage.clickElement(homePage.announcementMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);
        homePage.isDisplayedElement(homePage.chatMenu());
        homePage.clickElement(homePage.chatMenu());
        homePage.clickElement(homePage.backButton());
        methods.wait(1);


    }
}
