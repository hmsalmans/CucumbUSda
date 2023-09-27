#Author: Salman
#Dtae:------
# Gherkin language

Feature: Playing video in Nutrition page
 Description: Video of of nutrition page should play

  @tag2
  Scenario: Youtube video playing by clicking
   Given I am on Food and Nutritionl Security page 
   When I click on play link
   Then Video will play
