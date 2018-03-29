#Feature: Sign in and contact us
#  Scenario: Successful login
#    When I open "http://automationpractice.com" website
#    Then I login using credentials "abc@xyz.com" and "Test@123"
#  Scenario: unsuccessful login
#    When I open "http://automationpractice.com" website
#    Then I login using credentials "abc@xyz1.com" and "Test@123"
#  Scenario: Contact us
#    When I open "http://automationpractice.com" website
#    Then I contact customer service with order reference "abc123" and message "hello there"
Feature: Fill a simple form with excel data
  Scenario: Data driven with excel
    When I open automationpractice website
    And click contact us
    Then I contact the customer service with excel row "1" dataset
  Scenario Outline: Data driven with excel and data sets
    When I open automationpractice website
    And click contact us
    Then I contact the customer service with excel row "<row_index>" dataset
  Examples:
    |row_index|
    |2|
    |2|