Feature: As user,I want to view and change my account settings
  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

    @SmokeTest
    @RegressionTest
    Scenario: I want to view and change my account settings
      Given Click hamburger menu button
      When Click setting button
      Then User should see and click settings elements
