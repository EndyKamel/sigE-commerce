package org.example.stepDefs;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D07_followUsStepDef {

    P03_homePage homePage = new P03_homePage();

    @When("user click facebook link")
    public void user_click_facebook_link()
    {
        String expected="https://www.facebook.com/nopCommerce";
        String actual= homePage.ClickOnfacebookLinkToGetURL();
        System.out.println("actual URL "+actual);
        Assert.assertTrue(actual.contains(expected));
    }

    @When("user click twitter link")
    public void userClickTwitterLink()
    {
        String expected="https://twitter.com/nopCommerce";
        String actual= homePage.ClickOntwitterLinkToGetURL();
        System.out.println("actual URL "+actual);
        Assert.assertTrue(actual.contains(expected));

    }

    @When("user click rss link")
    public void userClickRssLink()
    {
        String expected="https://demo.nopcommerce.com/news/rss/1";
         homePage.ClickOnrssLinkToGetURL();

    }

    @When("user click youtube link")
    public void userClickYoutubeLink()
    {
        String expected="https://www.youtube.com/user/nopCommerce";
        String actual= homePage.ClickOnYoutubeLinkToGetURL();
        System.out.println("actual URL "+actual);
        Assert.assertTrue(actual.contains(expected));
    }
}
