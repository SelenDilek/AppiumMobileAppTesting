package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utilities.Hooks;

public class HomePage extends Hooks {

    public HomePage() {
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

    public WebElement textMenu() {
        return findByXpath("//android.widget.TextView[@text=\"Home\"]");
    }

    public WebElement hamburgerMenu() {
        return findByXpath("//android.widget.Button[@text=\"menu\"]");
    }

    public WebElement backButton() {
        return findByXpath("//android.widget.Button[@text=\"back\"]");
    }

    public WebElement calendarMenu() {
        return findByAccessId("CALENDAR");
    }

    public WebElement coursesMenu() {
        return findByAccessId("COURSES");
    }

    public WebElement gradingMenu() {
        return findByAccessId("GRADING");
    }

    public WebElement attendanceMenu() {
        return findByAccessId("ATTENDANCE");
    }

    public WebElement assignmentMenu() {
        return findByAccessId("ASSIGNMENTS 22");
    }

    public WebElement myFinanceMenu() {
        return findByAccessId("MY FINANCE");
    }

    public WebElement messageMenu() {
        return findByAccessId("MESSAGES 13");
    }

    public WebElement announcementMenu() {
        return findByAccessId("ANNOUNCEMENTS");
    }

    public WebElement chatMenu() {
        return findByAccessId("CHAT");
    }

    public WebElement detailsButton() { //For Assert
        return findByXpath("(//android.widget.Button[@text=\"DETAILS\"])[2]");
    }

    public WebElement coursesLabel() { //for Assert
        return findByXpath("(//android.widget.TextView[@text=\"Courses\"])[1]");
    }

    public WebElement visibleAssingment() {
        return findByXpath("//android.widget.Button[@text=\"Testing B4 XPath Ödevi - 00:00 Submission Status : Late\"]");
    }

    public WebElement assingmentDate() {
        return findByXpath("//android.widget.TextView[@text=\"Sat, Aug 19\"]");
    }

    public WebElement assingmentInfo() {
        return findByXpath("(//android.widget.TextView[@text=\"Info\"])[1]");
    }

    public WebElement excusesButton() {
        return findByXpath("//android.view.View[@text=\"EXCUSES\"]");
    }

    public WebElement excusesPlusButton() {
        return findByXpath("//android.view.View[@resource-id=\"main-content\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button");
    }

    public WebElement excuseType() {
        return androidDriver.findElement(By.id("ion-sel-0"));
    }

    public WebElement excuseDateRange() {
        return findByXpath("//android.widget.RadioGroup/android.view.View[1]/android.view.View/android.view.View");
    }

    public WebElement dateFrom() {
        return findByXpath("//android.widget.Button[@text=\"From*\"]");
    }

    public WebElement dateTo() {
        return findByXpath("//android.widget.Button[@text=\"To*\"]");
    }

    public WebElement decTwelveSelect() {
        return findByXpath("//android.widget.Button[@text=\"Tuesday, December 12\"]");
    }

    public WebElement decThirdSelect() {
        return findByXpath("//android.widget.Button[@text=\"Wednesday, December 13\"]");
    }

    public WebElement sendButton() {
        return findByXpath("//android.widget.Button[@text=\"SEND\"]");
    }

    public WebElement excuseTextArea() {
        return androidDriver.findElement(By.id("ion-textarea-0"));
    }
}
