package com.project.pom.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.pom.hook.ConstantUrl;
import com.project.pom.pages.LoginPage;

public class Test_Registro {
	private static Logger log = LogManager.getLogger(Test_Registro.class);
	private static WebDriver driver;
		
	@BeforeTest
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
				
	@AfterTest
	public void tearDown() throws Exception{
		//driver.quit();		
	}
	
	@Test
	@Parameters({"username", "password"})
	public void Login(String username, String password) throws InterruptedException {
		LoginPage loginpage=new LoginPage (driver);
		loginpage.loginAfiliado(username, password);
		Assert.assertNotEquals(loginpage.getURL(), ConstantUrl.LOGIN_URL);
		
		log.info("hola");
		
	}	
}
