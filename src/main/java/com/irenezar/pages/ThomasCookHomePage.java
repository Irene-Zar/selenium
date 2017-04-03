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
public class ThomasCookHomePage extends ThomasCookAbstractPage {
//    @FindBy(how = How.XPATH, using = ".//*[@id='SearchbarForm-originContainer']/div/div/div/tc-typeahead/div/div[2]")
//    private WebElement from;
//    @FindBy(how = How.XPATH, using = ".//*[@id='SearchbarForm-destinationContainer']/div/div/div/tc-typeahead/div/div[2]")
//    private WebElement to;
//    @FindBy(how = How.ID, using = "when")
//    private WebElement date;
//    @FindBy(how = How.ID, using = "SearchbarForm-duration")
//    private WebElement duration;
@FindBy(how = How.ID, using = "SearchbarForm-submitBtn")
private WebElement submitButton;

    public ThomasCookHomePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void openURL(String url){
        driver.get(url);
    }
    public void submitClick() {
        webDriverUtils.waitForExpectedCondition(ExpectedConditions.visibilityOf(submitButton));
        submitButton.submit();
    }
 //   public void sendSearchData(){
 // }

}
