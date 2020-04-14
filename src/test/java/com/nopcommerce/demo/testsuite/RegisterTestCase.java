package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.loadproperty.LoadProperty;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.nopcommerce.demo.utility.Utility.getRandomString;

public class RegisterTestCase extends TestBase {

    static String email = null;


    //object creation
    LoadProperty loadProperty = new LoadProperty();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegistrationCompletePage registrationCompletePage = new RegistrationCompletePage();

    //getting keys from config.properties file
    String firstName = loadProperty.getProperty("firstName");
    String lastName = loadProperty.getProperty("lastName");
    String password = loadProperty.getProperty("password");
    String companyName = loadProperty.getProperty("companyName");
    String dayDOB = loadProperty.getProperty("dayDOB");
    String monthDOB = loadProperty.getProperty("monthDOB");
    String yearDOB = loadProperty.getProperty("yearDOB");

    //assigning random value for email every time test cases run
    @BeforeTest(groups = {"Regression","Sanity","Smoke"})
    public static void setUp() {
        email = "xyz" + getRandomString(5) + "@gmail.com";
    }


    /*
      Test Case 1
      User should navigate to register page successfully.
      Click on Register Link
      Message   “Your Personal Details“
      Assert above message.
    */
    @Test(priority = 0,groups = {"Sanity","Regression"})
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on Register link on HomePage
        homePage.clickOnRegisterLink();
        //Assert text on RegistrationPage
        registerPage.verifyTextYourPersonalDetails("Your Personal Details");
    }


    /*
        Test Case 2
        User should register successfully.
        Click on Register
        Enter correct details in field
        Click on register  button.
        Expected Result:
        Success Message  “Your registration completed”
        Assert above message.
    */
    @Test(priority = 1,groups = {"Smoke","Regression"})
    public void userShouldRegisterSuccessfullyAndLoginUsingSameCredentials() {
        //click on Register link on HomePage
        homePage.clickOnRegisterLink();

        //select Male gender radio button
        registerPage.selectMaleGenderRadioButton();

        //select Female gender radio button
        //registerPage.selectFemaleGenderRadioButton();

        //send text to First Name field
        registerPage.sendTextToFirstNameField(firstName);

        //send text to Last Name field
        registerPage.sendTextToLastNameField(lastName);

        //select day from DOB drop down menu
        registerPage.selectDayDOBFromDropDownMenu(dayDOB);

        //select month from DOB drop down menu
        registerPage.selectMonthDOBFromDropDownMenu(monthDOB);

        //select year from DOB drop down menu
        registerPage.selectYearDOBFromDropDownMenu(yearDOB);

        //send text to Email field
        registerPage.sendTextToEmailField(email);

        //send text to Company name field
        registerPage.sendTextToCompanyField(companyName);

        //check Newsletter checkbox is selected
        registerPage.selectNewsLetterCheckBox();

        //send text to Password field
        registerPage.sendTextToPasswordField(password);

        //send text to Confirm password field
        registerPage.sendTextToConfirmPasswordField(password);

        //click Register button
        registerPage.clickOnRegisterButton();

        //Assert text Registration complete page
        registrationCompletePage.verifyTextYourRegistrationCompleted("Your registration completed");
    }

    /*
      Test Case 3
      User should navigate to register page successfully.
      Click on Register Link
      Message   “Your Personal Details“
      Assert above message.
    */
    @Test(priority = 2,groups = {"Regression"})
    public void userShouldNotNavigateToRegisterPageSuccessfully() {
        //click on Login link on HomePage
        homePage.clickOnLoginLink();
        //Assert text on RegistrationPage
        registerPage.verifyTextYourPersonalDetails("Your Personal Details");
    }

}
