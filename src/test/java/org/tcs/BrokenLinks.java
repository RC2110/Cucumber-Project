package org.tcs;

import java.util.List;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {
		int brokenCount=0;
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < elements.size(); i++) {
			String attribute = elements.get(i).getAttribute("href");
			URL url = new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection https = (HttpsURLConnection) openConnection;
			int responseCode = https.getResponseCode();
			
			if(responseCode>400) {
				System.out.println("The link is broken: " + attribute);
				
				brokenCount++;
			} else {
				System.out.println("The link is not broken "+ attribute);
			}	
		}
		System.out.println(brokenCount);
	}
}