package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Samples {
				public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\.eclipse\\java-2019-093\\eclipse\\Ani\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
}
}
