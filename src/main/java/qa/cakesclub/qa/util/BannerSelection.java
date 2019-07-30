package qa.cakesclub.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BannerSelection {
	public void selectBanner(WebDriver driver,String bnrName,int bnrFunctionality){
		// select the Banner
<<<<<<< HEAD
		int page_Count = driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();			
		int bannerFound = 0;
		 
		
=======
		int row_count = driver.findElements(By.xpath("//tbody/tr")).size();
		int bannerFound = 0;
		int page_Count = driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
		outerloop:
		// Clicking on the next number page.
		for(int i =2;i<page_Count;i++){
			driver.findElement(By.xpath("//ul[@class='pagination']/li["+i+"]")).click();
<<<<<<< HEAD
			int row_count = driver.findElements(By.xpath("//tbody/tr")).size();
		for(int j=1;j<=row_count;j++){
			String bannerName = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[1]")).getText();			
			
			
			// Default Banner Status
			String actDefaultStatus = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[4]")).getText();
			String reqDefaultStatus = "First Banner";
			
=======
		for(int j=1;j<=row_count;j++){
			String bannerName = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[1]")).getText();
			// Default Banner Status
			String actDefaultStatus = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[4]")).getText();
			String reqDefaultStatus = "First Banner";
			// Active/Inactive Status
			//WebElement InactiveBanner = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[3]/a[@class='text-danger']"));
			//WebElement ActiveBanner = driver.findElement(By.xpath("//tbody/tr["+j+"]/td[3]/a[@class='text-success']"));
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
			// For "Active/Inactive" click
			if(bnrFunctionality==1){
				if(bannerName.equals(bnrName)){
					bannerFound = 1;					
					driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[1]")).click();
					if(!actDefaultStatus.equals(reqDefaultStatus)){
						String actSuccessMsg = driver.findElement(By.xpath("//div[@class='alert-messages']/div")).getText();
						String reqSuccessMsg = "Success! Status Changed successfully.";
						if(actSuccessMsg.contains(reqSuccessMsg)){
						System.out.println("Status Changed Successfully.");
						break outerloop;
						}
<<<<<<< HEAD
						else{
							System.out.println("ERROR: Status not changed successfully.");
						}
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
					}
					else{
						String actWarningMsg = driver.findElement(By.xpath("//div[@class='alert-messages']/div")).getText();
						String reqWarningMsg = "Success! Default banner cannot be inactive.";
						if(actWarningMsg.contains(reqWarningMsg)){
<<<<<<< HEAD
							System.out.println("Default Banner Cannot be set as inactive.");
=======
							System.out.println("Default Status Cannot be set as inactive.");
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
							break outerloop;
							}						
					}
				break outerloop;
			}
<<<<<<< HEAD
			
=======
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
			}
			// For "Default Banner" click
			else if(bnrFunctionality==2){
				if(bannerName.equals(bnrName)){
<<<<<<< HEAD
					bannerFound = 1;
					// Validate the default status value
					if(actDefaultStatus.equals(reqDefaultStatus)){
						System.out.println("Alert: The Selected banner is a default Banner.");
						break outerloop;
					}
					else{
						driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[2]")).click();
=======
					driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[2]")).click();
					bannerFound = 1;
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
						String actDefSuccessMsg = driver.findElement(By.xpath("//div[@class='alert-messages']/div")).getText();
						String reqDefSuccessMsg = "Success! Default Banner Changed successfully.";
						if(actDefSuccessMsg.contains(reqDefSuccessMsg)){
							System.out.println("Default Banner Changed Successfully.");
							break outerloop;
						}
						String actDefWarningMsg = driver.findElement(By.xpath("//div[@class='alert-messages']/div")).getText();
						String reqDefWarningMsg = "Error!Inactive banner cannot use as default banner!";
						if(actDefWarningMsg.contains(reqDefWarningMsg)){
							System.out.println("Inactive banner cannot use as default banner.");
							break outerloop;
						}
<<<<<<< HEAD
						
					}
					//break outerloop;
				}
			}
			
			// For "Edit" button click
			else if(bnrFunctionality==3){
			if(bannerName.equals(bnrName)){
				driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[@title='Edit'][1]")).click();
=======
					
					break outerloop;
				}
				
			}
			// For "Edit" button click
			else if(bnrFunctionality==3){
			if(bannerName.equals(bnrName)){
				driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[3]")).click();
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
				bannerFound = 1;
				break outerloop;
			}
			
		}
			// For "view" button click
		else if(bnrFunctionality==4){
			if(bannerName.equals(bnrName)){
<<<<<<< HEAD
				driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[@title='View'][1]")).click();
=======
				driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[4]")).click();
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
				bannerFound = 1;
				break outerloop;
			}
			
		}
			// For "delete" button click
		else if(bnrFunctionality==5){
			if(bannerName.equals(bnrName)){
<<<<<<< HEAD
				bannerFound = 1;
				if(actDefaultStatus.equals(reqDefaultStatus)){
				driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[@title='Delete'][1]")).click();
				driver.switchTo().alert().accept();
				break outerloop;
				}
				else{
					driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[@title='Delete'][1]")).click();
					break outerloop;
				}
			}
			
			
		}
			
		
		else{
			Assert.fail("ERROR: You have Entered wrong Input.");
		}
		
		}
		
		}
		
	
=======
				driver.findElement(By.xpath("//td[text()='"+bnrName+"']//following::a[5]")).click();
				bannerFound = 1;
				break outerloop;
			}
			
		}
		
		else{
			Assert.fail("Error: You have entered wrong input");
		}
		
		}
		}
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e

		if(bannerFound == 0){
			Assert.fail("Error: The Banner with name "+bnrName+" not found.");
		}
		
	}

}

