package com.irenezar.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by new_user on 3/30/2017.
 */
public class WebDriverUtils {
    private  WebDriverWait wait;

    public WebDriverUtils (WebDriver driver) {
        wait = new WebDriverWait(driver,40);
    }

    public void waitForExpectedCondition(ExpectedCondition expectedCondition) {
        wait.until(expectedCondition);
    }
}
