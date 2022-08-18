package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    //Constructor
    public P02_login(){PageFactory.initElements(Hooks.driver,this);}

    @FindBy(className = "ico-login")
    public WebElement loginBtn;

    public WebElement EmailPom(){return Hooks.driver.findElement(By.id("Email")); }
    public WebElement Password(){return Hooks.driver.findElement(By.id("Password"));}
    public WebElement LoginButtonClick(){return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));}
    public void reloodloginpageMyAccount()
    {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public WebElement SussesLogInMyAccount(){return Hooks.driver.findElement(By.linkText("My account"));}
    public WebElement FailedLogInMassge(){return Hooks.driver.findElement(By.className("message-error"));}

}
