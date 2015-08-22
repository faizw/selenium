package com.faiz.prog;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContainsAndSibling {
  @Test
  public void testCase() {
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.guru99.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      
//      Using Contains, Parents and following-siblings
      List<WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]" +
      		"/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
      for(WebElement webelement : dateBox)
	  System.out.println(webelement.getText());
      
//      Using Contains, Ancestors and following-siblings
      List<WebElement> dateBox1 = driver.findElements(By.xpath("//a[contains(text(),'SELENIUM')]" +
    		"/ancestor::div[@class='rt-grid-2 rt-omega']/following-sibling::div"));
      for(WebElement webelement : dateBox1)
	  System.out.println(webelement.getText());
      
  }
}
