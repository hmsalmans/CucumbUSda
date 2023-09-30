#Author: Salman
#Dtae:------
# Gherkin language

Feature: Getting to Food and Nutional Security Page
 Description: Getting to Food and Nutional Security Page from home page

  @tag1
  Scenario: Browsing new features
    Given I am on home page
    When I click on Priorities tab
    And Select food and security title
    Then A new page opens 
    Then I click on play link
    
    
    