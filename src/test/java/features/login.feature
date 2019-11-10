Feature: Login into application

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://qaclickacademy.com" site
    And Click on Login link in home page to land on Secure sign in Page
    When User enters <username> and <password> and logs in
    Then Verifythatuser is succefully logged in
    And Close browser

Examples:
    |username|password|
    |lagiewnik@gmail.com|Homepage123|
    |test99@gmail.com   |123456     |
    |test123@gmail.com  |1234       |