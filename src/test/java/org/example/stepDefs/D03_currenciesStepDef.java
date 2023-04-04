package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage currencies= new P03_homePage();

    @Given("user chooses Euro from dropdown list")
    public void selectEuroCurrency(){
        currencies.selectEuro();
    }


    @When("user can see € on four products on home page")
    public void assertEuroCurrency() {
        Assert.assertTrue(currencies.loopFourProductsHomePage().contains("€"));
    }
}
