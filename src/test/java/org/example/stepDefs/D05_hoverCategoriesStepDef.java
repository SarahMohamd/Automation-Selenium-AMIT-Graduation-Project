package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;


public class D05_hoverCategoriesStepDef {

     static String text = null;
    P03_homePage hover = new P03_homePage();

    @Given("user hovers on computers")
    public void hoverOnComputers(){

        hover.hoverOnComputers();
    }
    @When("user selects Desktops sub-category")
    public void selectDesktops(){
        text =  hover.getTextDesktops();
        System.out.println("The text in the sub-category is "+text);
        hover.selectDesktops();
    }

    @Then("user gets the desktops page")
    public void assertTheDesktopsPage() {
     Assert.assertEquals(hover.getHeaderDesktops(),text);

    }
}
