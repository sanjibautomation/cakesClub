package com.cakesclub.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cakesclub.qa.base.TestBase;
import com.cakesclub.qa.pages.CustomersPage;
import com.cakesclub.qa.pages.DashBoardPage;
import com.cakesclub.qa.pages.LoginPage;

import qa.cakesclub.qa.util.ActCustSelection;
import qa.cakesclub.qa.util.GuestUserSelection;

public class CustomersPageTest extends TestBase{
	CustomersPage customersPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ActCustSelection actCustSelection;
	GuestUserSelection guestUserSelection;
	int custFunctionality=0;
	int userFunctionality=0;
	
	public CustomersPageTest(){
		super();
	}
	
	@BeforeMethod
	public void Setup(){
		initialization();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		customersPage = new CustomersPage();
		dashBoardPage.ClickOnCustomerModule();
		actCustSelection = new ActCustSelection();
		guestUserSelection = new GuestUserSelection();
	}
	
	@Test
	public void validateCusPageTest(){
		String actPageName = customersPage.validatePageName();
		String reqPageName = prop.getProperty("reqCustPageName");
		Assert.assertEquals(actPageName, reqPageName,"ERROR: The Page name is not matching.");
	}
	
	@Test
	public void accCustViewTest(){
		custFunctionality= 1;		 
		actCustSelection.SelectCustomer(driver, prop.getProperty("ReqCustMobile"), custFunctionality);
		//customersPage.viewActUsersPage();
	}
	
	@Test
	public void accCustOrderTest(){
		custFunctionality = 2;
		actCustSelection.SelectCustomer(driver, prop.getProperty("ReqCustMobile"), custFunctionality);
	}
	
	@Test
	public void accUserSrchTest(){
		customersPage.accUserSearchFunctionality();
	}
	
	@Test
	public void validateGuestUserPageTest(){
		String actPageName = customersPage.validateGuestUserPageTest();
		String reqPageName = prop.getProperty("ReqGuestPageName");
		Assert.assertEquals(actPageName, reqPageName,"ERROR: The Page name is not matching.");
	}
	
	@Test
	
	public void guestUserViewTest() throws InterruptedException{
		userFunctionality = 1;
		guestUserSelection.SelectGuestUser(driver, prop.getProperty("ReqGuestUserMobile"), userFunctionality);
		customersPage.viewGuestUser();
	}
	
	@Test	
	public void guestUserOrderTest() throws InterruptedException{
		userFunctionality = 2;
		guestUserSelection.SelectGuestUser(driver, prop.getProperty("ReqGuestUserMobile"), userFunctionality);
		customersPage.orderGuestUser();
	}
	
	@Test
	public void guestUserSearchTest(){
		customersPage.guestUserSearchTest();		
	}
	
}
