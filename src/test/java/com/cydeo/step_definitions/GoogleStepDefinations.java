package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepDefinations {
    @When("user is on Google sarch page")
    public void user_ison_google_sarch_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle="Google";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();
    }
}
