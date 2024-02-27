Feature: As a user, I want to be able to send an excuse in situations I cannot attend
  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

  @RegressionTest
    Scenario: I want to be able to send an excuse in situations I cannot attend
      Given Click attendance button in homepage
      When Click excuses and plus button for create excuses
      Then User should create excuses