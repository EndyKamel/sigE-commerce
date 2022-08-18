package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class P03_homePage {

    public P03_homePage(){PageFactory.initElements(Hooks.driver,this);}

    public WebElement Changecurrency(){return Hooks.driver.findElement(By.id("customerCurrency"));}
   // public List<WebElement> EurocurrencyProductss(){return Hooks.driver.findElement(By.className("dd"));}


    @FindBy(css=("span[class='price actual-price']"))
    public List<WebElement> EurocurrencyProducts;

    @FindBy(className=("product-item"))
    public List<WebElement> results;
    //public WebElement SearchButtonClick(){return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));}

    public WebElement Searchkeyword(){return Hooks.driver.findElement(By.id("small-searchterms")); }

    @FindBy(className = "button-1")
    public WebElement SearchBtn;

   public List<WebElement> searchcounters = Hooks.driver.findElements(By.cssSelector("span[class='price actual-price']"));
  public int sizzzz=0;
   public void reloodSearchpageMyAccount(String st)
    {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/search?q="+st);
        sizzzz= Hooks.driver.findElements(By.cssSelector("span[class='price actual-price']")).size();

    }

    public WebElement assertSerialProduct() {

        return Hooks.driver.findElement(By.className("sku"));
    }
//////////////////////////////////////////////////////////////////////////////////// Hover
   public Actions actions=new Actions(Hooks.driver);
   public List<WebElement> mainLinks = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));

///////
public WebElement ClickOnFirstSlider(){return Hooks.driver.findElement(By.id("nivo-slider"));}

public String ClickOnFirstSliderDriver()
{
    String gettheurl= Hooks.driver.getCurrentUrl();
   return gettheurl;
}
///////////////


    public String ClickOnfacebookLinkToGetURL()
    {

        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        String GetTheUrl=Hooks.driver.getCurrentUrl();

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //String GetTheUrl= "https://www.facebook.com/nopCommerce";
        return GetTheUrl;


    }
    public String ClickOntwitterLinkToGetURL()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        String GetTheUrle=Hooks.driver.getCurrentUrl();

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //String GetTheUrl= "https://www.facebook.com/nopCommerce";
        return GetTheUrle;
    }

    public void ClickOnrssLinkToGetURL()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());



        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

    }

    public String ClickOnYoutubeLinkToGetURL()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        //2- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());

        //3- switch from tab 0 to tab 1
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println("tab 1:  " +Hooks.driver.getCurrentUrl());

        String GetTheUrle=Hooks.driver.getCurrentUrl();

        //4- switch from tab 1 to tab 0
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println("tab 0:  " + Hooks.driver.getCurrentUrl());


        //Difference between driver.quit() and driver.close()
        Hooks.driver.close();


        // reload
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        //String GetTheUrl= "https://www.facebook.com/nopCommerce";
        return GetTheUrle;
    }


    /////////
public String getcolor;
public String getMessage;
    public void onclickwishMessage()
    {
        List<WebElement> wishlistbtns = Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
        //[0, 1, 2, 3]
        wishlistbtns.get(2).click();

        //2- click on x button
        Hooks.driver.findElement(By.cssSelector("span[title=\"Close\"]")).click();

        //3- wait until green line is disappeared using explicit wait
        //3.1- Create new object from WebDriverWait
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //3.2- wait until element is dissappeared from UI Page
//        WebElement successBar = driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
//        wait.until(ExpectedConditions.invisibilityOf(successBar));
//another method
        WebElement wishlist = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(wishlist));

        System.out.println("actualMessage "+Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText());
        getMessage=Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        System.out.println("actualcolor "+Hooks.driver.findElement(By.className("bar-notification")).getCssValue("background-color"));
        getcolor=Hooks.driver.findElement(By.className("bar-notification")).getCssValue("background-color");


    }
    public void onclickwish()
    {
       // Hooks.driver.findElement(By.cssSelector("button[onclick=\"return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1\"]")).click();

        onclickwishMessage();

        //4- go to wishlist page
        Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]")).click();


        // 5- get qty value and assert it's larger than zero
        String count =  Hooks.driver.findElement(By.className("qty-input")).getAttribute("value");

        int countint=    Integer.parseInt(count);

        Assert.assertTrue(countint>0);
    }

}
