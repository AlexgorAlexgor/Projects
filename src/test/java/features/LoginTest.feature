@login
Feature: Login
  Background:
    Given I open Login page

@success_login
  Scenario: Success login with valid data
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  @success_logout
  Scenario: Success logout with valid data
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory
    When I push the Logout button
    Then I am on the page Login

#@locked_out_user
#  Scenario: Unsuccessful login with  locked out user
#    When I input "locked_out_user" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then I am on the text "Epic sad-face: Sorry, this user has been locked out."

#  @invalid_password
#  Scenario: Unsuccessful login with invalid password
#    When I input "standard_user" to username field
#    And input "invalid_password" to password field
#    When I push the Login button
#    Then Test unsuccessed , I am on the text "Epic sadface: Sorry, this user has been locked out."

#  @invalid_username
#  Scenario: Unsuccessful login with invalid username
#    When I input "standard_userr" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then I am on the text "<errorMessageText>"


  @invalid_data
  Scenario Outline: Login with invalid data
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error message about invalid user with text "<errorMessageText>" is displayed
    Examples:
      |username        | password     |errorMessageText                                             |
      |standard_user   | 34567890     |Username and password do not match any user in this service  |
      |standard_userr  | secret_sauce |Username and password do not match any user in this service  |
      |locked_out_user |secret_sauce  |Sorry, this user has been locked out.                        |

    @empty_fields
    Scenario Outline: login with empty fields
      When I input "<username>" to username field
      And input "<password>" to password field
      When I push the Login button
      Then error message about empty user_data with text "<errorMessageText>" is displayed
      Examples:
        |username        | password     |errorMessageText     |
        |                | 34567890     |Username is required |
        |standard_user   |              |Password is required |
        |                |              |Username is required |
