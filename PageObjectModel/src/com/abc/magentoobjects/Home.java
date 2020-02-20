package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	WebDriver driver;
	By logout = By.linkText("Log Out");
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}

}
