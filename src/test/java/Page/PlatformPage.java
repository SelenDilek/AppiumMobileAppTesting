package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utilities.Hooks;

public class PlatformPage extends Hooks {

    public PlatformPage() {
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

    public WebElement livePlatform() {
        return findByXpath("//android.widget.Button[@text=\"Live\"]");
    }

    public WebElement technoStudyPlatform() {
        return findByXpath("//android.widget.Button[@text=\"Techno Study\"]");
    }

    public WebElement demoPlatform() {
        return findByXpath("//android.widget.Button[@text=\"Demo\"]");
    }

    public WebElement testPlatform() {
        return findByXpath("//android.widget.Button[@text=\"Test\"]");
    }

    public WebElement contButton() {
        return findByXpath("//android.widget.Button[@text=\"CONTINUE\"]");
    }

}
