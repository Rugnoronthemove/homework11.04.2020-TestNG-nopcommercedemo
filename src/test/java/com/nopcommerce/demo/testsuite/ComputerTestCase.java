package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputerTestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    /*
    Test 01
    User should navigate to Computers page & Assert text "Computers"
     */
    @Test(priority = 0,groups = {"Sanity","Regression"})
    public void userShouldNavigateToComputerPage() {
        //click on computer tab on homepage
        homePage.clickOnComputerTab();
        //Assert text on ComputersPage
        computerPage.verifyComputerPageText("Computers");
    }


    /*
    Test 02
    User should navigate to Computers page, select Build your own computer,
    select 400gb HDD option radio button, select Add to cart & Assert message "The product has been added to your shopping cart"
     */
    @Test(priority = 1,groups = {"Smoke","Regression"})
    public void addProductToShoppingCart() {
        //click the computer tab on HomePage
        homePage.clickOnComputerTab();
        //click the desktop link on ComputerPage
        computerPage.clickOnDesktopsLink();
        //click on Build your own computer on DesktopPage
        desktopPage.clickOnBuildYourOwnComputer();
        //select 400gb HDD radio button
        buildYourOwnComputerPage.clickOnHDD400GBRadioButton();
        //click on Add to cart button
        buildYourOwnComputerPage.clickOnAddToCartBtn();
        //Assert text on BuildYourOwnComputerPage when Product is added to shopping cart
        buildYourOwnComputerPage.verifyTextProductAddedToShoppingCart("The product has been added to your shopping cart");
    }

    /*
     Test 03
     User should navigate to Computers page & Assert text "Computers"
      */
    @Test(priority = 2,groups = {"Regression"})
    public void userShouldNotNavigateToComputerPage() {
        //mouse hover on computer tab on homepage
        homePage.mouseHoverOnComputerTab();
        //Assert text on ComputersPage
        computerPage.verifyComputerPageText("Computers");
    }

}
