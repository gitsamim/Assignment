Feature: Borrowing Estimate

  Scenario: To validate the calculated amount
    Given User Launch the Chrome browser
    When User opens the site "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"
    And User Click Application type as Single
    And User Click dependants as zero
    And User select home to live in
    And User enter income "80000"
    And User enter other income "10000"
    And User enter living expenses "500"
    And User enter current home loan repayments "0"
    And User enter other loan repayments "100"
    And User enter other commitments "0"
    And User enter total credit card limits "10000"
    And User click Work out
    Then validate the amount "479000"

  Scenario: Click the start over and clear all
    Given User Launch the Chrome browser
    When User opens the site "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"
    And User Click Application type as Single
    And User Click dependants as zero
    And User select home to live in
    And User enter income "80000"
    And User enter other income "10000"
    And User enter living expenses "500"
    And User enter current home loan repayments "0"
    And User enter other loan repayments "100"
    And User enter other commitments "0"
    And User enter total credit card limits "10000"
    And User Click the Start Over button

  Scenario: Validate the error message by Living expenses Rs.1
    Given User Launch the Chrome browser
    When User opens the site "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"
    And User Click Application type as Single
    And User Click dependants as zero
    And User select home to live in
    And User enter income "80000"
    And User enter other income "10000"
    And User enter living expenses "500"
    And User enter current home loan repayments "0"
    And User enter other loan repayments "100"
    And User enter other commitments "0"
    And User enter total credit card limits "10000"
    And User Click the Start Over button
    And User enter living expenses "1"
    And User Click on the Work out how much I could borrow
    Then Validate the message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500."
