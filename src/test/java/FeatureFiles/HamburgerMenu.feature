Feature: As a user, I want to be able to provide an alternative navigation.
  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

  @SmokeTest
  @RegressionTest
    Scenario: I want to be able to provide an alternative navigation
      Given Click hamburger menu button
      When USer click all hamburger menu element and verify