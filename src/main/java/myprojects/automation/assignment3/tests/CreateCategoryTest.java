package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class CreateCategoryTest extends BaseScript {

    @Test
    public void test3(){

        openLoginPage()
                .loginAsAdmin("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw")
                .selectCategoriesFromCatalogueMenu()
                .clickOnAddNewCategoryBtn()
                .addNewCategoriesWithRandomName()
                .checkSuccessMessageIsShown()
                .filterGridWithSpecificCategory(GeneralActions.unchangedCategoryName)
                .checkNewlyCategorieInTheGrid();
    }
}
