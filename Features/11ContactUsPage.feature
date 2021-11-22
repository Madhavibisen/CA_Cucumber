Feature: Contact us

Scenario: Testing the Contact us

Given getting driver from GiftCardPage file
When Click on ContactUs footer
And sending email, name and message to the contact form
Then Verify that data has been sent 
