Feature: Checkout

  Scenario Outline: Success checkout
    Given I open Login page
    When I input "<usernameValue>" to username field
    And input "<passwordValue>" to password field
    When I push the Login button
    Then I am on the page Inventory
    When I push the <arg0>-th "<arg1>" button
    When I push the <arg01>-th "<arg1>" button
    Examples:
      | usernameValue | passwordValue | arg0 | arg1        | arg01 |
      | standard_user | secret_sauce  | 1    | Add to cart | 2     |
    When I push the button shopping_cart_link
    Then I open Your_Cart_Link page

#  Scenario: Success checkout
#    Given I open Login page
#    When I input "standard_user" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then I am on the page Inventory
#
#    When I push Backpack Add to cart button
#    And  I push Bike Light Add to cart button
#    And I press Cart icon
#    Then I am in Cart Page
#    When I push Checkout Button
#    Then I am in Your Information Page
#    When I input my "Ivan" , "Ivanov" and "12345"
#    And I push the Continue Button
#    Then I am in Checkout Page
#    When I push Finish Button
#    Then I am in Complete Page