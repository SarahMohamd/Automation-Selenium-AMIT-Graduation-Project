package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

     P02_login login = new P02_login();
    SoftAssert softAssert= new SoftAssert();

    @Given("user go to login page")
    public void goLoginPage(){

        login.openLoginPage();
    }

    @When("user enters valid email and password")
    public void enterValidEmailAndPassword() {
        login.enterEmailTxtField();
        login.enterPasswordTxtField();
    }

    @Then("user clicks login button")
    public void clickLoginButton() {
        login.clickOnLoginBtn();
    }

    @Then("user login is successful")
    public void assertLoginIsSuccessful() {
        softAssert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());
        softAssert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
        softAssert.assertAll();
    }

    @When("user enters invalid data")
    public void enterInvalidData() {
        login.enterInvalidEmail();
        login.enterInvalidPassword();
    }

    @Then("user login is unsuccessful")
    public void assertLoginIsUnsuccessful() {
     softAssert.assertTrue(Hooks.driver.findElement(By.cssSelector("div.message-error.validation-summary-errors")).getText().contains("Login was unsuccessful"));
     String color =Hooks.driver.findElement(By.cssSelector("div.message-error.validation-summary-errors")).getCssValue("color");
     String hex = Color.fromString(color).asHex();
     softAssert.assertTrue(hex.equals("#e4434b"));
     softAssert.assertAll();
    }
}
