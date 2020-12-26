package com.tutku.hepsiburada.tests;

import com.tutku.hepsiburada.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest {
    private HomePage homePage;

    public HomeTest() {
        this.homePage = new HomePage();
    }

    @Given("^Hepsiburada anasayfada giriş yap veya üye ol butonuna tıklanır$")
    public void hepsiburadaAnasayfadaGirişYapVeyaÜyeOlButonunaTıklanır() {
        homePage.clickLoginOrSignUpButton();
    }

    @When("^Hepsiburada anasayfada giriş yap butonuna tıklanır$")
    public void hepsiburadaAnasayfadaGirişYapButonunaTıklanır() {
        homePage.clickLoginButton();
    }

    @Then("^Giriş yapmış kullanıcı için ana ekran kontrol edilir$")
    public void girişYapmışKullanıcıIçinAnaEkranKontrolEdilir() {
        homePage.checkPageForLoggedIn();
    }

    @And("^Hepsiburada anasayfada search alanına ([^\"]*) yazılır$")
    public void hepsiburadaAnasayfadaSearchAlanınaYazılır(String arg0)  {
        homePage.setSearch(arg0);
    }

    @When("^Hepsiburada anasayfada search butonuna tıklanır$")
    public void hepsiburadaAnasayfadaSearchButonunaTıklanır() {
        homePage.clickSearchButton();
    }
}
