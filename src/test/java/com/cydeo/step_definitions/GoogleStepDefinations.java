package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class GoogleStepDefinations {
GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    Actions actions=new Actions(Driver.getDriver());

    @When("user types {word} and clicks enter")
    public void user_types_and_clicks_enter2(String searckeyword) {
        googleSearchPage.searchBox.sendKeys(searckeyword+Keys.ENTER);


    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searckeyword) {
        googleSearchPage.searchBox.sendKeys(searckeyword+Keys.ENTER);


    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
      //  String expectedTitle= "apple - Google Search";
        String expectedTitle= string+" - Google Search";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);

    }
    @When("user is on Google search page")
    public void user_is_on_google_sarch_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://www.google.com");
        googleSearchPage.accepted.click();
        googleSearchPage.english.click();


    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle="Google";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.closeDriver();
    }

    @Then("user sees {word} in the google title")
    public void user_sees_apple_in_the_google_title(String word) {
        String expectedTitle= word+" - Google Search";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);

    }

}
