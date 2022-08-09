package suiteCRM_TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import suiteCRM_BasePackage.baseCRM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class logintest_version2 extends baseCRM {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = SetProperty();	
		driver.get("https://suitecrm.theautomationtechies.com/public/index.php#/Login");
	}
	@DataProvider(name="users")
	public Object[][] getDataFromDataprovider(){
		return new Object[][]
				{
						{ "jim", "123456", "Jim01"},
						{ "sally", "123456", "sally01"},
						{ "gordon", "123456", "gordon01"},
						{ "harry", "123456", "harry01"},
						{ "john", "123456", "john01"},
				};

	}
	
	@Test(dataProvider = "users")
	public void testLogin(String uname , String pword , String AccName) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(7000);
		
		
		WebElement accounts = driver.findElement(By.linkText("Accounts"));
		Actions a = new Actions(driver);
		a.moveToElement(accounts).build().perform();
		WebElement createAccount = driver.findElement(By.partialLinkText("Create Accou"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(createAccount));
		createAccount.click();
		Thread.sleep(2000);
		WebElement enterName = driver.findElement(By.xpath("//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-invalid']"));
		enterName.sendKeys(AccName);
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'"+AccName+"')]"));
		String createdUser = user.getText();
		user.click();
		WebElement accName = driver.findElement(By.xpath("//div[@class='tab-lbl_account_information ng-star-inserted']//div[1]//div[1]//div[2]//div[1]"));
		String accountName = accName.getText();
		Assert.assertEquals(createdUser, accountName);
		WebElement userDropDown = driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link primary-global-link ng-tns-c302-1']"));
		userDropDown.click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}

}
