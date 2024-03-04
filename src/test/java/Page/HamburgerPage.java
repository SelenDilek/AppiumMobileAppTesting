package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utilities.Hooks;

public class HamburgerPage extends Hooks {

    public HamburgerPage() {
        PageFactory.initElements(androidDriver, this); //android static not nessesary to initilate again.
    }
    public void isDisplayedElement(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
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



    public WebElement backButton() {
        return findByXpath("//android.widget.Button[@text=\"back\"]");
    }

    public WebElement hbMenu() {
        return findByXpath("//android.widget.Button[@text=\"menu\"]");
    }

    public WebElement hbHome() {
        return findByAccessId("Home");
    }

    public WebElement hbCalendar() {
        return findByXpath("//android.view.View[@content-desc=\"Calendar\"]");
    }

    public WebElement hbCourses() {
        return findByAccessId("Courses");
    }

    public WebElement hbAssignment() {
        return findByAccessId("Assignments 22");
    }

    public WebElement hbGrading() {
        return findByAccessId("Grading");
    }

    public WebElement hbChat() {
        return findByAccessId("Chat");
    }

    public WebElement hbMessages() {
        return findByAccessId("Messages 13");
    }

    public WebElement hbAnnouncement() {
        return findByAccessId("Announcements");
    }

    public WebElement hbSettings() {
        return findByAccessId("Settings");
    }
}
