package cuke.stepdef;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebTest {
	
	public static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e13cr\\Documents\\Training\\Cuke-Gherkin\\MercuryTours\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	
	}
	
	
	@Given("^the right web address$")
	public void the_right_web_address() throws Throwable {
	    WebElement assist;
	    driver.get("http://demo.guru99.com/test/newtours/");
	    
	    assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img"));
	    
	    assertEquals("img", assist.getTagName());
	    
	}

	@Given("^I can navigate to the 'Register' page$")
	public void i_can_navigate_to_the_Register_page() throws Throwable {
	    WebElement assist;
	    
	    assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    assist.click();
	    
	    assertEquals("Contact Information", driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText());
	    
	}

	@When("^I fill all fields using the following information$")
	public void i_fill_all_fields_using_the_following_information(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		WebElement assist;
		
		List<List<String>> listData = arg1.raw();
		List<String> firstForm = listData.get(1);
		List<String> secondForm = listData.get(3);
		List<String> thirdForm = listData.get(5);
		
		
		//Name
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		assist.sendKeys(firstForm.get(0));
		//Surname
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"));
		assist.sendKeys(firstForm.get(1));
		//Phone
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"));
		assist.sendKeys(firstForm.get(2));
		//Mail
		assist = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		assist.sendKeys(firstForm.get(3));
		
		//Address
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input"));
		assist.sendKeys(secondForm.get(0));
		//City
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input"));
		assist.sendKeys(secondForm.get(1));
		//State
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input"));
		assist.sendKeys(secondForm.get(2));
		//Postal Code
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/input"));
		assist.sendKeys(secondForm.get(3));
		//Country
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		assist.click();
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[246]"));
		assist.click();
		
		
		//Username
		assist = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		assist.sendKeys(thirdForm.get(0));
		//Password
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input"));
		assist.sendKeys(thirdForm.get(1));
		//Password again
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"));
		assist.sendKeys(thirdForm.get(0));
		
		//Submit
		assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input"));
		assist.click();
		
		assertEquals("Note: Your user name is root.", driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")).getText());
		
	}

	@Then("^I can login as a new user using$")
	public void i_can_login_as_a_new_user_using(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		WebElement assist;
		List<List<String>> listData = arg1.raw();
		List<String> login = listData.get(1);
		
	    assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	    assist.click();
	    
	    assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	    assist.click();
	    
	    //Username
	    assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
	  	assist.sendKeys(login.get(0));
	  	//Password
	  	assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
	  	assist.sendKeys(login.get(1));
	  	
	  	assist = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		assist.click();
		
		assertEquals("Login Successfully", driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText());
	    
	}
	
	
	@After
	public void cleanup() {
		driver.close();
		driver.quit();
	}
	


}
