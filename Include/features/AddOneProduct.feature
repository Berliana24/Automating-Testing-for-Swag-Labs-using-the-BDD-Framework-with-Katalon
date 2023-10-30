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
Feature: Add One Product Functionality

  @TC_BDD_AddOneProduct001
  Scenario Outline: Add one product to cart page
    Given User has opened Swag Labs https://www.saucedemo.com/
    When Enter valid <username> and <password>
    And Click button login
    
    When Click the Add to Cart button on the inventory page
    Then See the number of products in the cart increase in the Cart Icon
    
    When Click the cart icon
    Then Will be redirected to the cart page
    And See one product in cart with the details of the previously added product

    Examples:
  		| username      | password                 | 
 			| standard_user | qcu24s4901FyWDTwXGr6XA== |