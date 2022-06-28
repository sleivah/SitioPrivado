package com.project.pom.hook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private WebDriver driver;
	
	protected Base (WebDriver driver) {
		this.driver =driver;
	}
	
	protected WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}

	protected WebElement findElement (By locator) {
		return driver.findElement(locator);
	}
	
	protected List<WebElement> findElements (By locator){
		return driver.findElements(locator);
	}
	
	protected String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	protected void type (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	protected void click (By locator) {
		driver.findElement(locator).click();
	}
	
	protected Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	
	protected void visit (String url) {
		driver.get(url);
		//thread.sleep(2000) //cada vez se haga una llamada está impcito el tiempo
	}
	
	protected String getUrlActual() {
		return driver.getCurrentUrl();
	}
	
}
