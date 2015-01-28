package com.bit.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	FirefoxDriver dr;
	public HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public MenPage clickMenPage()
	{
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")).click();
		return new MenPage(dr);
	}
}
