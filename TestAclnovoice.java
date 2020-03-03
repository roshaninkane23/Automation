package org.qsp.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.Aclnvoice;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAclnovoice
{
	@Test
	public void TestAclnovoice1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://qa.aceinvoice.com/sign_in");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,200)");
		Aclnvoice w=new Aclnvoice(driver);
		Thread.sleep(1000);
		w.signup1();
		w.SearchEnter("random000000123456@gmail.com");
		
		j.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		w.PasswdInter("Roshan23@");
		w.Conform_pass("Roshan23@");
		w.Inter_First_name("roshan");
        w.inter_last_name("inka");
        j.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        w.click_check_box();
        w.click_confrom_submit();
        w.enter_org_name("Bigbinary");
        j.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
       w.enter_slip();
        w.continue_button();
        w.verify_name_username("roshan inka");
        w.verify_emailst("random000000123456@gmail.com");

     
        
        
}       
}