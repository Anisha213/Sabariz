package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Samples {
				public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\.eclipse\\java-2019-093\\eclipse\\Ani\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int size = links.size();
			System.out.println(size);
			for (WebElement l : links) {
				String linkName = l.getAttribute("href");
			System.out.println(linkName);
			}
List<WebElement> images = driver.findElements(By.tagName("img"));
int size2 = images.size();
System.out.println(size2);
for (WebElement i : images) {
	String imageName = i.getAttribute("src");
	System.out.println(imageName);
}
				
				}
				
}