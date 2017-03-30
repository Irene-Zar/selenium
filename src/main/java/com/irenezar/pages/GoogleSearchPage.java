package com.irenezar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.Key;

/**
 * Created by new_user on 3/27/2017.
 */
public class GoogleSearchPage extends AbstractPage {
        public GoogleSearchPage(WebDriver driver){
        super(driver);
    }

    public void openURL(String url){
        driver.get(url);
    }

    public void sendSearchData(String keyword){
        printText(keyword);
    }
}
