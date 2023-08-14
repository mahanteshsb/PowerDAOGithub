package com.power.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.power.qa.base.TestBase;
import com.power.qa.util.Helpers;

public class FeaturesPage extends BasePage{

	public FeaturesPage(WebDriver driver) {
		super(TestBase.getDriver());
		
	}
Helpers helper=new Helpers();

@FindBy(xpath = "//span[text()='Features']")
WebElement feature;

@FindBy(xpath = "//span[text()='Facebook Marketing']")
WebElement Facebook;

@FindBy(xpath = "//span[text()='Instagram Marketing']")
WebElement Instagram;

@FindBy(xpath = "//span[text()='Twitter Marketing']")
WebElement Twitter;

@FindBy(xpath = "//span[text()='Linkedin Marketing']")
WebElement LinkedIn;

@FindBy(xpath = "//a[@title=\"Youtube Marketing\"]")
WebElement YouTube;

@FindBy(xpath = "//span[text()='Quora Marketing']")
WebElement Quora;

@FindBy(xpath = "//span[text()='Pinterest Marketing']")
WebElement Pinterest;

@FindBy(xpath = "//span[text()='Reddit Marketing']")
WebElement Reddit;

public void featureTest() {
	helper.waitForPageToLoad();
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	//helper.click(feature);
	Reporter.log("Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitForPageToLoad();
	helper.waitFor(Facebook);
	helper.highLightElement(driver, Facebook);
	helper.click(Facebook);
	Reporter.log("Page Tittle =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Instagram);
	helper.highLightElement(driver, Instagram);
	helper.click(Instagram);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Titlev=" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Twitter);
	helper.highLightElement(driver, Twitter);
	helper.click(Twitter);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(LinkedIn);
	helper.highLightElement(driver, LinkedIn);
	helper.click(LinkedIn);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(YouTube);
	helper.highLightElement(driver, Facebook);
	helper.click(YouTube);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Quora);
	helper.highLightElement(driver, Quora);
	helper.click(Quora);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Pinterest);
	helper.highLightElement(driver, Pinterest);
	helper.click(Pinterest);
	Reporter.log("Page Tittle = " + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
	
	helper.waitFor(feature);
	helper.highLightElement(driver, feature);
	helper.moveToElement(feature);
	Reporter.log("Back To Main Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	helper.waitFor(Reddit);
	helper.highLightElement(driver, Reddit);
	helper.click(Reddit);
	Reporter.log("Page Title =" + driver.getTitle());
	helper.waitForPageToLoad();
	
	driver.navigate().back();
	helper.waitForPageToLoad();
}

}
