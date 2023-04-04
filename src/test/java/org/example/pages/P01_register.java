package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    public void clickOnRegisterLink(){
        Hooks.driver.findElement(By.className("ico-register")).click();
    }


    public void clickOnFemaleGender(){
        Hooks.driver.findElement(By.id("gender-female")).click();
    }

    public void fillFirstName (){
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("automation");
    }


    public void fillLastNameTxtField(){
        Hooks.driver.findElement(By.id("LastName")).sendKeys("automation");
    }

    public void selectDayOfBirth(){
        Select select= new Select( Hooks.driver.findElement(By.name("DateOfBirthDay")));
       select.selectByVisibleText("28");
    }

    public void selectMonthOfBirth(){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByValue("10");
    }


    public void selectYearOfBirth(){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1998");
    }


    public void fillEmailTxtField(){
        Hooks.driver.findElement(By.id("Email")).sendKeys("test9@example.com");

    }


    public void fillPasswordTxtField(){
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");

    }

    public void fillConfirmPasswordTxtField(){
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");

    }


    public void clickOnRegisterBtn(){
        Hooks.driver.findElement(By.id("register-button")).click();
    }




}
