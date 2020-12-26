package com.tutku.hepsiburada.tests;

import com.tutku.hepsiburada.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class LoginTest {

    private LoginPage loginPage;
    public LoginTest() {
        this.loginPage = new LoginPage();
    }


    @And("^Giriş ekranında eposta alanına \"([^\"]*)\" yazılır$")
    public void girişEkranındaEpostaAlanınaYazılır(String arg0) throws Throwable {
        loginPage.setEmail(arg0);
    }

    @And("^Giriş ekranında şifre alanına \"([^\"]*)\" yazılır$")
    public void girişEkranındaŞifreAlanınaYazılır(String arg0) throws Throwable {
        loginPage.setPassword(arg0);
    }

    @And("^Giriş ekranında giriş yap butonuna tıklanır$")
    public void girişEkranındaGirişYapButonunaTıklanır() {
        loginPage.clickLoginButton();
    }

    @Then("^Kullanıcının giriş yapamadığı kontrol edilir$")
    public void kullanıcınınGirişYapamadığıKontrolEdilir() {
        loginPage.checkPageForNotLoggedIn();
    }
}
