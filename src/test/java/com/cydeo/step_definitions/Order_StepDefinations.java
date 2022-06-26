package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.OrderPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_StepDefinations {

WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
BasePage basePage=new BasePage();
OrderPage orderPage=new OrderPage();

    @Given("user is already logged in and on order page")
    public void userIsAlreadyLoggedInAndOnOrderPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        webTableLoginPage.login();

        basePage.order.click();

    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String string) {
        Select select=new Select(orderPage.productDropdown);
        select.selectByVisibleText(string);
    }

   // @And("user enters quantity {string}")
    //public void userEntersQuantity(String string) {

    //}
    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {
        //clear delete whatever is in the box
        orderPage.inputQuantity.clear();
        //TEK TEK SILER
        orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        orderPage.inputQuantity.sendKeys(quantity+"");
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String string) {
    }

    @And("user enters street {string}")
    public void userEntersStreet(String string) {
    }

    @And("user enters city {string}")
    public void userEntersCity(String string) {
    }

    @And("user enters state {string}")
    public void userEntersState(String string) {
    }

    @And("user enters zipcode {string}")
    public void userEntersZipcode(String string) {
    }

    @And("user selects credit card type {string}")
    public void userSelectsCreditCardType(String string) {
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String string) {
    }

    @And("user enters expiry date {string}")
    public void userEntersExpiryDate(String string) {
    }

    @And("user enters process order button")
    public void userEntersProcessOrderButton() {
    }

    @Then("user should see {string} in first row of the web table")
    public void userShouldSeeInFirstRowOfTheWebTable(String string) {
    }


}
