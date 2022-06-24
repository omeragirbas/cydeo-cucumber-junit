package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
 //constructor bu
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "q")
    public WebElement searchBox;
}
