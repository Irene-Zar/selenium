package com.irenezar;

import com.irenezar.core.WebDriverTestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;


/**
 * Created by new_user on 3/20/2017.
 */
public class GoogleSearchTest extends WebDriverTestBase {

    @Test
    public void searchTest() {
        driver.get("https://www.google.com.ua");
        //Finds an element by name
        WebElement searchField = driver.findElement(By.name("q"));
        // Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();
        //Finds first link with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        //Verifies a result
        assertEquals(seleniumLink.getText().contains("Selenium"), true);
    }

}
