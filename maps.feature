Feature: Customer can point the compass North on the map while on ARCGIS Maps


Background: The customer has logged into ARCGIS account
Given "<LoginProfileId>" is logged into ARCGIS account
And  User is registered with "<Language>"

@screenSizeType: ["Desktop"] @executionType: ["Browser"] 
Scenario Outline: "<testcaseID>" customer can point North using the compass on ARCGIS Maps
When Customer authenticates the API key for location 
Then User points the compass North on ARCGIS 

Examples: @ARC_1 @ARC_2
| TestCaseId     | LoginProfileId | Language  | 
| ARC_1          | 199              | English | 
| ARC_2          | 200              | Spanish | 

