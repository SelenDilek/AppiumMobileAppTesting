Feature: As a user, I would like to see the Homepage Element on the homepage.
  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

  @RegressionTest
    Scenario: I would like to see and click the Homepage Element on the homepage.
      Given User click homepage element in homepage and verify