package com.cakesclub.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cakesclub.qa.base.TestBase;

public class CustomersPage extends TestBase{
<<<<<<< HEAD
	// Customer Page Factory
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
	@FindBy(xpath="//a[text()='Account Users']")
	public WebElement activeUserTab;
	@FindBy(xpath="//div[@id='customers-body']/div/div/h6")
	WebElement pageName;
	@FindBy(xpath="//div[@id='products-body']//following::a[text()='Back']")
	WebElement BackBtn;
	@FindBy(xpath="//div[@id='example1_filter']//following::input")
	WebElement accUserSearch;
<<<<<<< HEAD
	// Guest User Page Factory
	@FindBy(xpath="//h6[contains(text(),'Guest users')]")
	WebElement GuestUserPageName;
	@FindBy(xpath="//a[@id='btn_back_customers']")
	WebElement usersBackBtn;
	@FindBy(xpath="//div[@id='example_filter']//following::input")
	WebElement guestUserSeacrh;
	
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
	
	public CustomersPage(){
		PageFactory.initElements(driver, this);
	}

	// Actions	
	public String validatePageName(){
	activeUserTab.click();
	return pageName.getText();
	}
	
	public void viewAccUsersPage(){
	BackBtn.click();
	}
	public void orderAccUsersPage(){
		
	}
	public void accUserSearchFunctionality(){
		activeUserTab.click();
		accUserSearch.sendKeys(prop.getProperty("ReqAccUserSrchValue"));
	}
<<<<<<< HEAD
	public String validateGuestUserPageTest(){
		return GuestUserPageName.getText();
	}
	public void viewGuestUser() throws InterruptedException{
		Thread.sleep(2000);
		usersBackBtn.click();
	}
	public void orderGuestUser() throws InterruptedException{
		Thread.sleep(2000);
		usersBackBtn.click();
	}
	public void guestUserSearchTest(){
		guestUserSeacrh.sendKeys(prop.getProperty("ReqGuestUserMobile"));
	}
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e

}
