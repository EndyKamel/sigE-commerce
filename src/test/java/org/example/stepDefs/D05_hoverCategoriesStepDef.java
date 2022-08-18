package org.example.stepDefs;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("you should hover on the selected category")
    public void Hover() throws InterruptedException
    {
       // Actions actions=new Actions(Hooks.driver);
       // List<WebElement> mainLinks = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
//        System.out.println(mainLinks.get(3).getText());
        int count = homePage.mainLinks.size();
        System.out.println("count is "+count);
        int min = 0;
        int max = count-1;
        int selectedCategory = (int)Math.floor(Math.random()*(max-min+1)+min);
        homePage.actions.moveToElement(homePage.mainLinks.get(selectedCategory)).perform();
        String selectedCategoryText = homePage.mainLinks.get(selectedCategory).getText();
        System.out.println("to know which category is selected:   " +selectedCategoryText);
        Thread.sleep(2000);


       String locator = "(//ul[@class='top-menu notmobile']//ul)["+(selectedCategory+1)+"]/li";
        List<WebElement> subCategoryLinks = Hooks.driver.findElements(By.xpath(locator));

        // minimize implicit wait to not waste time if it's empty
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        String selectedSubCategoryText;
        if(!subCategoryLinks.isEmpty()) {
            int subCategoryCount = subCategoryLinks.size();
            System.out.println("profile links " + subCategoryCount);
            System.out.println(subCategoryLinks.get(0).getText());
            System.out.println(subCategoryLinks.get(1).getText());
            System.out.println(subCategoryLinks.get(2).getText());
            max = subCategoryCount-1;
            int selectedSubCategory = (int) Math.floor(Math.random() * (max - min + 1) + min);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            System.out.println("selected from subCategory "+selectedSubCategoryText);
            subCategoryLinks.get(selectedSubCategory).click();
            // Do your assertion on selected sub category
        }
        else
        {
            homePage.mainLinks.get(selectedCategory).click();
            // Do your assertion on selected main category
        }

        // reset it to the initial value
        Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
}
