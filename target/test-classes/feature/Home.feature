@HomePage1
Feature: We are going to validate NTL Taxi Home Page.
Scenario: Validate home page with valid data.
Given Open Browser as Firefox
Then Enter URL as http://www.ntltaxi.com/
Then Enter Username as vmetry
And Enter MobileNumber as 423874823
Then Enter PickupAddr as ADYAR
And Enter DropAddr as MYLAPORE
When Select Vtype as Sedan
Then Click Booklater
But Dont Click BookNow
