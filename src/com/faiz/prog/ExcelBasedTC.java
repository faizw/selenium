package com.faiz.prog;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelBasedTC {
    
  public static String filepath = "/home/faiz/test.xlsx";

  @Test(dataProvider="Authentication")
  public void loginTest(String username, String password, String junk){
      System.out.println("junk : " + junk);
      
      WebDriver driver = new FirefoxDriver();
      driver.get("http://store.demoqa.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
      driver.findElement(By.id("log")).sendKeys(username);
      System.out.println(username);
      driver.findElement(By.id("pwd")).sendKeys(password);
      System.out.println(password);
      driver.findElement(By.id("login")).click();
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
      
  }
  
  @DataProvider
  public Object[][] Authentication() throws IOException {
      Object[][] testObjArray = ReadFromExcelSheet.readFromExcel(filepath);
      return testObjArray;
    
}
}
