package com.sitioprivado;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IngresoSitioPrivado {
	
	private static WebDriver driver;
	By ingresoNameLocator = By.tagName("Ingresa a tu Nueva Sucursal Virtual");
	By usernameLocator = By.id("rut");
	By passwordLocator = By.name ("current-password");
	By confirmPasswordLocator = By.cssSelector("button[type='submit']");
	By bonosLocator = By.className("item-link drop"); 
	

	//By miPlanLocator = By.className("card-acceso");
	
	
	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa-login-banmedica.apps.ocpdev.banmedica.cl/login");
	}

	
	
	@After
	public void tearDown() {
		//driver.quit();
	}

	@Test
	public void testIngresoSitioPrivado() throws InterruptedException{
		
			if (driver.findElement(usernameLocator).isDisplayed()){
			driver.findElement(usernameLocator).sendKeys("158438178");
			driver.findElement(passwordLocator).sendKeys("123456");
			driver.findElement(confirmPasswordLocator).click();
			driver.findElement(bonosLocator).click();			
			Thread.sleep(2000);
}
	}
	
	
	//@Test
	//public void testMiPlan() {
		
		//if (driver.findElement(miPlanLocator).isDisplayed()) {
		//driver.findElement(miPlanLocator).click();
		//}
	//}
}

