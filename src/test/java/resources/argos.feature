@argos
Feature: Product Filter

  User clicks on Filters and verifies product based on respective filters

  Scenario Outline: Verify Products based on Prices
    Given User is in Homepage
    When User Hover on "<HoverElement>"
    And User Clicks on "<SubElement>"
    And User expands "<Filter>"
    And User selects "<AmountRange>"
    Then User verifies only products between price "<PriceStrRng>" and "<PriceEndRng>" is present

    Examples:
    |HoverElement|SubElement|Filter|AmountRange|PriceStrRng|PriceEndRng|
    |Technology  |Televisions|Price|£50 - £100|80.0        |100.0      |
#    |Toys        |Collectables|Price|£10 - £15|10.0        |15         |#