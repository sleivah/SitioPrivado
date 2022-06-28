package com.project.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BonosPage extends ComunPage {
	
	private By bonosLocator = By.xpath("//*[@id=\"navbarPandoraBox\"]/header[1]/div[2]/nav/ul/li[3]/a");
	private By comprabonoLocator = By.className ("item-link active drop only-selected");
	
	
	public BonosPage (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public void Bonos () {
		click(bonosLocator);
		click(comprabonoLocator);
			
	}

}


