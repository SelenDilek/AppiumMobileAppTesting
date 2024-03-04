package Utilities;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

import java.util.Set;

import static io.appium.java_client.touch.offset.PointOption.point;

public class Methods extends Hooks{ //inheritance JAVA OOPs


    AndroidTouchAction action; //object and class part of the OOPs in JAVA
    public void wait(int sec) {

        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void tabOnThePoints(int startX, int startY) {
        action = new AndroidTouchAction(androidDriver);
        action.tap(PointOption.point(startX, startY)).perform();
    }

    public void scroll(int fromX, int fromY, int toX, int toY) {
        action = new AndroidTouchAction(androidDriver);
        action.longPress(point(fromX, fromY))
                .moveTo(point(toX, toY)).release()
                .perform();
    }

    public void alert(WebElement element){
        WebDriverWait wait = new WebDriverWait(androidDriver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = androidDriver.switchTo().alert();
        alert.accept();
    }



    public void windows(WebElement element){
        WebDriverWait wait = new WebDriverWait(androidDriver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
        String homePage=androidDriver.getWindowHandle();
        Set<String> id = androidDriver.getWindowHandles();
        for(String ids : id){
            if(! ids.equals(homePage)){
                androidDriver.switchTo().window(ids);
                System.out.println();
            }

        }
    }




}


