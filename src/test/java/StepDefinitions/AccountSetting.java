package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page.HamburgerPage;
import Page.SettingsPage;
import Utilities.Methods;

public class AccountSetting {
    Methods methods=new Methods();
    SettingsPage stPage=new SettingsPage();
    HamburgerPage hamburgerPage=new HamburgerPage();
    @When("Click setting button")
    public void clickSettingButton() {
        methods.wait(1);
        hamburgerPage.clickElement(hamburgerPage.hbSettings());

    }

    @Then("User should see and click settings elements")
    public void userShouldSeeAndClickSettingsElements() {
        methods.wait(1);
        stPage.isDisplayedElement(stPage.editAccount());
        stPage.isDisplayedElement(stPage.switchSchool());
        stPage.isDisplayedElement(stPage.changePassword());
        stPage.isDisplayedElement(stPage.notification());
        stPage.isDisplayedElement(stPage.language());
        stPage.isDisplayedElement(stPage.signOut());

        stPage.clickElement(stPage.editAccount());
        hamburgerPage.clickElement(hamburgerPage.backButton());
        stPage.clickElement(stPage.switchSchool());
        hamburgerPage.clickElement(hamburgerPage.backButton());
        stPage.clickElement(stPage.changePassword());
        hamburgerPage.clickElement(hamburgerPage.backButton());
        stPage.clickElement(stPage.notification());
        hamburgerPage.clickElement(hamburgerPage.backButton());
        stPage.clickElement(stPage.language());
        hamburgerPage.clickElement(hamburgerPage.backButton());

    }
}
