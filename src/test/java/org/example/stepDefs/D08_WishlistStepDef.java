package org.example.stepDefs;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {

    P03_homePage homePage = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();
    @When("user click on wishlist button of products")
    public void user_click_wishlist_button()
        {
            homePage.onclickwishMessage();
            String expectedresult ="The product has been added to your wishlist";
            String actualresult=homePage.getMessage;
            softAssert.assertTrue(actualresult.contains(expectedresult));
            softAssert.assertEquals(actualresult.contains(expectedresult),true);
            String expectedcolor ="rgba(75, 176, 122, 1)";
            String actualcolor=homePage.getcolor;
            softAssert.assertTrue(actualcolor.contains(expectedcolor));
            softAssert.assertEquals(actualcolor.contains(expectedcolor),true);
            softAssert.assertAll();

        }

    @When("user click Wishlist Tab After success message disappear")
    public void userClickWishlistTabAfterSuccessMessageDisappear()
    {
        homePage.onclickwish();
    }
}
