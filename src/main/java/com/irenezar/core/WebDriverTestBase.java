package com.irenezar.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

/**
 * Created by new_user on 3/23/2017.
 */
public abstract class WebDriverTestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "D:\\KIT\\selenium\\src\\test\\resources\\geckodriver\\geckodriver.exe");
        //Init browser
        driver = new FirefoxDriver();
        //max window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
