package com.project.pom.pages;

import org.openqa.selenium.WebDriver;

import com.project.pom.hook.Base;

public class ComunPage extends Base{

	public String getURL() {
		return getUrlActual();
	}
	
	
	public ComunPage (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
