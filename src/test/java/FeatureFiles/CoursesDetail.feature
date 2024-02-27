Feature: As a user, I want to see my existing courses

  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

  @RegressionTest
    Scenario: I want to see my existing courses
      Given Click courses element in homepage
      When  User should see their course
