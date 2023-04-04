package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.openqa.selenium.support.Color;

public class P03_homePage {

    // currencies feature

    public void selectEuro(){
        Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        select.selectByVisibleText("Euro");

    }

    public String loopFourProductsHomePage(){
        String output = null;
        int i;
        List<WebElement> fourProducts= Hooks.driver.findElements(By.className("add-info"));
        for(  i =0; i< fourProducts.size();i++)
        {
           output=  fourProducts.get(i).getText();
        }
        return output;
    }

    // search feature

 public void fillSearchTxtField(String value){
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(value);
 }
 public void clickOnSearchBtn(){
        Hooks.driver.findElement(By.cssSelector("button.button-1.search-box-button")).click();
 }
 public String loopingSearchResult(){
        String output = null;
        int i;
         List<WebElement> productsAfterSearch = Hooks.driver.findElements(By.className("product-title"));
        for(i=0;i<productsAfterSearch.size();i++){
            output= productsAfterSearch.get(i).getText();
        }
        return output;

 }
 public void clickOnProductResult(){

        Hooks.driver.findElement(By.className("product-title")).click();
 }

 // hover feature
    public void hoverOnComputers(){
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(Hooks.driver.findElement(By.linkText("Computers"))).perform();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getTextDesktops(){
       return (Hooks.driver.findElement(By.cssSelector("ul.top-menu.notmobile li a[href=\"/desktops\"]"))).getText().toLowerCase().trim();
    }

    public void selectDesktops(){
        (Hooks.driver.findElement(By.cssSelector("ul.top-menu.notmobile li a[href=\"/desktops\"]"))).click();


    }
    public String getHeaderDesktops(){
        return (Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"))).getText().trim().toLowerCase();
    }

    //homeSliders feature


 public void clickOnFirstHomeSlider() {
     List <WebElement> homeSliders = Hooks.driver.findElements(By.className("nivo-imageLink"));
        homeSliders.get(0).click();

 }

 public void clickOnSecondHomeSlider()  {
     List <WebElement> homeSliders = Hooks.driver.findElements(By.className("nivo-imageLink"));

       /*WebDriverWait wait = new WebDriverWait(Hooks.driver,30);
       wait.until(ExpectedConditions.attributeToBe(By.cssSelector("#nivo-slider a:nth-of-type(2)[href]"),"style", "display: none;"));
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#nivo-slider a:nth-of-type(2)[href]")));
       The element is not visisble nor clickable as its value equals null */

     homeSliders.get(1).click();
 }

 // followUs feature
    public void scrollToBottom(){
        JavascriptExecutor jse= (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,600)");
    }
    public void clickOnFacebook(){

        Hooks.driver.findElement(By.linkText("Facebook")).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }


    public void clickOnTwitter(){

        Hooks.driver.findElement(By.linkText("Twitter")).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

    public void clickOnRss(){

        Hooks.driver.findElement(By.linkText("RSS")).click();

    }

    public void clickOnYoutube(){

        Hooks.driver.findElement(By.linkText("YouTube")).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList <String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

    //wishlist feature
    public void scrollToBottomWishList(){
        JavascriptExecutor jse= (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,500)");
    }

    public void clickOnHeartIcon(){
        Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"] button[class='button-2 add-to-wishlist-button'] ")).click();


    }
    public Boolean getSuccessMsg(){
       return Hooks.driver.findElement(By.cssSelector("div[id='bar-notification'] div[class='bar-notification success'] ")).isDisplayed();
    }
    public String getSuccessMsgColor(){

      String color=  Hooks.driver.findElement(By.cssSelector("div[id='bar-notification'] div[class='bar-notification success'] ")).getCssValue("background-color");
      String hex= Color.fromString(color).asHex();
      return hex;

    }

    public void waitForInvisibilityOfSuccessMsg(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[id='bar-notification'] div[class='bar-notification success'] ")));
    }

    public void clickOnWishlistTab(){
        Hooks.driver.findElement(By.className("wishlist-label")).click();
    }
    public String getQtyValue(){
       return Hooks.driver.findElement(By.cssSelector(" input[class='qty-input']")).getAttribute("value");

    }





}
