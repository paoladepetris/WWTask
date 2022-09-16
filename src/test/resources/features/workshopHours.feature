Feature: WW Studio

    @TC-01
    Scenario: Positive testCase WW Studio Business Hours
    Given I navigate to WW Studio Finder page
    When I click on In-Person and type "10011" in search field
    Then I should be able to see different locations
    And I click on the first search result and click on Business Hours
    Then I should be able to see all the business hours for that studio