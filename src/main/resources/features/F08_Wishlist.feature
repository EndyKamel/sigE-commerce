@smoke
  Feature: if you click on wishlist button | The product has been added to your wishlist
    Scenario: user click on wishlist button
      When user click on wishlist button of products

    Scenario: user click on wishlist button wait until this success message with green color disappear then click "Wishlist" Tab
      When user click Wishlist Tab After success message disappear