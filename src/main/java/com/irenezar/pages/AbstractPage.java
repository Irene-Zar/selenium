package com.irenezar.pages;
import com.irenezar.util.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by new_user on 3/27/2017.
 */
public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverUtils webDriverUtils;


    @FindBy(how = How.NAME, using = "q")
    private WebElement textBox;

    public  AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(this.driver);
        PageFactory.initElements(driver,this);

    }

    public void printText(String text) {
        textBox.sendKeys(text);
        textBox.submit();
    }

}
