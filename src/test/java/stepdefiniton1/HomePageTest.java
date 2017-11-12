package stepdefiniton1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import screenShotGenerator.ScreenshotGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest {
	WebDriver wd;
	
	@Given("^Open Browser as (.*)$")
	// ^-start symbol, $-end symbol- to match from feature file
	public void openBroswer(String browser) {
		wd= new FirefoxDriver();
		wd.manage().window().maximize();
	
	 
	}

	@Then("^Enter URL as (.*)$")
	public void enterUrl(String URL) {
		wd.get(URL);
	}

	@Then("^Enter Username as (.*)$")
	public void enterUsername(String username) {
		
 wd.findElement(By.xpath(".//*[@id='nameid']")).sendKeys(username);;
 
	}

	@And("^Enter MobileNumber as (.*)$")
	public void enterMobileNumber(String mobno) {
		wd.findElement(By.xpath(".//*[@id='mobid']")).sendKeys(mobno);
	}

	@Then("^Enter PickupAddr as (.*)$")
	public void enterPickupAddr(String pickupadd) {
		wd.findElement(By.xpath(".//*[@id='pickid']")).sendKeys(pickupadd);
	}

	@And("^Enter DropAddr as (.*)$")
	public void enterDropAddr(String dropadd) {
		wd.findElement(By.xpath(".//*[@id='dropid']")).sendKeys(dropadd);
	}

	@When("^Select Vtype as (.*)$")
	public void selectVtype(String vtype) {
		WebElement vehtypedropdown=wd.findElement(By.xpath(".//*[@id='vehid']"));
		Select s=new Select(vehtypedropdown);
		s.selectByVisibleText(vtype);
	}

	@Then("^Click Booklater$")
	public void clickBookLater() {
		wd.findElement(By.xpath(".//*[@id='bookLater']")).click();
	}

	@But("^Dont Click BookNow$")
	public void dontClickBookNow() {
System.out.println("Dont click Book now");
	}
	
	@After
	public void teardown(Scenario s) throws IOException
	{
		ScreenshotGenerator.generateScreenshot(wd, s);
	}

}
