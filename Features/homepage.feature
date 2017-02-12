
@homePage

Feature: validate home page features
  
    @verifyLogo
    Scenario: Verify logo on the navigation bar of the page
    Given I am at the homepage
    Then verify the logo on navigation bar
    
    @verifyDropdownList
    Scenario Outline: Verify dropdown menu is displayed on hovering navigation items
    Given I am at the homepage
    When I hover on <item>
    Then I see below dropdown list
    |list item      |
    | <list_item_1> |
    | <list_item_2> |
    | <list_item_3> |
    | <list_item_4> |
    
    Examples:
    | item   | list_item_1 | list_item_2 | list_item_3 | list_item_4 |
    | Games  | Arcade      | Sports      | RPG         | Adventure   |
    | Movies | Action      | Comedy      | Thriller    | Sci-Fi      |
    | Mobiles| Apple       | Motorola    | Blackberry  | Sony        |
    | Books  | Novels      | Literature  | Academics   | Biography   |
    
    
    @verifyProducts
    Scenario: verify the products are displayed
    Given I am at the homepage
    Then verify list of products is displayed
    And verify image is displayed for each product
    And verify title is displayed for each product
    And verify manufacturer is displayed for each product
    And verify description is displayed for each product
    And verify price is displayed for each product
    And verify add to cart button is displayed for each product
    
  