package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Page.HamburgerPage;
import Page.SettingsPage;
import Utilities.Methods;

public class LogoutSteps {
    HamburgerPage hamburgerPage=new HamburgerPage();
    SettingsPage stPage=new SettingsPage();
    Methods methods=new Methods();
    @When("Click sign out button")
    public void clickSignOutButton() {
        hamburgerPage.clickElement(hamburgerPage.hbSettings()); //polym.
        methods.wait(1); //overriding (Method class funct) OOP Polym.
        stPage.clickElement(stPage.signOut());
    }

    @Then("User should sign out successfully")
    public void userShouldSignOutSuccessfully() {
        stPage.isDisplayedElement(stPage.campusLogo());
    }
}
