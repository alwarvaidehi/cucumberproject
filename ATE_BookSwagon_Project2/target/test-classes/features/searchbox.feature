Feature: search box testing
@all
  Scenario: search item in the search box  scenario
    Given user entering the search item in the search box
    And User click on search button
    When User click on wishList
    And User enter the login Email as '<email>' and password as '<password>'
    And user click on login button

    Examples: 
      | email              | password | 
      | vijayvel10301@gmail.com |   group@123 | 
   
   
    