package com.irenezar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by new_user on 4/3/2017.
 */
public class ThomasCookResultsPage extends AbstractPage {
        @FindBy(how = How.ID, using = "seoResultTitle")
        private WebElement pageTitle;

    public ThomasCookResultsPage(WebDriver driver){
            super(driver);
            PageFactory.initElements(driver,this);
        }

    public WebElement TitleOnResultsPageDisplayed() {
        webDriverUtils.waitForExpectedCondition(ExpectedConditions.visibilityOf(pageTitle));
        return pageTitle;
    }
}
