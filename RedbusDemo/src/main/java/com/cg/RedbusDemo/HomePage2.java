package com.cg.RedbusDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");



		HomePage home=PageFactory.initElements(driver, HomePage.class);	
		HomePage.fname(driver).sendKeys("Pune");
		Thread.sleep(2000);
		HomePage.fname(driver).sendKeys(Keys.ENTER);
		
		home.dest.sendKeys("Hyderabad");
		Thread.sleep(2000);
		home.dest.sendKeys(Keys.ENTER);
	
		home.onward_cal.sendKeys("");
		home.table.click();
		
		home.search_btn.click();
		Thread.sleep(10000);
		BookingPage book =PageFactory.initElements(driver, BookingPage.class);
		book.bus.click();
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"rt_10110097\"]/div/div/div/div[3]/div[2]/div[2]/canvas"));
		Actions action = new Actions(driver);
		action.moveToElement(element, 60, 40).click().build().perform();
		Thread.sleep(2000);
		book.board.click();
		book.Drop.click();
		book.proceed.click();
		Thread.sleep(10000);
		book.name.sendKeys("Rakesh");
		book.gender.click();
		book.age.sendKeys("21");
		book.email.sendKeys("rakesh@gmail.com");
		book.phno.sendKeys("9789825890");
		book.secure.click();
		book.payment.click();
	}
}
