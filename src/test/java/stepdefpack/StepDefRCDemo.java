package stepdefpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefRCDemo {

	WebDriver driver;
//	@Given("^user is to enter URL$")
//	public void user_is_to_enter_URL() throws Throwable {
//	   
//		System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com");
//	}
//
//	@When("^user is to enter the uid \"([^\"]*)\" and pswd \"([^\"]*)\"$")
//	public void user_is_to_enter_the_uid_and_pswd(String username, String password) throws Throwable {
//		    driver.findElement(By.xpath("//div[@id='divUsername']//input[@type='text']")).sendKeys(username);
//		    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
//		}
//	
//
//@Then("^user should submit$")
//public void user_should_submit() throws Throwable {
//	    
//		driver.findElement(By.id("btnLogin")).click();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.close();
//	}
//@When("^user is going to enter below  uid and pswd$")
//public void user_is_going_to_enter_below_uid_and_pswd(DataTable datatable) throws Throwable {
//	List<String>li=datatable.asList(String.class);
//    driver.findElement(By.xpath("//div[@id='divUsername']//input[@type='text']")).sendKeys(li.get(0));
//    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(li.get(1));
//
//}


@Given("^User should open Googlechrome with Url$")
public void user_should_open_Googlechrome_with_Url() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
}

@When("^User going to pass Credential given below$")
public void user_going_to_pass_Credential_given_below(DataTable datatable) throws Throwable {
	List<String>li=datatable.asList(String.class);
    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(li.get(0));
    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(li.get(1));
}

@Then("^User should click on Submit$")
public void user_should_click_on_Submit() throws Throwable {
	driver.findElement(By.id("btnLogin")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.close();
}


}
