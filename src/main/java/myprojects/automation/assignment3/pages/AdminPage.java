package myprojects.automation.assignment3.pages;

import myprojects.automation.assignment3.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by lucky on 11/9/18.
 */
public class AdminPage extends BasicPage {

    WebElement catalogMenuItem = driver.findElement(By.id("subtab-AdminCatalog"));

    public CategoriesPage selectCategoriesFromCatalogueMenu(){
        Actions builder = new Actions(driver);
        builder
                .moveToElement(catalogMenuItem)
                .moveToElement(driver.findElement(By.id("subtab-AdminProducts"))) // refactor with Page Factory - @FindBy
                .moveToElement(driver.findElement(By.id("subtab-AdminCategories"))) // the same as above
                .click()
                .build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("page-head")));

        return new CategoriesPage();
    }



}
