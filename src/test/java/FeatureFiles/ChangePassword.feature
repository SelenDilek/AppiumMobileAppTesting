Feature: As a user, I want to see the "change password" button on the hamburger Menu

  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

  @SmokeTest
  @RegressionTest
    Scenario: I want to see the "I forgot my password" button and change password on the hamburger menu
      Given Click hamburger menu button
      When Click setting button
      Then User change password successfully
