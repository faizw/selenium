package com.faiz.prog;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGoogle {

    static WebDriver driver;
     
    @BeforeClass
    public void name() {
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("http://www.google.co.in");
    }
	
    @Test
    public void firstTest() {
	String url = driver.getCurrentUrl();
	Assert.assertEquals(url, "http://www.google.com");
	Assert.assertTrue(3>4, "message");
    }
    
    @AfterClass
    public void tearDown() {
	driver.close();
	driver.quit();
	
    }

}
