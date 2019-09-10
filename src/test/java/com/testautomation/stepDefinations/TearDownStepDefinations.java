package com.testautomation.stepDefinations;

import com.testautomation.utils.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class TearDownStepDefinations extends Base{
    @And("^I close the browser$")
    public void iCloseTheBrowser()  {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}
