$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/workshopHours.feature");
formatter.feature({
  "name": "WW Studio",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Positive testCase WW Studio Business Hours",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to WW Studio Finder page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.i_navigate_to_WW_Studio_Finder_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on In-Person and type \"10011\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.i_click_on_In_Person_and_type_in_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see different locations",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.i_should_be_able_to_see_different_locations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the first search result and click on Business Hours",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.i_click_on_the_first_search_result_and_click_on_Business_Hours()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see all the business hours for that studio",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.i_should_be_able_to_see_all_the_business_hours_for_that_studio()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});