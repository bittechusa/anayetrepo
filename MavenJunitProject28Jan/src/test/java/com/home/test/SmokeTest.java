package com.home.test;

import org.junit.Test;

public class SmokeTest extends BaseTest
{
	@Test
	public void test() throws InterruptedException
	{
	HomePage hp=new HomePage(dr);
	hp.clickMenPage();
	Thread.sleep(3000);
	
	}
}
