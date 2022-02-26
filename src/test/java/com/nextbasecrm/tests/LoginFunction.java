package com.nextbasecrm.tests;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.WebDriver_Factory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginFunction {
    //1TC for login
    /*
    1. go to login page
    2. write username
    3 write password
    4 click login button
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriver_Factory.getDriver(ConfigurationReader.getPtoperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.getPtoperty("env"));
    }

    @AfterMethod
    public void teardown() {
        BrowserUtils.sleep(3);
        driver.close();
    }

    @Test
    public void  login_valid_credentials(){




    }
}