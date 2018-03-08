package POM;
//Selenium Imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class POM_File {

	 WebDriver driver;
	 By Myaccount_button =(By.xpath(".//*[@id='top-links']/ul/li[2]/a/span[2]"));
	 By Myaccount_login_button =(By.xpath(".//*[@id='top-links']/ul/li[2]/ul/li[2]/a"));
	 By input_email_field =(By.id("input-email"));
	 By input_password_field =(By.id("input-password"));
	 By login_button_myaccpage =(By.xpath(".//*[@id='content']/div/div[2]/div/form/input"));
	 By redirect_to_addressbook_button =(By.xpath(".//*[@id='column-right']/div/a[4]"));
	 By new_address_button =(By.xpath(".//*[@id='content']/div/div[2]/a"));
	 By address_firstname =(By.id("input-firstname"));
	 By address_lastname =(By.id("input-lastname"));
	 By address_company =(By.id("input-company"));
	 By address_address_field1 =(By.id("input-address-1"));
	 By address_address_field2 =(By.id("input-address-2"));
	 By address_city =(By.id("input-city"));
	 By address_postcode =(By.id("input-postcode"));
	 By address_country_click =(By.xpath(".//*[@id='input-country']"));
	 By address_country =(By.id("input-country"));
	 By address_zone =(By.xpath(".//*[@id='input-zone']")); 
	 By address_default_address_yes =(By.xpath(".//*[@id='content']/form/fieldset/div[10]/div/label[1]/input"));
	 By address_default_address_no =(By.xpath(".//*[@id='content']/form/fieldset/div[10]/div/label[2]/input")); 
	 By address_continue_button =(By.xpath(".//*[@id='content']/form/div/div[2]/input"));
	 By success_message =(By.xpath("//div[@id='account-address']/div"));

	public POM_File(WebDriver driver){

        this.driver = driver;

    }
	
	public void click_on_myaccount()
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Myaccount_button));
		 driver.findElement(Myaccount_button).click();
	}


	public void click_on_login_button() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Myaccount_login_button));
		 driver.findElement(Myaccount_login_button).click();
	}
	
	public void enter_email(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(input_email_field));
		 driver.findElement(input_email_field).sendKeys(s1);
	}
	
	public void enter_password(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(input_password_field));
		 driver.findElement(input_password_field).sendKeys(s1);
	}
	
	public void click_on_login_button_after_email_pswd() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(login_button_myaccpage));
		 driver.findElement(login_button_myaccpage).click();
	}
	
	public void click_on_AddressBook_Button() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(redirect_to_addressbook_button));
		 driver.findElement(redirect_to_addressbook_button).click();
	}
	
	public void click_on_add_new_address() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(new_address_button));
		 driver.findElement(new_address_button).click();
	}
	
	public void enter_address_firstname(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_firstname));
		 driver.findElement(address_firstname).sendKeys(s1);
	}
	
	public void enter_address_lastname(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_lastname));
		 driver.findElement(address_lastname).sendKeys(s1);
	}
	
	public void enter_address_company(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_company));
		 driver.findElement(address_company).sendKeys(s1);
	}
	
	public void enter_address_address1(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_address_field1));
		 driver.findElement(address_address_field1).sendKeys(s1);
	}
	
	public void enter_address_address2(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_address_field2));
		 driver.findElement(address_address_field2).sendKeys(s1);
	}
	
	public void enter_address_city(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_city));
		 driver.findElement(address_city).sendKeys(s1);
	}
	
	public void enter_address_postalcode(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_postcode));
		 driver.findElement(address_postcode).sendKeys(s1);
	}


	
	public void select_Country_fromaddress(String s1)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_country));
		 Select country_Element = new Select(driver.findElement(address_country));
		 country_Element.selectByVisibleText(s1);
	}
	
	public void select_state_fromCountry_fromaddress(String s1) throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 Thread.sleep(2000);
		 Select country_Element = new Select(driver.findElement(address_zone));
		 country_Element.selectByVisibleText(s1);
	}
	
	public void click_on_submit_Address() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(address_continue_button));
		 driver.findElement(address_continue_button).click();
	}
	
	public String return_Message() {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(success_message));
		return  (driver.findElement(success_message).getText());
	}
}


