package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


public class D07_followUsStepDef {
    P03_homePage followUs = new P03_homePage();

    @Given("user scrolls down")
    public void scrollDown(){

        followUs.scrollToBottom();
    }
    @When("user clicks on {string}")
    public void clickOnFacebook(String page){
        switch (page){
            case "facebook":
                followUs.clickOnFacebook();
                break;
            case "twitter":
                followUs.clickOnTwitter();
                break;
            case "rss":
                followUs.clickOnRss();
                break;
            case "youtube" :
                followUs.clickOnYoutube();
                break;
            default:
                System.out.println("There is no such a page");


        }


    }



    @Then("user is successfully on {string}")
    public void assertUrl(String expectedResult){
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),expectedResult);
    }



}
