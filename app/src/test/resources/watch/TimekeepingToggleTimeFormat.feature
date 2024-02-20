Feature: Timekeeping

  Scenario: 12H/24H time format toggle
    Given User press the button 2
    Then the time format should toggle between 12H and 24H
