package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    //list of elements and their locations
    By buildYourOwnComputer = By.xpath("//h2[@class='product-title']/a[contains(text(),'Build your own computer')]");


    //methods performing actions on elements
    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
    }



}
