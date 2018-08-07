package com.cg.RedbusDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.ID,using="dest")
	 WebElement dest;
	@FindBy(how=How.ID,using="onward_cal")
	 WebElement onward_cal;
	@FindBy(how=How.ID,using="search_btn")
	 WebElement search_btn;
/*	@FindBy(how=How.XPATH,using="//*[@id=\\\"rb-calendar_onward_cal\\\"]/table/tbody/tr[1]/td[2]")
	WebElement Month;*/
		// TODO Auto-generated method stub
	@FindBy(how=How.XPATH,using="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[4]")
	WebElement table;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[2]/div/ul/li[1]")
	WebElement dropdown;
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div/div[1]/div/ul/li[1]")
	WebElement dropdown1;
	private static WebElement element = null;
	 public static WebElement fname(WebDriver driver){
		 
      element = driver.findElement(By.id("src"));

      return element;
      

      }
}
