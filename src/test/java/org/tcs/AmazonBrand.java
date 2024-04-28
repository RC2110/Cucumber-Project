package org.tcs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrand {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobile&crid=2IKKEOPKNN3J5&sprefix=mobile%2Caps%2C401&ref=nb_sb_ss_ts-doa-p_2_6");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Brand']//parent::div//parent::span//parent::a//following-sibling::div//ul//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']"));
		for (WebElement webElement : elements) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			webElement.click();
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
