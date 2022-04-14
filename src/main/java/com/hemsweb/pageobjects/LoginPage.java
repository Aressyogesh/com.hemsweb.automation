/**
 * 
 */
package com.hemsweb.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hemsweb.actiondriver.Action;
import com.hemsweb.base.BaseClass;

/**
 * @author 
 *  
 */
public class LoginPage extends BaseClass {
	
	Action action= new Action();
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="UserName")
	private WebElement userName;
	
	@FindBy(id="Password")
	private WebElement password;

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement signInBtn;
	
	
	By username = By.id("UserName");
	By pwd = By.id("Password");
	By signinbtn = By.xpath("//input[@value='Log in']");
	
	
	 
	public void login(String uname, String pswd, DashboardPage dashboardPage) throws InterruptedException {
		
		action.setText(username, uname);
		action.setText(pwd, pswd);
		action.click(signinbtn);
		
		/*dashboardPage = new DashboardPage();
		return dashboardPage;*/
		 
	 }
	
		/*
		 * public HomePage login(String uname, String pswd,HomePage homePage) throws
		 * Throwable { action.scrollByVisibilityOfElement(getDriver(), userName);
		 * action.type(userName, uname); action.type(password, pswd);
		 * action.JSClick(getDriver(), signInBtn); Thread.sleep(2000); homePage=new
		 * HomePage(); return homePage; }
		 */
	
	
	
}






