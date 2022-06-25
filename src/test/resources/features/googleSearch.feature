Feature: Google search functionality
  Agile story : As a user , when I am on the Google search page
  i hould be able to search whatever I want and see relevant information

  Scenario:  Search page tiitle verification
    When user is on Google search page
    Then user should see title is Google

  Scenario: Search functoionality result title verification
    Given user is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the google title


  Scenario: Search functoionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title


