@inventory
Feature: Inventory
Background:
  Given I open Login page
  When I input "standard_user" to username field
  And input "secret_sauce" to password field
  When I push the Login button

  Scenario: 6 inventory items are displayed
    Then I am on the page Inventory
    And I see the 6 items on the page Inventory

#@sorting_A-Z
#  Scenario: Sorting by name a-z
#    Then I am on the page Inventory
#    And  I push the sort menu by name a-z
#    Then I see the sorted  items on the page
  @sort_name_az
  Scenario: Sorting by name A-Z
    When I choose sort option by name A-Z
    Then all items sorted by name alphabetically

  @sort_name_za
  Scenario: Sorting by name Z-A
    When I choose sort option by name Z-A
    Then all items sorted by name unalphabetically

  @sort_price_fromLowToHigh
  Scenario: Sorting by price from low to high
    When I choose sort option by price from low to high
    Then all items sorted by price from low to high

