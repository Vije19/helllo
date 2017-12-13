Feature: Checking status/success code

Scenario: The given link when hit shows a success status code

Given The user enter "http://cmapi.bananaappscenter.com/api/Location/locationdetails"

Then 	It should display status/success code "200"
