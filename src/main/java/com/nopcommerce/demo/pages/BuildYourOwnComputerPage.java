package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    //list of elements and their locations
    By hdd400GBRadioBtn = By.id("product_attribute_3_7");
    By addToCartBtn = By.id("add-to-cart-button-1");
    By textForProductAddedToCart = By.xpath("//p[@class='content']");

    //methods performing actions on elements
    public void clickOnHDD400GBRadioButton() {
        radioButtonClick(hdd400GBRadioBtn);
    }

    public void clickOnAddToCartBtn() {
        clickOnElement(addToCartBtn);
    }

    public void verifyTextProductAddedToShoppingCart(String str) {
        verifyTextAssertMethod(textForProductAddedToCart, str);
    }


}
