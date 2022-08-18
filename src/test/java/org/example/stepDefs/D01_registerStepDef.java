package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    // Create new object from resister page
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void register_page()
    {
        //System.out.println("test first step");
        //Hooks.driver.findElement(By.className("ico-register")).click();
        register.registerBtn.click();
    }
    @When("user select gender type")
    public void select_gender()
    {
        register.gendertype("gender-female").click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String FName, String Lname)
    {
        register.FirstNamePom().sendKeys(FName);
        register.LastNamePom().sendKeys(Lname);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth()
    {
        Select select = new Select(register.DateOfBirthDayPom());
        select.selectByIndex(2);

        select=new Select(register.DateOfBirthMonthPom());
        select.selectByValue("11");

        select = new Select(register.DateOfBirthYearPom());
        select.selectByValue("1995");

        //System.out.println(select);
    }

    @And("user enter email field")
    public void userEnterEmailField()
    {
        Faker faker = new Faker();
        String email = faker.internet().safeEmailAddress();
        register.EmailPom().sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String password, String confirm_password)
    {
        register.PasswordPom().sendKeys(password);
        register.ConfirmPasswordPom().sendKeys(confirm_password);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        register.registerbuttonPom().click();
    }
SoftAssert softAssert = new SoftAssert();
    @And("success message is displayed")
    public void successMessageIsDisplayed()
    {
        String expectedresult ="Your registration completed";
        String actualresult = register.ActualresultMassgPom().getText();
        softAssert.assertTrue(actualresult.contains(expectedresult));
        softAssert.assertEquals(actualresult.contains(expectedresult),true);
        System.out.println( Hooks.driver.findElement(By.className("result")).getCssValue("color"));
        String expectedcolor = "rgba(76, 177, 124, 1)";
        String actualcolor = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        softAssert.assertTrue(actualcolor.contains(expectedcolor));
        softAssert.assertEquals(actualcolor.contains(expectedcolor),true);
        softAssert.assertAll();

    }
}
