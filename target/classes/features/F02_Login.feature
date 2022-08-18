@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    And user login with valid "endy.kamel@gmail.com" and "Endy.1995"
    And user press on login button
    And user login to the system successfully

  Scenario: user could login with invalid email and password
    Given user go to login page
    And user login with invalid "endy.kamel@gmail.com" and "Endy.19954"
    And user press on login button
    And user could not login to the system