Feature: User Registration

  Scenario Outline: Create Account and Shoping
    Given User Open the Chrome browser
    When User opens the url " http://automationpractice.com/index.php"
    And User Click on signin option
    And User enter email address <email>
    And User Click on create account
    And User enter first name <fname>
    And User enter last name <lname>
    And User enter password <password>
    And User enter addfirst name <addfname>
    And User enter addlast name <addlname>
    And User enter address <address>
    And User enter city <city>
    And User select state
    And User enter postal code <postel>
    And User select country
    And User enter mobileno <mobile>
    And User enter alias address <alias>
    And User click on Register
    Then Validate user name <fname>
    Then User click on logout

    Examples: 
      | email         | fname | lname | password     | addfname | addlname | address    | city     | postel  | mobile       | alias      |
      | 'www@xyz.com' | 'mno' | 'abc' | 'AS1234tgb6' | 'abcde'  | 'mnopq'  | 'xyz road' | 'polkiu' | '55773' | '3344558899' | 'abc road' |
