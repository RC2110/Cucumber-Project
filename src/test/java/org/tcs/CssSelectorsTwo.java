package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CssSelectorsTwo {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement fbText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you')]"));
		
		String textColor = fbText.getCssValue("background-color");
		System.out.println(textColor);
		
		Actions action = new Actions(driver);
		action.doubleClick(fbText).perform();
		
		String textColor2 = fbText.getCssValue("color");
		System.out.println(textColor2);
		
		if (textColor.equals(textColor2)) {
			System.out.println("The text is not highlighted");			
		}
		else {
			System.out.println("The text is highlighted");	
		}	
	}
}