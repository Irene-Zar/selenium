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

    @Test
    public void testKeyWordFound(){
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.openURL("https://www.google.com.ua");
        googleSearchPage.sendSearchData("Selenium");
        GoogleResultPage googleResultPage = new GoogleResultPage(driver);
        assertEquals(googleResultPage.findLink().getText().contains("Selenium"), true);
        }


}
