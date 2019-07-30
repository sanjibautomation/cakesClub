package qa.cakesclub.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GuestUserSelection {
	public void SelectGuestUser(WebDriver driver, String userMobile, int userFunctionality){			
			int row_Count = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();		
			int page_count = driver.findElements(By.xpath("//div[@id='example_paginate']/ul/li")).size();
			int userFound = 0;
			outerloop:
			// Clicking on the next number page.
				for(int i =2;i<page_count;i++){
					driver.findElement(By.xpath("//div[@id='example_paginate']/ul/li["+i+"]/a")).click();
				for(int j=1;j<=row_Count;j++){
					String actuserMobileNo = driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+j+"]/td[2]")).getText();				
					// Click on view button
					if(userFunctionality == 1){
						if(actuserMobileNo.equals(userMobile)){
						driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+j+"]/td[3]/button[text()='View']")).click();
						userFound = 1;							
						break outerloop;
					}
					}
					// Click on orders button
					if(userFunctionality == 2){
						if(actuserMobileNo.equals(userMobile)){
							driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+j+"]/td[3]/button[text()='Orders']")).click();
							userFound = 1;							
							break outerloop;
						}
						
					}
					
					
				}	
		}
		if(userFound == 0){
			Assert.fail("ERROR: The active customer mobile number with number "+userMobile+" is not found.");
		}
	}

}
