Feature:Add to cart testing for nopcommerce
  Background:
    Given User is in main Homepage
  @functional
  Scenario: Add a product for comparasion
    When user adds a product to add to bag
    Then product is added

  @nop
    Scenario: Add three product for comparision and remove one product
      When user adds a product to add to bag and continue with shopping
      And User adds two more product to cart
      Then Three product is added

