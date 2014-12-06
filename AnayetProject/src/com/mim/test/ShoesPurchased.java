package com.mim.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShoesPurchased 
{

	public static void main(String[] args) 
	{
		FirefoxDriver  mou= new FirefoxDriver();
		mou.get("http://www.facebook.com");
		 String pt =mou.getTitle();
		System.out.println(pt);
		
		Common y = new Common(mou);
		y.type(By.xpath("//*[@id='u_0_1']"),"Anayet");
		y.type(By.xpath("//*[@id='u_0_3']"),"Hossain");
		y.type(By.xpath("//*[@id='u_0_5']"),"mahossain1231@gmail.com");
		y.type(By.xpath("//*[@id='u_0_8']"),"mahossain1231@gmail.com");
		y.type(By.xpath("//*[@id='u_0_a']"),"mahossain1231");
		y.type(By.xpath("//*[@id='month']"),"December");
		y.type(By.xpath("//*[@id='day']"),"31");
		y.type(By.xpath("//*[@id='year']"),"1968");
		y.type(By.xpath("//*[@id='u_0_g']/span[1]/label"),"female");
		y.type(By.xpath("//*[@id='u_0_g']/span[2]/label"),"male");
		y.click(By.xpath("//*[@id='u_0_d']"));
		//y.click(By.xpath("//*[@id='u_0_e']"));
		
	}

}
