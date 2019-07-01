package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Addtariffsteps {
	static WebDriver Driver;

	@Given("The user is in telecom tariff page")
	public void the_user_is_in_telecom_tariff_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\ProjectWorkspace\\cucumber1\\driver\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("http://demo.guru99.com/telecom/");
		Driver.manage().window().maximize();
	}

	@Given("The user click on add tariffplan")
	public void the_user_click_on_add_tariffplan() {
		Driver.findElement(By.xpath("//div[@class='flex-item right']//div/h3/a")).click();
	}

	@When("The user is filling all the tariff details")
	public void the_user_is_filling_all_the_tariff_details() {
		Driver.findElement(By.xpath("//input[@name='rental']")).sendKeys("2500");
		Driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys("1000");
		Driver.findElement(By.xpath("//input[@name='inter_minutes']")).sendKeys("200");
		Driver.findElement(By.xpath("//input[@name='sms_pack']")).sendKeys("100");
		Driver.findElement(By.xpath("//input[@name='minutes_charges']")).sendKeys("5");
		Driver.findElement(By.xpath("//input[@name='inter_charges']")).sendKeys("15");
		Driver.findElement(By.xpath("//input[@name='sms_charges']")).sendKeys("1");
	}

	@When("The user click on tariff submit button")
	public void the_user_click_on_tariff_submit_button() {
		Driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("The user should be displayed congratulation you add Tariff Plan")
	public void the_user_should_be_displayed_congratulation_you_add_Tariff_Plan() {
		Assert.assertTrue(Driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	
	}

}
