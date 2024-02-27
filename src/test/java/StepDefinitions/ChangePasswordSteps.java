package StepDefinitions;

import io.cucumber.java.en.Then;
import Page.SettingsPage;

public class ChangePasswordSteps {
    SettingsPage stPage=new SettingsPage();

    @Then("User change password successfully")
    public void userChangePasswordSuccessfully() {
        stPage.isDisplayedElement(stPage.currentPasswordLabel());
        stPage.isDisplayedElement(stPage.newPasswordLabel());

    }
}
