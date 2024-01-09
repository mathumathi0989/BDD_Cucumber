#Author: Mathumathi

Feature: To verify login functionality

 
  Scenario: Verify if login is working fine
    Given user navigates to login page
    When user enters the login details
    Then user should be able to view the product list page
 

 # @tag2
 # Scenario Outline: Verify if login is working fine with 
 #   Given user navigates to login page
   # When user enter  <userid> and <password> in login page
  #  Then user should be able to view the product list page if logged correctly

   # Examples: 
   #   | userid  | password |
    #  | standard_user |    secret_sauce |
    #  | locked_out_user |     7 | 
