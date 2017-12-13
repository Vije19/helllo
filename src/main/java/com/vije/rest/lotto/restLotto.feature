Feature: Lotto Check

  Scenario: The given lotto should contain the given id and numbers and produces success status code
    Given I hit the lotto rest end point and it is alive
    Then The lotto lottoid is five
    Then The lotto winners id contains given numbers
