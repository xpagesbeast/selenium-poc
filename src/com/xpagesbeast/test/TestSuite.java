package com.xpagesbeast.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSuite {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/home/slobodan/libraries/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String baseURL = "http://cbcdev.canalbarge.com/bmr/2.6/BMR_MobUI.nsf/UnpMain.xsp";
		driver.get(baseURL);
		
		//part 2 get a id from the page and get a handle to it.
		String xpathExpression = "/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]";
		String searchElementById = "lst-ib";
		String searchElementByName = "btnK";
		
		driver.findElement(By.id(searchElementById)).sendKeys("XPages Rocks!");
		
		//part 3 click on a action
		driver.findElement(By.xpath(xpathExpression)).click();
		
	}

}
