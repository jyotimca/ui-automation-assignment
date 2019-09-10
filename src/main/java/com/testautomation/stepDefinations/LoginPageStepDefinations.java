package com.testautomation.stepDefinations;

import com.testautomation.pages.LoginPage;
import com.testautomation.utils.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageStepDefinations extends Base   {

    LoginPage login = new LoginPage();

    @Given("^I am logged in to GitHub$")
    public void i_am_logged_in_to_GitHub()  {

        Base.initialize_driver();
        login.login(prop.getProperty("username"),prop.getProperty("password"));
        System.out.println(login.verifyHomePageTitle());
        Assert.assertEquals("GitHub",login.verifyHomePageTitle());

    }
}
