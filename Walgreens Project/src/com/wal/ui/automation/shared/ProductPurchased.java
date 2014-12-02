package com.wal.ui.automation.shared;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductPurchased 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.Walgreens.com");
		WebElement newlink =
		driver.findElement(By.xpath("//*[@id='products']/li[1]/span/a"));
		Common common = new Common(driver);
		common.click(newlink);
		Thread.sleep(5000);
		/*WebElement womenlink =
				driver.findElement(By.xpath("//*[@id='main-nav-woman']/a"));
		common.click(womenlink);
		Thread.sleep(5000);
		WebElement shoeslink =
				driver.findElement(By.xpath("//*[@id='main-nav-shoes']/a"));
		common.click(shoeslink);*/
		
		driver.quit();

	}

}
