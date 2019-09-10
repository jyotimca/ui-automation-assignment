package com.testautomation.stepDefinations;

import com.testautomation.pages.HomePage;
import com.testautomation.pages.RepoPage;
import com.testautomation.pages.SearchResultPage;
import com.testautomation.utils.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SearchPageStepDefinations {

    HomePage homePage = new HomePage();
    SearchResultPage srpage= new SearchResultPage();
    RepoPage rpage = new RepoPage();

    @Given("^I search for project written in \"([^\"]*)\" Language$")
    public void i_search_for_project_written_in_Language(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        homePage.searchRepo();

    }

    @Then("^I sort the search in \"([^\"]*)\"$")
    public void i_sort_the_search_in(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        srpage.sortResult();

    }

    @Then("^I click on first result$")
    public void i_click_on_first_result()  {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(10,rpage.countResult());
        rpage.clickFirst();

    }
}
