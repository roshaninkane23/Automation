package org.qsp.pom;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;
import com.sun.xml.internal.bind.v2.runtime.Name;

import bsh.This;

public class Aclnvoice
{
@FindBy(xpath = "//a[contains(.,'Sign Up')]")
private WebElement signin;

@FindBy(xpath = "//input[@placeholder=\"Email Address\"]")
private WebElement search;

@FindBy(xpath = "//input[@name=\"password\"]")
private WebElement passwd;

@FindBy(xpath = "//input[@name=\"password_confirmation\"]")
private WebElement conform_Pw;

@FindBy(xpath = "//input[@name=\"user[first_name]\"]")
private WebElement first_name;

@FindBy(xpath = "//input[@name=\"user[last_name]\"]")
private WebElement last_name;

@FindBy(xpath = "//label[@class=\"control control--checkbox d-flex align-items-center justify-content-start\"]/div[@class=\"control__indicator\"]")
private WebElement check_box;
@FindBy(xpath = "//input[@value=\"Continue\"]")
private WebElement conform_b;

@FindBy(xpath = "//input[@name=\"name\"]")
private WebElement org_name;

@FindBy(xpath = "//a[@class=\"btn btn-outline\"]")
private WebElement skip;

@FindBy(xpath = "//button[contains(.,'Continue to the app')]")
private WebElement continueapp;

@FindBy(xpath = "//a[contains(.,'roshan inka')]")
private WebElement name;

@FindBy(xpath = "//td[contains(.,'random000000123456@gmail.com')]")
private WebElement email_name;
public Aclnvoice(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public void signup1()
{
	signin.click();
}
public void SearchEnter(String name)
{
	search.sendKeys(name,Keys.ENTER);
	
}

public void PasswdInter(String pwd) 
{
	passwd.sendKeys(pwd);
}
public void Conform_pass(String cpw)

{
	conform_Pw.sendKeys(cpw,Keys.ENTER);
	
}
public void Inter_First_name(String name)
{
	first_name.sendKeys(name);
}
public void inter_last_name(String name) 
{
	last_name.sendKeys(name);
}
public void click_check_box() 
{
	check_box.click();
}
public void click_confrom_submit() 
{
	conform_b.sendKeys(Keys.ENTER);
}
public void enter_org_name(String name) 

{
org_name.sendKeys(name,Keys.ENTER);	
}
public void enter_slip() 
{
	skip.sendKeys(Keys.ENTER);
}
public void continue_button()
{
	continueapp.sendKeys(Keys.ENTER);
	
}
public void verify_name_username(String name2) 
{
Assert.assertEquals(name.getText(),name2);
}
public void verify_emailst(String name3)
{
	Assert.assertEquals(email_name.getText(), name3);
}
{
	
}

}
