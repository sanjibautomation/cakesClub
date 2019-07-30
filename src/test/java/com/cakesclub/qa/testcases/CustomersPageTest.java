package com.cakesclub.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cakesclub.qa.base.TestBase;
import com.cakesclub.qa.pages.CustomersPage;
import com.cakesclub.qa.pages.DashBoardPage;
import com.cakesclub.qa.pages.LoginPage;

import qa.cakesclub.qa.util.ActCustSelection;
<<<<<<< HEAD
import qa.cakesclub.qa.util.GuestUserSelection;
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e

public class CustomersPageTest extends TestBase{
	CustomersPage customersPage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	ActCustSelection actCustSelection;
<<<<<<< HEAD
	GuestUserSelection guestUserSelection;
	int custFunctionality=0;
	int userFunctionality=0;
	
=======
	int custFunctionality=0;
    int checkCustomersClass=0;
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
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
<<<<<<< HEAD
		guestUserSelection = new GuestUserSelection();
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
	}
	
	@Test
	public void validateCusPageTest(){
		String actPageName = customersPage.validatePageName();
		String reqPageName = prop.getProperty("reqCustPageName");
		Assert.assertEquals(actPageName, reqPageName,"ERROR: The Page name is not matching.");
	}
<<<<<<< HEAD
	
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
	@Test
	public void accCustViewTest(){
		custFunctionality= 1;		 
		actCustSelection.SelectCustomer(driver, prop.getProperty("ReqCustMobile"), custFunctionality);
		//customersPage.viewActUsersPage();
	}
<<<<<<< HEAD
	
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
	@Test
	public void accCustOrderTest(){
		custFunctionality = 2;
		actCustSelection.SelectCustomer(driver, prop.getProperty("ReqCustMobile"), custFunctionality);
	}
<<<<<<< HEAD
	
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
	@Test
	public void accUserSrchTest(){
		customersPage.accUserSearchFunctionality();
	}
<<<<<<< HEAD
	
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
	
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
}
