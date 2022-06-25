package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

import java.sql.SQLOutput;

public class Hooks {

@Before(order = 0)
public void setupScenario(){
    System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before (value = "@login", order = 1)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before (value = "@db", order = -1)
    public void setupScenarioForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }


    @After
public void teardownScenario(){
        Driver.closeDriver();

  //  System.out.println("====Closing browser using cucumber @After");
 //   System.out.println("====Scenario ended/ Take screenshot if failed.");
}
  @BeforeStep
    public void setupStep(){
      System.out.println("------applying setup using @BeforeStep");
  }
  @AfterStep
    public void afterStep(){
      System.out.println("------> applying tearDown using @AfterStep");
  }
}
