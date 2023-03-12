package com.loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BothIncorrect {
	@Test
	public void loginWithCorrectUserNameAndINCorrectPasswoed() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\musheik2\\AutomationArulPrasath\\DataDriven\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";

		driver.get(url);
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("txtUsername"));

		username.sendKeys("Admai");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("wrong");
		Thread.sleep(3000);

		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginbtn.click();
		Thread.sleep(3000);
		driver.quit();

	}
}
