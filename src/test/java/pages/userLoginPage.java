package pages;

import org.openqa.selenium.By;

import utilities.broswerDriver;

public class userLoginPage extends broswerDriver{

//	public static String webPage = "https://www.saucedemo.com/";
	public static String user_id = "standard_user";
	public static String user_pwd = "secret_sauce";
	public static String uId = "user-name";
	public static String pwd = "password";
	public static String btn = "login-button";
	public static String title;
	
	public static void userBrowser() {
			driver.get("https://www.saucedemo.com/");
		System.out.println("page opened");
	}
	
	public static void user_Id() throws Exception {
		driver.findElement(By.id(uId)).sendKeys(user_id);
	}
	
	public static void user_Pwd() {
			driver.findElement(By.id(pwd)).sendKeys(user_pwd); 
			
	}
	
	
	public static void user_btn() {
	driver.findElement(By.id(btn)).click();
		}
		
	
		public static void title() throws Exception {
title = driver.getTitle();	
System.out.println("Logged in " +title);
	Thread.sleep(3000);
		
		}
	
}
