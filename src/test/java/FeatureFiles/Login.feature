Feature: User Login Campus Application
  Background:
    Given Navigate to campus application
  @SmokeTest
  @RegressionTest
  Scenario: User login successfully campus
    Given Select a platform and click continue button
    When User enters the required information and click sign in button
    Then User should login successfully