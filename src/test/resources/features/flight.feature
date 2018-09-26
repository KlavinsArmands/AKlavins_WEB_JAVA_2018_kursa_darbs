Feature: This feature is about successful booking of flight

Scenario: Successful booking
Given I have an existing account
When I login this account
And I navigate to Home page
And I select FLIGHTS menu in booking section
And I select ROUND TRIP flight option
And I set FIRST class tickets
And I set Riga Arpt as departure airport
And I set Barcelona Arpt as arrival airport
And I set 2019-02-07 as departure date
And I set 2019-02-13 as return date
And I set 2 adults
And I set 2 children
And I set 1 infant
And I search for a flight
And I book the first flight offer available
And I confirm the booking
And I navigate to Home page
And I navigate to Accounts page
And I open invoice for the newest booking
Then new booking contains correct flight details



