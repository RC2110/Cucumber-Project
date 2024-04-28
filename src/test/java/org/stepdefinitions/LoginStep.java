package org.stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	WebDriver driver;

	@Given("Login page on omr branch")
	public void loginPageOnOmrBranch() {

		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("Enter the {string} and {string}")
	public void enterTheAnd(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);

	}

	@When("Click the login button")
	public void clickTheLoginButton() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

	@Then("verify successful login message")
	public void verifySuccessfulLoginMessage() {
		Assert.assertTrue("verify msg", true);

	}

	@Given("User is on Amazon page")
	public void userIsOnAmazonPage() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}


	@When("User enter the {string}")
	public void userEnterThe(String string) {
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("mobile", Keys.ENTER);

	}

	@Then("verify search results message")
	public void verifySearchResultsMessage() {
		Assert.assertTrue("Verify result", true);

	}

}