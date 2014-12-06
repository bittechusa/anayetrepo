package com.mim.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common 
{
	FirefoxDriver x;
	public Common(FirefoxDriver y)
	{
		x=y;
	}
	void type(By moga, String text)
	{
		x.findElement(moga).sendKeys(text);
	}
		void click(By moga)
		{
			x.findElement(By.xpath("//*[@id='u_0_i']")).click();
		}
}
