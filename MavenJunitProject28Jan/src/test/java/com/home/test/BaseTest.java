package com.home.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver dr;	
	@Before
	public void start() throws Exception
	{
		dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
		Thread.sleep(3000);
	}
	
	@After
	public void end()
	{
	dr.quit();
	}
	
}
