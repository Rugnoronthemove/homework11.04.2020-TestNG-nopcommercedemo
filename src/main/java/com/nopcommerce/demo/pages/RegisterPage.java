package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    //list of elements and their locations
    By textYourPersonalDetails = By.xpath("//div[@class='page-body']//strong[text()='Your Personal Details']");
    By maleGenderRadioBtn = By.xpath("//input[@id='gender-male']");
    By femaleGenderRadioBtn = By.xpath("//input[@id='gender-female']");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By dayDOBDropDownMenu = By.xpath("//select[@name='DateOfBirthDay']");
    By monthDOBDropDownMenu = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearDOBDropDownMenu = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.xpath("//input[@id='Email']");
    By companyNameField = By.xpath("//input[@id='Company']");
    By newsletterCheckBox = By.cssSelector("input#Newsletter");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By registerBtn = By.xpath("//input[@id='register-button']");

    //methods performing actions on elements
    public void verifyTextYourPersonalDetails(String str) {
        verifyTextAssertMethod(textYourPersonalDetails, str);
    }

    public void selectMaleGenderRadioButton() {
        waitUntilElementToBeClickable(maleGenderRadioBtn,10);
        radioButtonClick(maleGenderRadioBtn);
    }

    public void selectFemaleGenderRadioButton() {
        waitUntilElementToBeClickable(firstNameField,10);
        radioButtonClick(femaleGenderRadioBtn);
    }

    public void sendTextToFirstNameField(String str) {
        waitUntilElementToBeClickable(firstNameField,10);
        sendTextToElement(firstNameField, str);
    }

    public void sendTextToLastNameField(String str) {
        waitUntilElementToBeClickable(lastNameField,10);
        sendTextToElement(lastNameField, str);
    }

    public void selectDayDOBFromDropDownMenu(String value) {
        selectByValueFromDropDown(dayDOBDropDownMenu, value);
    }

    public void selectMonthDOBFromDropDownMenu(String month) {
        selectByVisibleTextFromDropDown(monthDOBDropDownMenu, month);
    }

    public void selectYearDOBFromDropDownMenu(String year) {
        selectByValueFromDropDown(yearDOBDropDownMenu, year);
    }

    public void sendTextToEmailField(String str) {
        waitUntilElementToBeClickable(emailField,10);
        sendTextToElement(emailField, str);
    }

    public void sendTextToCompanyField(String str) {
        waitUntilElementToBeClickable(companyNameField,10);
        sendTextToElement(companyNameField, str);
    }

    public void selectNewsLetterCheckBox() {
        elementIsSelected(newsletterCheckBox);
    }

    public void sendTextToPasswordField(String str) {
        waitUntilElementToBeClickable(passwordField,10);
        sendTextToElement(passwordField, str);
    }

    public void sendTextToConfirmPasswordField(String str) {
        waitUntilElementToBeClickable(confirmPasswordField,10);
        sendTextToElement(confirmPasswordField, str);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
    }

}
