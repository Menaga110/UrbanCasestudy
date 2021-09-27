Feature: Testing the application using  below Testcases

Scenario: verify signup in application
Given initialize the browser with chrome
And go to th given url
When enter the user credentials
Then verify the application
And close browser

Scenario: verify signin in application
Given initialize the browser with chrome
And go to th given url
And Go to signin page
When enter the user credentials "xys@gmail.com" and "xyz123"
Then verify signin testcase
And close browser

Scenario: verify search the product
Given initialize the browser with chrome
And go to th given url
And Go to searh the product
When verify u get the product 
And close browser

Scenario: verify Bedroom testcase
Given initialize the browser with chrome
And go to th given url
And Go to bedroom in testcase
And choose a your preferable bedroom
Then verify u get your choice
And close browser



Scenario: verify Mattress testcase
Given initialize the browser with chrome
And go to th given url
And Go to Mattress in testcase
And choose a your preferable Mattress
Then verify th Matress
And close browser

Scenario: verify  place order
Given initialize the browser with chrome
And go to th given url
And Go to Mattress in testcase
And choose a your preferable Mattress
Then add to cart
And Give address and place order
And close browser

Scenario: verify  Living Testcase
Given initialize the browser with chrome
And go to th given url
And Go to Living
And choose Tables
When change price range
Then verify price
And close browser


Scenario: verify Dining Testcase
Given initialize the browser with chrome
And go to th given url
And Go to Dining
And choose by your choice
Then verify details
And close browser

Scenario: verify getHelp feature
Given initialize the browser with chrome
And go to th given url
And Go to help section
And ask help
Then verify got help
And close browser

Scenario: verify track order
Given initialize the browser with chrome
And go to th given url
And Go to track order
And give your details
Then verify status
And close browser



Scenario: verify Giftcards
Given initialize the browser with chrome
And go to th given url
And Go to gift card section
And choose occasion and give details
When conform the gift
Then verify  gift 
And close browser




