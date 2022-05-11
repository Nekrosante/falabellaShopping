@stories
Feature: shopping in Falabella
  @scenario1
  Scenario: purchase of a product on the Falabella page
    Given  access to the falabella page
      And close the pop-up
      And choose a certain product and add it to the bag "NINTENDO"
    When enter the shopping bag
    Then the user expects to be on the payment option page