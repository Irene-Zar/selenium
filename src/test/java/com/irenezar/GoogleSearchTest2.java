package com.irenezar;

import com.irenezar.core.WebDriverTestBase;
import com.irenezar.pages.GoogleResultPage;
import com.irenezar.pages.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by new_user on 3/27/2017.
 */
public class GoogleSearchTest2 extends WebDriverTestBase {
private String url = "https://www.google.com.ua";
private String keyword = "Selenium";
    @Test
    public void testKeyWordFound(){
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openURL(url);
        googleSearchPage.sendSearchData(keyword);
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertEquals(googleResultPage.findLink().getText().contains(keyword), true);
        }


}
