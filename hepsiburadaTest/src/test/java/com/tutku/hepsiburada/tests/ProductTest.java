package com.tutku.hepsiburada.tests;

import com.tutku.hepsiburada.pages.ProductPage;
import cucumber.api.java.en.Then;

public class ProductTest {
    private ProductPage productPage;

    public ProductTest() {
        this.productPage = new ProductPage();
    }

    @Then("^Aratılan ürününün imajları kontrol edilir$")
    public void productÜrünününImajlarıKontrolEdilir() {
        productPage.checkAllProductImage();
    }
}
