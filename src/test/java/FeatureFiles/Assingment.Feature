Feature: As a user, I want to see my homework
  Background:
    Given Navigate to campus application
    When Select a platform and click continue button
    Then User enters the required information and click sign in button

    Scenario: I want to see my homework and homework details
      Given Click assignment element in homepage
      When User should see homeworks and click
      Then User should have access to the assignment information