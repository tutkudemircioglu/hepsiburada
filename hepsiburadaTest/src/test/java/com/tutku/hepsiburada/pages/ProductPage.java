package com.tutku.hepsiburada.pages;

import com.tutku.hepsiburada.logger.Log;
import com.tutku.hepsiburada.util.Util;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import java.util.Random;

public class ProductPage extends Util {

    private final By imgProduct = By.cssSelector("div.carousel-lazy-item");


    private Random random = new Random();


    public void checkAllProductImage() {
        System.out.println(findElements(imgProduct).size());

        for (WebElement element : findElements(imgProduct)) {
            Log.info("ürün resimleri kontrol ediliyor...");

            if (!checkImageDisplayed(element.findElement(By.tagName("img")))) {
                Log.warn("ürün resmi görüntülenemedi!");
            }

            if (!checkImageBroken(element.findElement(By.tagName("img")))) {
                Log.warn("ürün resmi için http 200 cevabı alınamıyor!");
            }

        }

    }

}
