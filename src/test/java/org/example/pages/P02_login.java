package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class P02_login {

    public void openLoginPage(){
        Hooks.driver.findElement(By.className("ico-login")).click();
    }

    public void enterEmailTxtField(){
        Hooks.driver.findElement(By.id("Email")).sendKeys("test9@example.com");
    }

    public void enterPasswordTxtField(){

        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
    }

    public void clickOnLoginBtn(){

        Hooks.driver.findElement(By.cssSelector("button.button-1.login-button")).click();
    }
    public void enterInvalidEmail(){
        Hooks.driver.findElement(By.id("Email")).sendKeys("test2@test.com");
    }
    public void enterInvalidPassword(){
        Hooks.driver.findElement(By.id("Password")).sendKeys("test2.com");
    }
}
