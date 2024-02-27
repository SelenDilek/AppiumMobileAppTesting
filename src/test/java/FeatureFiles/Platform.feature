Feature: Verifying the Platforms in Campus Application

  Background:
    Given Navigate to campus application
  @SmokeTest
  @RegressionTest
  Scenario: Verify and select platform in campus
    When Click and verify platforms
    Then Select a platform and click continue button