# Author amdocsikaya
# Date 21.02.2021
# Desciption Cucumber Testing on Calculator
Feature: Feature to test login functionality

  Scenario: Check Calculator is working on Galaxy S7
    Given user is on main page
    When user taps on five button
    And user taps on multiple button
    And user taps on five button again
    And user taps on equal button
    Then calculator shows the result on the screen