Feature:As a user, I want to get out of the Campus application
  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button
  @SmokeTest
  @RegressionTest
    Scenario: I want to get out of the Campus application.
      Given Click hamburger menu button
      When Click sign out button
      Then User should sign out successfully