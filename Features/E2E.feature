@E2E
Feature: E2E features
     
    @e2e
    Scenario: verify the user navigates to cart page on adding a product to cart
    Given I am at the homepage
    When I add product number 1 to cart
    Then verify cart section is displayed
    When I click on checkout button
    And I login with username as "Suraj" and password as "suraj"
    When I enter "suraj" in full name
    And I enter "phase2" in address1
    And I enter "hinjewadi" in address2
    And I enter "pune" in city
    And I enter "521452" in zip code
    And I enter "Maharashtra" in State
    And I click on save address button
    And I click on continue to payment button
    
    When I enter "555544446666" in card number
    And I enter "suraj" in name on card
    And I enter "12" in expiry month
    And I enter "21" in expiry year
    And I enter "544" in cvv code
    And I click on Pay button
    
    Then verify order successful message is displayed as "Thanks for placing your order!! Your order will be dispatched soon!!"
    And verify order status of product is "Pending"