Feature: Orange HRM functionality scenario

@smoke @LoginWithoutParams
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
   @smoke @TC100
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Ozan "
    Then The user wants to add last name as "kaan"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

  @TC200
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The User wants to see add employee page
      |FirstName|Tom121223  |
      |LastName |Jerry13123123|
    Then The user wants to add login details
      |User Name   | erkanzclk123|
      |Password    |Erkan!23  |
      |Status      |Disabled   |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

    @TC300
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee in a list way
      |Tommm123| Jerryyyyy|
    Then The user wants to add login details in a list way
      |renastech123 | RenasTech2021 |Disabled|
      |   hasan     | hasan2345422  |Disabled|
      |ruken ruzgar | ruken23452    |Disabled|
      |      mehmet |  secretpas    |Disabled|
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"



      @Scenario_Outline
Scenario Outline:Add new nationality to Nationalities  page in Orange HRM project
  Given The user wants to go to orangeHRM application
  When The user wants to enter username and password
  Then The user wants to click login
  And The user should be able to navigate dashboard
Then The user wants to go to Admin page
  And The user wants to go to Nationalities section
  Then The user wants to add new nationalities
  Then The user wants to add nationatilies as "<Nationalities>"


  Examples:
    |Nationalties |
    |Ottaman      |
    |Germen      |
    |Italy      |










