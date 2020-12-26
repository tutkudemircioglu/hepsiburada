package com.tutku.hepsiburada.pages;

import com.tutku.hepsiburada.util.Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Util {

    private final By btnMyAccount = By.id("myAccount");
    private final By txtMyAccount = By.className("sf-OldMyAccount-PhY-T");
    private final By btnLogin = By.id("login");
    private final By edtSearch = By.className("desktopOldAutosuggestTheme-input");
    private final By btnSearch = By.className("SearchBoxOld-buttonContainer");

    public void clickLoginOrSignUpButton() {
        WebElement myAccount = driver.findElement(btnMyAccount);
        mouseOver(myAccount);
    }

    public void clickLoginButton() {
        clickElement(btnLogin);
    }

    public void checkPageForLoggedIn() {
        Assert.assertEquals("Kullanıcı login olamadı!", "Hesabım", getText(txtMyAccount));
    }

    public void setSearch(String keyword) {
        sendKeys(edtSearch,keyword);

    }

    public void clickSearchButton() {
        clickElement(btnSearch);
    }
}
