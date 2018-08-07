package com.cg.AmazonDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.ID,using="twotabsearchtextbox")
	 WebElement twotabsearchtextbox;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	  WebElement submit;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")
	 WebElement navigate;
	@FindBy(how=How.XPATH,using="//*[@id=\"add-to-cart-button\"]")
	 WebElement navigateto;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"huc-v2-order-row-confirm-text\"]/h1")
	 WebElement geth1;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_3\"]/div/div[3]/div[1]/a/h2")
	 WebElement pb;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_1\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")
	WebElement oneplus;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	WebElement redmi5;
	@FindBy(how=How.XPATH,using="//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	WebElement iphone10;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-cart\"]/span[2]")
	WebElement cart;
	@FindBy(how=How.XPATH,using="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement checkout;
}
