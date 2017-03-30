package com.irenezar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by new_user on 3/27/2017.
 */
public class GoogleResultPage extends AbstractPage {
    public GoogleResultPage(WebDriver driver){
        super(driver);
    }

    public WebElement findLink() {
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        return seleniumLink;
    }

}
