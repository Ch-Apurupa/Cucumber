package tcs.htc;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Registration {

	static WebDriver driver1;
	WebElement fname,lname;
	
	@Given("^The user is in registration page$")

	public void the_user_is_in_registration_page() 
{
	System.setProperty("webdriver.gecko.driver","D:\\Cucumber\\Register\\driver\\geckodriver.exe");
	driver1=new FirefoxDriver();
	driver1.get("http://demoqa.com/registration/");

}
    


@When("^The user enters firstname and lastname$")
public void the_user_enters_firstname_and_lastname() 
{
 
fname= driver1.findElement(By.id("name_3_firstname"));
fname.sendKeys("Appu");
lname=driver1.findElement(By.id("name_3_lastname"));
lname.sendKeys("Apurupa");
	
}

@Then("^The user validates the entered text in firstname and lastname field$")
public void the_user_validates_the_entered_text_in_firstname_and_lastname_field() 

{

	Assert.assertEquals("apurupa",fname.getAttribute("value"));
	Assert.assertEquals("chennakesavulu",lname.getAttribute("value"));

	
}
}


