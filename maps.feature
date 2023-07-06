Feature: Customer can verify text while on ARCGIS Maps


Background: The customer has logged into ARCGIS account
Given "<LoginProfileId>" is logged into ARCGIS account
And  User is registered with "<Language>"

@screenSizeType: ["Desktop"] @executionType: ["Browser"] 
Scenario Outline: "<testcaseID>" customer can verify text while on ARCGIS Maps
When Customer authenticates the API key for location 
Then User verfies text on ARCGIS Map informing customer how to rotate map

Examples: @ARC_1 @ARC_2
| TestCaseId     | LoginProfileId | Language  | 
| ARC_1          | 199              | English | 
| ARC_2          | 200              | Spanish | 

