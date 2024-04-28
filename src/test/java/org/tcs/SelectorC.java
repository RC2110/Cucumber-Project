package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectorC {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_make_a_website.asp");
		driver.manage().window().maximize();
		
		WebElement eText = driver.findElement(By.xpath("//h3[text()='Example']"));
		
		String textColor = eText.getCssValue("background-color");
		System.out.println(textColor);
		
		Actions action = new Actions(driver);
//		action.doubleClick(eText).perform();
		
		String textColor2 = eText.getCssValue("color");
		System.out.println(textColor2);
		
		if (textColor.equals(textColor2)) {
			System.out.println("The text is not highlighted");			
		}
		else {
			System.out.println("The text is highlighted");	
		}	

	}
}