Feature: Customer can rotate the map while on ARCGIS Maps


Background: The customer has logged into ARCGIS account
Given "<LoginProfileId>" is logged ARCGIS account
And  User is registered with "<Language>"

@screenSizeType: ["Desktop"] @executionType: ["Browser"] 
Scenario Outline: "<testcaseID>" customer can rotate South using the compass on ARCGIS Ma
When Customer authenticates the APY key for location 
Then User point the compass north on ARCGIS 

Examples: @ARC_1 
| TestCaseId     | LoginProfileId | Language  | 
| ARC_1          | 199              | English | 

