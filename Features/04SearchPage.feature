Feature: SearchPage


Scenario: To navigate to Search Page

Given Getting the driver from the PersonalizedGiftsPageSD file
Then Activate the Search box
Then Get values from excel file
And Send keys into the Search box
Then verify if searched product is displayed