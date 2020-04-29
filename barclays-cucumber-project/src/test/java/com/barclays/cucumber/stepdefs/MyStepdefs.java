package com.barclays.cucumber.stepdefs;

import com.barclays.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Bank Tab$")
    public void iClickOnBankTab() {
        new HomePage().clickonBankTab();

    }

    @And("^I click on Switch to bank Account tab$")
    public void iClickOnSwitchToBankAccountTab() {
        new HomePage().clickOnSwitchAccountTab();

    }

}

