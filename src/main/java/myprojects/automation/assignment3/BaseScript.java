package myprojects.automation.assignment3;

import myprojects.automation.assignment3.pages.LoginPage;
import myprojects.automation.assignment3.utils.EventHandler;
import myprojects.automation.assignment3.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    private static WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        getConfiguredDriver().manage().window().maximize();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        getDriver().quit();
    }


    public static LoginPage openLoginPage(){
        getConfiguredDriver().get(Properties.getBaseAdminUrl());
        return new LoginPage();
    }

    /**
     *
     * @return New instance of {@link WebDriver} object. Driver type is based on passed parameters
     * to the automation project, returns {@link ChromeDriver} instance by default.
     */
    public static WebDriver getDriver() {
        if(driver == null) {
            String path = System.getProperty("user.dir");
//            System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/win/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/mac/chromedriver");
//           I run the scripts on Mac, unfortunately, don't have a chance to check them on Windows
            driver = new ChromeDriver();
        }
        return driver;
    }

//    public static WebDriver getDriver() {
//        if(driver == null) {
//            String browser = Properties.getBrowser();
//            switch (browser) {
//                default:
//                    System.setProperty(
//                            "webdriver.chrome.driver",
//                            new File(BaseScript.class.getResource("/win/chromedriver.exe").getFile()).getPath());
////                        new File(BaseScript.class.getResource("/mac/chromedriver.exe").getFile()).getPath());
//                    return new ChromeDriver();
//            }
//        }
//        return driver;
//    }

    /**
     * Creates {@link WebDriver} instance with timeout and browser window configurations.
     *
     * @return New instance of {@link EventFiringWebDriver} object. Driver type is based on passed parameters
     * to the automation project, returns {@link ChromeDriver} instance by default.
     */
    public static EventFiringWebDriver getConfiguredDriver() {
        EventFiringWebDriver driver = new EventFiringWebDriver(getDriver());
        driver.register(new EventHandler());

        return driver;
    }
}

