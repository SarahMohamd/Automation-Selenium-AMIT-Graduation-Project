@smoke
Feature: F04_Search | user can search using product name or sku
 Scenario Outline: user search for a product with product name
   Given  user enters "<product name>"
   When   user clicks search button
   Then the product appears
   Examples:
    | product name|
   | samsung   |
   |    nike   |

   Scenario Outline:  user search for a product with sku
     Given user enters "<sku>"
     When user clicks search button
     Then click on the product in the result
     Then right product appears

     Examples:
       | sku|
       | SM_900_PU |
       | NK_FRC_RS|