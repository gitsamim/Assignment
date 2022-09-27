$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Calculator.feature");
formatter.feature({
  "name": "Borrowing Estimate",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Calculate Borrowing Estimate",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User opens the site \"https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Click Application type as Single",
  "keyword": "And "
});
formatter.step({
  "name": "User Click dependants as zero",
  "keyword": "And "
});
formatter.step({
  "name": "User select home to live in",
  "keyword": "And "
});
formatter.step({
  "name": "User enter income \"80000\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter other income \"10000\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter living expenses \"500\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter current home loan repayments \"0\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter other loan repayments \"100\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter other commitments \"0\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enter total credit card limits \"10000\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Click the Start Over button",
  "keyword": "And "
});
formatter.step({
  "name": "User enter living expenses \"1\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Click on the Work out how much I could borrow",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the message \"Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ErrorMessage"
      ]
    },
    {
      "cells": [
        "\u0027Based on the details you\\\u0027ve entered, we\\\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.\u0027"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Calculate Borrowing Estimate",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch the Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_the_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens the site \"https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_the_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Application type as Single",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Click_Application_type_as_Single()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click dependants as zero",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_select_dependants_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select home to live in",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_select_c_home_to_live_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter income \"80000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_income(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter other income \"10000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_other_income(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter living expenses \"500\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_living_expenses(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter current home loan repayments \"0\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_current_home_loan_repayments(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter other loan repayments \"100\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_other_loan_repayments(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter other commitments \"0\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_other_commitments(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter total credit card limits \"10000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_total_credit_card_limits(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Start Over button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_Click_the_Start_Over_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter living expenses \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_living_expenses(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on the Work out how much I could borrow",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.userClickWorkOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the message \"Based on the details you\u0027ve entered, we\u0027re unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.validateMessage(String)"
});
formatter.result({
  "status": "passed"
});
});