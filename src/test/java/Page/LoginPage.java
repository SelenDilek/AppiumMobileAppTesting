package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utilities.Hooks;

public class LoginPage extends Hooks {

    public LoginPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public WebElement findByXpath(String xp) {
        return androidDriver.findElement(By.xpath(xp));
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
    public void sendKeysMethod(WebElement element) {
        element.submit();

    }

    public WebElement usernameLabel() {
        return findByXpath
                ("//android.widget.EditText[@resource-id=\"ion-input-0\"]");
    }

    public WebElement passwordLabel() {
        return findByXpath("//android.widget.EditText[@resource-id=\"ion-input-1\"]");
    }

    public WebElement signInButton() {
        return findByXpath("\t\n" +
                "//android.widget.Button[@text=\"SIGN IN\"]");
    }

    public WebElement forgotPassword() {
        return findByXpath("//android.widget.TextView[@text=\"Forgot Password?\"]");
    }

    public WebElement switchPlatform() {
        return findByXpath("\t\n" +
                "//android.widget.TextView[@text=\"Switch Platform\"]");
    }
}
