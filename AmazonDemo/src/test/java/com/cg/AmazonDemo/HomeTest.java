package com.cg.AmazonDemo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest {

	WebDriver driver = null; 
	   @Given("Open Amazon$") 
	   public void goToRegPage() { 
		    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.navigate().to("https://www.amazon.in/ref=nav_logo");
	   }
	   
	   @When("^I enter Search as (.*)$") 
	   public void enterUsername(String arg1) {   
		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.navigate.click();
		   driver.navigate().to("https://www.amazon.in/Sanyo-inches-XT-32S7000H-Ready-Black/dp/B01ICVLKFC/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533559017&sr=1-1&keywords=TV");
		   home.navigateto.click();
	   }
	   @Then("^TV Should be added to cart$")
	   public void checkPass() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   
	   @When("^I Search as (.*)$") 
	   public void enterUsername1(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.pb.click();
		   driver.navigate().to("https://www.amazon.in/dp/B077RV8CCY/ref=sxnav_sxwds-bovbp-p_l_1?pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=8461522723364323697&pd_rd_wg=2y5Xw&pf_rd_r=WCEKTGR2BD871F9J5105&pf_rd_s=desktop-sx-nav&pf_rd_t=301&pd_rd_i=B077RV8CCY&pd_rd_w=cklaV&pf_rd_i=Power+Bank&pd_rd_r=f68a70a2-1a5b-444f-bf80-a1eaf8dae29b&ie=UTF8&qid=1533560551&sr=1");
		   home.navigateto.click();
	   }
	   @Then("^Power Bank Should be added to cart$")
	   public void checkPass1() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I click Search (.*)$") 
	   public void enterUsername2(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.oneplus.click();
		   driver.navigate().to("https://www.amazon.in/dp/B0756Z43QS/ref=sxnav_sxwds-bovbp-i_mh_m_1?pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=5ab731bd-dd32-4fb8-95ec-9c68a4f37eb9&pd_rd_wg=m6TNV&pf_rd_r=CCY3TP9RKDAPN13GB3KA&pf_rd_s=desktop-sx-nav&pf_rd_t=301&pd_rd_i=B0756Z43QS&pd_rd_w=nlx5B&pf_rd_i=oneplus+6&pd_rd_r=f4d27ebe-cec5-4b32-8561-33a041b488fc&ie=UTF8&qid=1533613526&sr=1");
		   home.navigateto.click();
	   }
	   @Then("^oneplus6 Should be added to cart$")
	   public void checkPass2() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I want to buy (.*)$") 
	   public void enterUsername3(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.redmi5.click();
		   driver.navigate().to("https://www.amazon.in/Mi-Redmi-5-Black-32GB/dp/B077PWBC7J/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533615417&sr=1-1&keywords=redmi+5");
		   home.navigateto.click();
	   }
	   @Then("^Redmi5 Should be added to cart$")
	   public void checkPass3() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^I wish to Buy (.*)$") 
	   public void enterUsername4(String arg1) { 

		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.twotabsearchtextbox.sendKeys(arg1);
		   home.submit.click();
		   home.iphone10.click();
		   driver.navigate().to("https://www.amazon.in/Apple-iPhone-X-Silver-256GB/dp/B071P37652/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533615681&sr=1-1&keywords=iphone+10");
		   home.navigateto.click();
	   }
	   @Then("^Iphone10 Should be added to cart$")
	   public void checkPass4() {  
		   HomePage home=PageFactory.initElements(driver, HomePage.class);
		   assertEquals(home.geth1.getText(),"Added to Cart");
	   }
	   @When("^All Items are added (.*)$") 
	   public void enterUsername5(String arg1) { 
		   HomePage home=PageFactory.initElements(driver, HomePage.class);	
		   home.cart.click();
		   home.checkout.click();
	   }
	   
}
