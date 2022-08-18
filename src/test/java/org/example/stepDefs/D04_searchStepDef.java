package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D04_searchStepDef {



 P03_homePage homePage = new P03_homePage();





    @Given("user write {string}")
    public void userWrite(String search)
    {
        homePage.Searchkeyword().sendKeys(search);
    }

    @And("press on search button")
    public void pressOnSearchButton()
    {
        homePage.SearchBtn.click();
    }

    @When("user could search using {string} and Count number of search")
    public void userCouldSearchUsing(String searchname)
    {
        homePage.reloodSearchpageMyAccount(searchname);
        System.out.println( homePage.sizzzz);
    }


}
