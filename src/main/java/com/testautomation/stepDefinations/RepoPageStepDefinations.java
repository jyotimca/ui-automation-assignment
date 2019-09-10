package com.testautomation.stepDefinations;

import com.testautomation.pages.RepoPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class RepoPageStepDefinations {

    RepoPage rpage = new RepoPage();

    @Then("^I fork the project$")
    public void i_fork_the_project()  {
        // Write code here that turns the phrase above into concrete actions
        rpage.forkProject();

    }

    @Then("^I mark the new project as star$")
    public void i_mark_the_new_project_as_star()  {
        // Write code here that turns the phrase above into concrete actions
        rpage.starProject();

    }
}
