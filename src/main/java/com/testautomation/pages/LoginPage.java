package com.testautomation.pages;

import com.testautomation.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    //Page Factory - OR:
    //@FindBy(name="login")
    //WebElement username;

    //@FindBy(id="password")
    //WebElement password;


    //@FindBy(xpath="//input[contains(@value,'Sign in')]")
    //WebElement signUpBtn;

    //Initializing the Page Objects:
    public LoginPage(){
        System.out.println("I am on login Page");
    }

    public HomePage login(String un, String pwd){

        driver.findElement(By.name("login")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[contains(@value,'Sign in')]")).click();

        //signUpBtn.click();


        return new HomePage();
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

}
