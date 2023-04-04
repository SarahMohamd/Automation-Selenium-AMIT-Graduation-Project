package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

    P03_homePage search = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    @Given("user enters {string}")
    public void enterProductName(String value) {

        search.fillSearchTxtField(value);
    }

    @When("user clicks search button")
    public void clickOnSearchBtn(){

        search.clickOnSearchBtn();
    }


    @Then("the product appears")
    public void assertFirstScenario() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        System.out.println("Number of search products result is" + Hooks.driver.findElements(By.className("product-title")).size());
        softAssert.assertTrue(search.loopingSearchResult().toLowerCase().contains((Hooks.driver.findElement(By.id("small-searchterms"))).getText()));
        softAssert.assertAll();

    }

    @Then("click on the product in the result")
    public void clickOnTheProductInTheResult() {
        search.clickOnProductResult();
    }


    @Then("right product appears")
    public void assertSecondScenarioSku() {
        Assert.assertTrue((Hooks.driver.findElement(By.className("value"))).getText().contains((Hooks.driver.findElement(By.id("small-searchterms"))).getText()));
    }


}
