package org.example.stepDefs;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();
    @When("click on first slider")
    public void click_on_first_slider()
    {
        String expected="https://demo.nopcommerce.com/nokia-lumia-1020";
        homePage.ClickOnFirstSlider().click();
        String actual= homePage.ClickOnFirstSliderDriver();
        System.out.println(actual);
        Assert.assertEquals(actual.contains(expected),true);

    }

    @When("click on second slider")
    public void clickOnSecondSlider()
    {
        String expected="https://demo.nopcommerce.com/iphone-6";
        homePage.ClickOnFirstSlider().click();
        String actual= homePage.ClickOnFirstSliderDriver();
        System.out.println(actual);
        Assert.assertEquals(actual.contains(expected),true);

    }
}
