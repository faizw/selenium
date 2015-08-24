package com.faiz.prog.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Sleeper;

public class MouseEvents {
    
    public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement textBox = driver.findElement(By.id("email"));
	Actions builder = new Actions(driver);
//	Action moveOverHindi = builder.moveToElement(driver.findElement(By.cssSelector("a._41ug"))).build();
//	moveOverHindi.perform();
	
	Action seriesOfAction = builder
		.moveToElement(textBox)
		.click()
		.keyDown(textBox, Keys.SHIFT)
		.sendKeys(textBox,"faiz.raad@gmail.com")
		.keyUp(textBox, Keys.SHIFT)
		.doubleClick(textBox)
		.contextClick()
		.build();

	seriesOfAction.perform();
	
	try {
	    Thread.sleep(20000);
	    driver.quit();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
    }
    
//    package mypackage;
//    
//    import org.openqa.selenium.*;
//    import org.openqa.selenium.firefox.FirefoxDriver;
//     
//    import org.openqa.selenium.interactions.Action;
//    import org.openqa.selenium.interactions.Actions;
//     
//    public class myclass {
//     
//    public static void main(String[] args) {
//    String baseUrl = "http://newtours.demoaut.com/";
//            WebDriver driver = new FirefoxDriver();
//     
//            driver.get(baseUrl);           
//            WebElement link_Home = driver.findElement(By.linkText("Home"));
//            WebElement td_Home = driver
//                    .findElement(By
//                    .xpath("//html/body/div"
//                    + "/table/tbody/tr/td"
//                    + "/table/tbody/tr/td"
//                    + "/table/tbody/tr/td"
//                    + "/table/tbody/tr"));    
//             
//            Actions builder = new Actions(driver);
//            Action mouseOverHome = builder
//                    .moveToElement(link_Home)
//                    .build();
//             
//            String bgColor = td_Home.getCssValue("background-color");
//            System.out.println("Before hover: " + bgColor);        
//            mouseOverHome.perform();        
//            bgColor = td_Home.getCssValue("background-color");
//            System.out.println("After hover: " + bgColor);
//            driver.quit();
//    }
//    }


//Method
//
//Description
//
//clickAndHold() - Clicks (without releasing) at the current mouse location.
//
//contextClick() - Performs a context-click at the current mouse location.
//
//doubleClick() - Performs a double-click at the current mouse location.
//
//dragAndDrop(source, target) - Performs click-and-hold at the location of the source element, moves to the location of the target element, then releases the mouse.
//
//Parameters:
//
//source- element to emulate button down at.
//
//target- element to move to and release the mouse at.
//
//dragAndDropBy(source, x-offset, y-offset) - Performs click-and-hold at the location of the source element, moves by a given offset, then releases the mouse.
//
//Parameters:
//
//source- element to emulate button down at.
//
//xOffset- horizontal move offset.
//
//yOffset- vertical move offset.
//
//keyDown(modifier_key) - Performs a modifier key press. Does not release the modifier key - subsequent interactions may assume it's kept pressed.
//
//Parameters:
//
//modifier_key - any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
//
//keyUp(modifier _key)
//
//Performs a key release.
//
//Parameters:
//
//modifier_key - any of the modifier keys (Keys.ALT, Keys.SHIFT, or Keys.CONTROL)
//
//moveByOffset(x-offset, y-offset)
//
//Moves the mouse from its current position (or 0,0) by the given offset.
//
//Parameters:
//
//x-offset- horizontal offset. A negative value means moving the mouse left.
//
//y-offset- vertical offset. A negative value means moving the mouse up.
//
//moveToElement(toElement)
//
//Moves the mouse to the middle of the element. Parameters:
//
//toElement- element to move to.
//
//release()
//
//Releases the depressed left mouse button at the current mouse location
//
//sendKeys(onElement, charsequence)
//
//Sends a series of keystrokes onto the element. Parameters:
//
//onElement - element that will receive the keystrokes, usually a text field
//
//charsequence - any string value representing the sequence of keystrokes to be sent



}
