package com.stepdefinition;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class Addcustonersteps {
	static WebDriver Driver;
	
	@Given("The user is in telecom home page")
	public void the_user_is_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver","E:\\ProjectWorkspace\\cucumber1\\driver\\chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get("http://demo.guru99.com/telecom/");
		Driver.manage().window().maximize();
	   
	}

	@Given("The user click on add customer")
	public void the_user_click_on_add_customer() throws Throwable {
	   Driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	   Thread.sleep(3000);
	}

	@When("The user is filling all the details")
	public void the_user_is_filling_all_the_details() {
	   Driver.findElement(By.xpath("//label[@for='done']")).click();
	   Driver.findElement(By.id("fname")).sendKeys("ASAR");
	   Driver.findElement(By.id("lname")).sendKeys("A");
	   Driver.findElement(By.id("email")).sendKeys("Asarmca12@gmail.com");
	   Driver.findElement(By.name("addr")).sendKeys("chennai");
	   Driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
	   
	}

	@When("The user click on submit button")
	public void the_user_click_on_submit_button() {
		Driver.findElement(By.xpath("//input[@type='submit']")).click();
	   	}

	@Then("The user should be displayed id")
	public void the_user_should_be_displayed_id() {
	    Assert.assertTrue(Driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}



}
