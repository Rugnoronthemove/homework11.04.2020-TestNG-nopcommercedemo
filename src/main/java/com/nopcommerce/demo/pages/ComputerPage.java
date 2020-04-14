package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    //list of elements and their locations
    By computerPageText = By.xpath("//div[@class='page-title']/h1");
    By desktopsLink = By.xpath("//li[@class='inactive']//a[@href='/desktops']");

    //methods performing actions on elements
    public void verifyComputerPageText(String str) {
        verifyTextAssertMethod(computerPageText,str);
    }

    public void clickOnDesktopsLink() {
        clickOnElement(desktopsLink);
    }


}
