package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utilities.Hooks;

public class SettingsPage extends Hooks {
    public SettingsPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public WebElement findByXpath(String xp) {
        return androidDriver.findElement(By.xpath(xp));
    }

    public WebElement findByAccessId(String id) {
        return androidDriver.findElementByAccessibilityId(id);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void isDisplayedElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }

    public void sendKeysMethod(WebElement element, String keys) {
        element.sendKeys(keys);
    }


    public WebElement editAccount() {
        return findByXpath("//android.widget.Button[@text=\"Edit Account\"]");
    }

    public WebElement campusLogo() {
        return findByXpath("//android.widget.Image[@text=\"Campus Logo\"]");
    }

    public WebElement switchSchool() {
        return findByAccessId("Switch School");
    }

    public WebElement notification() {
        return findByAccessId("Notification");
    }

    public WebElement changePassword() {
        return findByAccessId("Change Password");
    }

    public WebElement language() {
        return findByAccessId("Language English");
    }

    public WebElement signOut() {
        return findByXpath("//android.widget.Button[@text=\"Sign out\"]");
    }

    public WebElement currentPasswordLabel() {
        return androidDriver.findElement(By.id("ion-input-2"));
    }

    public WebElement newPasswordLabel() {
        return androidDriver.findElement(By.id("ion-input-2"));
    }

    public WebElement editGalleryButton() {
        return androidDriver.findElement(By.id("ion-input-3"));
    }

    public WebElement editDeleteImageButton() {
        return findByXpath("//android.widget.Button[@text=\"Delete\"]");
    }


}
