@smoke
  Feature: F08_Wishlist | user is able to add a product in the wishlist
    Scenario: user adds a product in the wishlist
      Given user scrolls down to products on home page
      When user clicks on the heart icon
      Then success message appears

      Scenario: user checks his wishlist after adding an item
        Given user scrolls down to products on home page
        When user clicks on the heart icon
        Then user clicks on Wishlist tab
        Then user can see the product he added to wishlist
