package com.tutku.hepsiburada.pages;

import com.tutku.hepsiburada.util.Util;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends Util {

    private final By edtEmail = By.id("txtUserName");
    private final By edtPassword = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");


    public void setEmail(String email) {
        sendKeys(edtEmail,email);
    }

    public void setPassword(String password) {
        sendKeys(edtPassword,password);
    }

    public void clickLoginButton() {
        clickElement(btnLogin);
    }

    public void checkPageForNotLoggedIn() {
        Assert.assertTrue("Kullanıcı yanlış parola ile login oldu!",isElementDisplayed(btnLogin));
    }
}
