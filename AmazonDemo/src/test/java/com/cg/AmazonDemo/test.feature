Feature: Amazon Booking
Scenario: Complete Booking on Amazon
Given Open Amazon
When I enter Search as TV
Then TV Should be added to cart
When I Search as Power Bank
Then Power Bank Should be added to cart
When I click Search oneplus6
Then oneplus6 Should be added to cart
When I want to buy Redmi5
Then Redmi5 Should be added to cart
When I wish to Buy Iphone10
Then Iphone10 Should be added to cart
When 5 Items are added
Then Go to Payment Page