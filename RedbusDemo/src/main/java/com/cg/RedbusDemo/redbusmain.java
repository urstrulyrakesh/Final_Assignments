package com.cg.RedbusDemo;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class redbusmain {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");



	HomePage home=PageFactory.initElements(driver, HomePage.class);	
	HomePage.fname(driver).sendKeys("Pune");
	String Pune="Pune";	

	home.dest.sendKeys("Hyderabad");
	home.onward_cal.sendKeys("");
/*	WebElement table = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[3]"));

	table.click();*/
	WebElement table1= driver.findElement(By.id("rb-calendar_return_cal"));
	List<WebElement> listOfRows = table1.findElements(By.tagName("tr"));
	System.out.println(listOfRows.size());
	List<WebElement> listOfCols = listOfRows.get(2).findElements(By.tagName("td"));
	System.out.println(listOfCols.size());
	for(int i=3;i<=listOfRows.size();i++)
	{
		for(int j=1;j<=listOfCols.size();j++)
		{
	     WebElement authorColumn=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr["+i+"]/td["+j+"]"));
	     if(authorColumn.getText().toLowerCase().equalsIgnoreCase("22"))
	     {
	    	 System.out.println(authorColumn.getText());
	    	 authorColumn.click();
	    	 break;
	     }
		}
	}
	WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
	dropdown.click();
	home.search_btn.click();
}
}
