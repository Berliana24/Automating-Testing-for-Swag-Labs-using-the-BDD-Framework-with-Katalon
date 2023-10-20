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
Feature: Checkout02

  @TC_BDD_Checkout02001
  Scenario Outline: Verify checkout step two
    Given User has opened Swag Labs https://www.saucedemo.com/
    When Enter valid <username> and <password>
    And Click button login
    
    When Click the Add to Cart button on the inventory page
    Then See the number of products in the cart increase in the Cart Icon
    
    When Click the cart icon
    Then Will be redirected to the cart page
    And See the details of the previously added product, including the product name, product description, and product price
    
    When Click Checkout button
    Then Will be redirected to the checkout step one page
    And fills valid <first_name>, <last_name> and <postalCode>
    
    When Click Continue button
    Then See the detail product in checkout step two page with the information of payment, shipping, price total and total
    
    When Click finish button 
    Then See the message thank you for your order!
    
    Examples:
  		| username      | password                 | first_name | last_name | postalCode |
 			| standard_user | qcu24s4901FyWDTwXGr6XA== | Berliana   | Laurenza  | 89768      |
    