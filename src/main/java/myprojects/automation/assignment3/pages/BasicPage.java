package myprojects.automation.assignment3.pages;

import myprojects.automation.assignment3.BaseScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasicPage {

    WebDriver driver = BaseScript.getConfiguredDriver();
    WebDriverWait wait = new WebDriverWait(driver, 15);

}
