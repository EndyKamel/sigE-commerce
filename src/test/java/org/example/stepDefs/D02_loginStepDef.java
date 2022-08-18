package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login= new P02_login();

    @Given("user go to login page")
    public void login_page()
    {
        login.loginBtn.click();
    }

    @And("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String Vemail, String Vpassword)
    {
        login.EmailPom().sendKeys(Vemail);
        login.Password().sendKeys(Vpassword);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.LoginButtonClick().click();

    }
    SoftAssert softAssert1 = new SoftAssert();
    @And("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {
        login.reloodloginpageMyAccount();
        String expectedresultMYAccount= "My account";
        String actualresultMYAccount=login.SussesLogInMyAccount().getText();
        softAssert1.assertTrue(actualresultMYAccount.contains(expectedresultMYAccount));
        softAssert1.assertEquals(actualresultMYAccount.contains(expectedresultMYAccount),true);
        softAssert1.assertAll();
    }

    @And("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String InVemail, String InVpassword)
    {
        login.EmailPom().sendKeys(InVemail);
        login.Password().sendKeys(InVpassword);
        login.LoginButtonClick().click();
    }
    SoftAssert softAssert2 = new SoftAssert();

    @And("user could not login to the system")
    public void userCouldNotLoginToTheSystem()
    {
        String expectedMassge ="Login was unsuccessful.";
        String actualMessage = login.FailedLogInMassge().getText();
        //System.out.println(actualMessage);
        softAssert2.assertTrue(actualMessage.contains(expectedMassge));
        softAssert2.assertEquals(actualMessage.contains(expectedMassge),true);
        System.out.println( Hooks.driver.findElement(By.className("message-error")).getCssValue("color"));
        String expectedcolor ="rgba(228, 67, 75, 1)";
        String actualcolor =Hooks.driver.findElement(By.className("message-error")).getCssValue("color");
        softAssert2.assertTrue(actualcolor.contains(expectedcolor));
        softAssert2.assertEquals(actualcolor.contains(expectedcolor),true);
        softAssert2.assertAll();

    }
}
