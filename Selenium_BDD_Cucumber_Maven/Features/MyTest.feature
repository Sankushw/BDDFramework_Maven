## Keywords should start with Capital letters
## using right click--pretty format, format can be changed as done here
## Scenario Outline is used for for data driven testing using examples:
## using @tags to group scenarios together
Feature: To test the login in the application

  @Login @functionalTest  @smokeTest
  Scenario Outline: Test login with valid and invalid credentials
    Given Application is up and running
    When login with "<username>" and "<password>" credentials
    Then Login should be successful

    Examples: 
      | username | password |
      | test     | test     |
      | dev      | DEV      |
      | SANJAY   | SANJAY   |
      | admin    | admin123 |

  Scenario: Test the title of the page
    Given Login should have been successful
    When Assert actual and expected titles
    Then Assertion should be successful

  @smokeTest
  Scenario: Test smoke A
    Given Login A
    When A
    Then Smoke test A should be successfully

  @smokeTest
  Scenario: Test smoke B
    Given Login B
    When B
    Then Smoke test B should be successfully

  @smokeTest
  Scenario: Test smoke C
    Given Login C
    When C
    Then Smoke test C should be successfully
