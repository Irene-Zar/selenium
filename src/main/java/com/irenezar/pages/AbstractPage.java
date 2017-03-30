package com.irenezar.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by new_user on 3/27/2017.
 */
public class AbstractPage {
    protected WebDriver driver;

    public  AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printText(String text) {
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys(text);
        textBox.submit();
    }

}
