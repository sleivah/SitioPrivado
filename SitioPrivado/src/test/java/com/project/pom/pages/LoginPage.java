package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.project.pom.hook.ConstantUrl;

public class LoginPage extends ComunPage{

	By ingresoNameLocator = By.tagName("Ingresa a tu Nueva Sucursal Virtual");
	By usernameLocator = By.id("rut");
	By passwordLocator = By.name ("current-password");
	By confirmPasswordLocator = By.cssSelector("button[type='submit']");
	
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void loginAfiliado (String username, String password) throws InterruptedException {
		visit(ConstantUrl.LOGIN_URL);
		type(username, usernameLocator);
		type(password, passwordLocator);		
		click(confirmPasswordLocator);
		Thread.sleep(8000);	
	}
	
}