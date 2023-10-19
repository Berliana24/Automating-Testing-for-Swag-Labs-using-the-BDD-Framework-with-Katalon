#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Functionality
Feature: Login
  
  @TC_BDD_Login001
  Scenario Outline: Verify valid login
    Given User has opened Swag Labs https://www.saucedemo.com/
    When Enter valid <username> and <password>
    And Click button login
    Then Showing Swag Labs tittle at the top of the page

    Examples: 
      | username  | password |
      | standard_user | qcu24s4901FyWDTwXGr6XA== |
      
  @TC_BDD_Login002
  Scenario Outline: Verify invalid login
    Given User has opened Swag Labs https://www.saucedemo.com/
    When Enter invalid <username> and <password>
    And Click button login
    Then Showing alert 'Sorry, this user has been locked out'

    Examples: 
      | username  | password |
      | locked_out_user | qcu24s4901FyWDTwXGr6XA== |
      
   @TC_BDD_Login003
   Scenario Outline: Verify problem login
    Given User has opened Swag Labs https://www.saucedemo.com/
    When Enter problem <username> and <password>
    And Click button login
    Then The image is not show-up

    Examples: 
      | username  | password |
      | problem_user | qcu24s4901FyWDTwXGr6XA== |