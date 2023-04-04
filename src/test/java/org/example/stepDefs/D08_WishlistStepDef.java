package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D08_WishlistStepDef {

    P03_homePage wishlist = new P03_homePage();

    @Given("user scrolls down to products on home page")
        public void scrollDown(){
            wishlist.scrollToBottomWishList();
        }
    @When("user clicks on the heart icon")
        public void clickOnHeartIcon(){
           wishlist.clickOnHeartIcon();

           }
    @Then("success message appears")
        public void assertSuccessMsg(){
        Assert.assertTrue(wishlist.getSuccessMsg());
        Assert.assertEquals(wishlist.getSuccessMsgColor(),"#4bb07a");
    }

    @Then("user clicks on Wishlist tab")
    public void clickOnWishlistTab() {
        wishlist.waitForInvisibilityOfSuccessMsg();
        wishlist.clickOnWishlistTab();
    }

    @Then("user can see the product he added to wishlist")
    public void assertQty() {
        Assert.assertNotEquals(wishlist.getQtyValue(), '0');
    }
}

