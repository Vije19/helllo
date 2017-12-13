
Feature: Store Check

Scenario: Must check the titles of book prices less than ten and produces success code 
Given I hit the store rest end point and it is alive
When I Check for the titles of book prices less than ten
Then It must contain two titles
	


