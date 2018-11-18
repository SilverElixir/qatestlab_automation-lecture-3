package myprojects.automation.assignment3.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

/**
 * Created by lucky on 11/17/18.
 */
public class EventHandler implements WebDriverEventListener {

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        Reporter.log("Finding element : " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
//        Reporter.log("Found the element : " + by.toString());
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        Reporter.log("Clicking on : " + element.getText());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
//        Reporter.log("Clicked on" + element.toString());
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        Reporter.log("Going to fill in the text into above element");
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        Reporter.log("Navigating to " + url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {

    }

    @Override
    public void afterNavigateBack(WebDriver driver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

    }

    @Override
    public void afterScript(String script, WebDriver driver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
//        Reporter.
    }
}
