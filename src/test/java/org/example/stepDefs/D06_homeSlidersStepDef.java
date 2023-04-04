package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P03_homePage homeSliders = new P03_homePage();

    @Given("user clicks on the home slider")
    public void clickOnFirstSlider(){

        homeSliders.clickOnFirstHomeSlider();
    }


    @Then("user is redirected to the home page")
    public void assertFirstSlider() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"//demo.nopcommerce.com/nokia-lumia-1020");

    }

    @Given("user clicks on second home slider")
    public void clickOnSecondHomeSlider() {
        homeSliders.clickOnSecondHomeSlider();
    }

    @Then("user is on the home page")
    public void assertSecondSlider() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl()," https://demo.nopcommerce.com/iphone-6");

    }
}
