Feature: Login

Scenario: Succesfull login with the name "Amazon"
Given User launches Chrome browser
Given User opens URL "https://www.google.com/"
Given User types the word "amazon india" in the google search box
Then User clicks on the google search button
Then 	User click on the Amazon link


 