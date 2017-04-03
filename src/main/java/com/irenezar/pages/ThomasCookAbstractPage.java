package com.irenezar.pages;

import com.irenezar.util.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by new_user on 4/3/2017.
 */
public class ThomasCookAbstractPage {
    protected WebDriver driver;
    protected WebDriverUtils webDriverUtils;

    public  ThomasCookAbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(this.driver);
        PageFactory.initElements(driver,this);
    }


}
