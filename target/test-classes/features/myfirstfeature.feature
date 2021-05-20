Feature: my first feature

  Scenario: Open Browser and Navigate
    Given User opened the browser
    When User navigated to the app url
    Then User is able to see application landing page

  Scenario: user is able to search for the product
    Given User opened the browser and navigated to app url
    When user search for the new product
    Then Seach result of the product displayed