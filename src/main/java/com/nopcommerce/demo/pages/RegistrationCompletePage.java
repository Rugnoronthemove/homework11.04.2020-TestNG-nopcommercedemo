package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationCompletePage extends Utility {

    //list of elements and their locations
    By textYourRegistrationCompleted = By.xpath("//div[@class='master-wrapper-content']//div[text()='Your registration completed']");

    //methods performing actions on elements
    public void verifyTextYourRegistrationCompleted(String str) {
        verifyTextAssertMethod(textYourRegistrationCompleted, str);
    }
}
