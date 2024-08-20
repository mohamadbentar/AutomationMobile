@login
Feature: Login Feature

  @validLogin
  Scenario Outline: Login with valid credential
    Given User Navigate to Login Page
    When User input <username> and <password>
    And Click on Login button
    Then User navigated to dashboard

    Examples: 
      | username    				| password                 |
      | odinjogja@jba.co.id | Qwer1234								 |