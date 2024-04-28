package org.tcs;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import org.checkerframework.checker.units.qual.m2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSSSelectors {
	int brokenLink;
	private int m1(int a, int b) {
		int c =a+b;
		System.out.println(brokenLink);
		return c;
		

	}
	
	public void m2(int d) {
		d =brokenLink+1;

	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		CSSSelectors c = new CSSSelectors();
		c.m1(1,3);
		}
	}
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		
//		List<WebElement> elements = driver.findElements(By.tagName("a"));
//		
//		for (int i = 0; i < elements.size(); i++) {
//			String attribute = elements.get(i).getAttribute("href");
//			System.out.println(attribute);
//		}
//		
//		
//		for (int i = 0; i < elements.size(); i++) {
//			String attribute = elements.get(i).getAttribute("href");
//			URL url = new URL(attribute);
//			URLConnection openConnection = url.openConnection();
//			HttpsURLConnection https = (HttpsURLConnection) openConnection;
//			int responseCode = https.getResponseCode();
//			
//			if (responseCode>400) {
//				System.out.println("The link is broken:" + attribute);
//				brokenLink++;
//			}else {
//				System.out.println("The link is working:"+ attribute);
//				
//			}	
//		}
//		
//		System.out.println("broken link count:" + brokenLink);
//		}
//		
//	}
//	
//		
//		
////		//1
//////		driver.findElement(By.cssSelector("#email")).sendKeys("Hello");
////		
////		//2
////		driver.findElement(By.cssSelector("input#pass")).sendKeys("Hello");
////		Thread.sleep(2000);
////		driver.findElement(By.cssSelector("input#pass")).clear();
////		
//////		List<WebElement> elements = driver.findElements(By.cssSelector("._55r1._1kbt"));
//////		for (WebElement webElement : elements) {
//////			webElement.sendKeys("efhbf");
//////		}
//////		Thread.sleep(2000);
////		
////		//3
////		WebElement element  = driver.findElement(By.cssSelector(".inputtext._55r1.inputtext._9npi.inputtext._9npi"));
////		element.clear();
////		element.sendKeys("Helloooooooo");
////		element.clear();
////		
////		//4
////		WebElement element2 = driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._9npi.inputtext._9npi"));
////		element2.sendKeys("BabyShark");
////		element2.clear();
////		
////		
////		WebElement element3 = driver.findElement(By.cssSelector("input[id='email']"));
////		element3.clear();
////		element3.sendKeys("56587999");
////		Thread.sleep(2000);
////		
////		driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._9npi.inputtext._9npi[id='pass']")).clear();
////		
////		driver.findElement(By.cssSelector("input.inputtext._55r1.inputtext._9npi.inputtext._9npi[name='pass']")).sendKeys("lkjhgfdsazzcxvbmn");
////		
////		WebElement email = driver.findElement(By.cssSelector("input[type='text'][ id='email'][name='email']"));
////		email.sendKeys("121212");
//		
////		driver.findElement(By.cssSelector("input[id^=em]")).sendKeys("1234");
////		driver.findElement(By.cssSelector("input[id$=il]")).sendKeys("1234");
////		driver.findElement(By.cssSelector("input[id*=ai]")).sendKeys("1234");