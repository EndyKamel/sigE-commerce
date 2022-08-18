package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {

    //Constructor
    public P01_register()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerBtn;

//    @FindBy(id="gender")
//    WebElement genderPF;

    public WebElement gendertype(String gender)
    {
        return Hooks.driver.findElement(By.id(gender));
    }
    //public WebElement passwordPOM(){return driver.findElement(By.name("password")); }

    public WebElement FirstNamePom(){ return Hooks.driver.findElement(By.id("FirstName")); }
    public WebElement LastNamePom(){ return Hooks.driver.findElement(By.id("LastName")); }
    public WebElement DateOfBirthDayPom() { return Hooks.driver.findElement(By.name("DateOfBirthDay"));}
    public WebElement DateOfBirthMonthPom() { return Hooks.driver.findElement(By.name("DateOfBirthMonth"));}
    public WebElement DateOfBirthYearPom() { return Hooks.driver.findElement(By.name("DateOfBirthYear"));}
    public WebElement EmailPom(){ return Hooks.driver.findElement(By.id("Email")); }

    public WebElement PasswordPom(){ return Hooks.driver.findElement(By.id("Password")); }
    public WebElement ConfirmPasswordPom(){ return Hooks.driver.findElement(By.id("ConfirmPassword")); }
    public WebElement registerbuttonPom(){ return Hooks.driver.findElement(By.id("register-button"));}
    public By registercompletPom(){return By.className("result");}
    public WebElement ActualresultMassgPom(){ return Hooks.driver.findElement(registercompletPom());}
    //String coloactual = Hooks.driver.findElement(By.className("result")).getCssValue("color");
//    public String retcol()
//    {
//        return coloactual;
//    }
}
