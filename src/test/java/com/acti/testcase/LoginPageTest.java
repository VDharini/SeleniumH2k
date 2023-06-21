package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	@Test
	public void testLoginFunction() throws InterruptedException {
		lp.enterUserName("admin");
		lp.enterPassword("manager");
		lp.clickLoginButton();
	
		String user = ep.getUserLoggedInfot();
		System.out.println(user);
		Assert.assertTrue(user.contains("John"));
		ep.ClickLogout();

		Thread.sleep(2000);

	}
@Test
public void testForgotPasswordLink()
{
	boolean flag = lp.forgotPasswordLink();
	Assert.assertTrue(flag);
}

@Test
public void testLoginPageTitle()
{
	String title = lp.loginPageTitle();
	Assert.assertTrue(title.contains("Login"));

}
}
