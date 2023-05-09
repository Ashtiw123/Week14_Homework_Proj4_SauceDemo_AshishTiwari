package com.saucedemo.page;


import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement usernameField;

    public void enterUsername(String userName) {
        CustomListeners.test.log(Status.PASS,"Enter Username");
        Reporter.log("Enter Username " + usernameField.toString());

        sendTextToElement(usernameField, userName);
    }

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;

    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS,"Enter Password");
        Reporter.log("Enter Password " + passwordField.toString());


        sendTextToElement(passwordField, password);
    }


    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginLink;

    public void clickOnLoginLink() {
        CustomListeners.test.log(Status.PASS,"EClick On Login Link");
        Reporter.log("Click On Login Link " + loginLink.toString());

        clickOnElement(loginLink);
    }

}
