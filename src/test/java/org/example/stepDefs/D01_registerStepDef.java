package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register= new P01_register();

    SoftAssert softAssert= new SoftAssert();
    @Given("user go to register page")
    public void goRegisterPage()
    {

       register.clickOnRegisterLink();

    }

    @When("user enters his valid data and press register")
    public void enterValidDataAndPressRegister() {

     register.clickOnFemaleGender();
     register.fillFirstName();
     register.fillLastNameTxtField();
     register.selectDayOfBirth();
     register.selectMonthOfBirth();
     register.selectYearOfBirth();
     register.fillEmailTxtField();
     register.fillPasswordTxtField();
     register.fillConfirmPasswordTxtField();
     register.clickOnRegisterBtn();
    }

    @Then("success message is displayed")
    public void assertSuccessMsg() {
    softAssert.assertTrue(Hooks.driver.findElement(By.cssSelector("div.result")).getText().equals("Your registration completed"));
    softAssert.assertTrue(Hooks.driver.findElement(By.cssSelector("div.result")).getCssValue("color").equalsIgnoreCase(Color.fromString("rgba(76, 177, 124, 1)").asRgb()));
    softAssert.assertAll();
    }
}
