package com.cucumber.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.keywords.UITestKeyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsSteps {

	//@testNG annotation(cucumber)
	@FindBy (xpath="(//input[@type=\"text\"])[1]")
	WebElement	searchBar;

	@Given("openChrome")
	public  void openBrowser() {

		UITestKeyword.openBrowser("chrome");
		System.out.println("brouser");

	}
	@And("application url launched")
	public static void launchUrl() {
		UITestKeyword.launchURL("https://www.igp.com");
		System.out.println("Url launch Successfully");
	}

	/*
	 * public void clickOnSearchBar(WebElement element) { element.click();
	 * 
	 * }
	 */
	@When("user serches polo men")
	public void searchProduct() {
		//UITestKeyword.enterText(searchBar, "polo men");
		UITestKeyword.driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("polo Men");

	}

	@Then("all result related to polo men should be displayed")
	public void verifySearchResult() {
		System.out.println("pass");
	}
	@And("click on any searched result")
	public void  searchResult(){
		System.out.println("pass");
	}

public void scrollbar() {
	System.out.println("search bar");
}

}
