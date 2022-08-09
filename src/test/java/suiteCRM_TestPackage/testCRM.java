package suiteCRM_TestPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import suiteCRM_BasePackage.baseCRM;

public class testCRM extends baseCRM {
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = SetProperty();	
		driver.get("https://suitecrm.theautomationtechies.com/public/index.php#/Login");
	}
	
	@Test(priority=1,groups="login")
	public void testLoginForManpreet() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("manpreet_gill");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(7000);
		WebElement accounts = driver.findElement(By.linkText("Accounts"));
		System.out.println(accounts);
		Actions a = new Actions(driver);
		a.moveToElement(accounts).build().perform();
		WebElement createAccount = driver.findElement(By.partialLinkText("Create Accou"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(createAccount));
		createAccount.click();
		Thread.sleep(2000);
		WebElement enterName = driver.findElement(By.xpath("//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-invalid']"));
		enterName.sendKeys("gill");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		driver.navigate().to("https://suitecrm.theautomationtechies.com/public/index.php#/home");
		
		Thread.sleep(3000);
		System.out.println(accounts);
//		accounts = driver.findElement(By.linkText("Accounts"));
		a.moveToElement(accounts).build().perform();
		Thread.sleep(5000);
//		driver.findElement(By.linkText("Accounts")).click();
		
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Accounts")).click();
//		Thread.sleep(2000);
//		WebElement viewAccount = driver.findElement(By.xpath("//a[contains(text(),'View Accounts')]"));
//		viewAccount.click();
//		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'gill')]"));
//		String createdUser = user.getText();
//		user.click();
//		WebElement accName = driver.findElement(By.xpath("//div[@class='tab-lbl_account_information ng-star-inserted']//div[1]//div[1]//div[2]//div[1]"));
//		String accountName = accName.getText();
//		Assert.assertEquals(createdUser, accountName);
//		WebElement userDropDown = driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link primary-global-link ng-tns-c302-1']"));
//		userDropDown.click();
//		Thread.sleep(2000);
//		WebElement logout = driver.findElement(By.linkText("Logout"));
//		logout.click();
	}
	
	@Test(priority=2,groups="login")
	public void testLoginForJim() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("jim");
		driver.findElement(By.name("password")).sendKeys("123456");
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
		enterName.sendKeys("jimmy");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'jimmy')]"));
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
	
	@Test(priority=3,groups="login")
	public void testLoginForSally() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("sally");
		driver.findElement(By.name("password")).sendKeys("123456");
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
		enterName.sendKeys("sally01");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'sally01')]"));
		String createduser = user.getText();
		user.click();
		WebElement accName = driver.findElement(By.xpath("//div[@class='tab-lbl_account_information ng-star-inserted']//div[1]//div[1]//div[2]//div[1]"));
		String accountName = accName.getText();
		Assert.assertEquals(createduser, accountName);
		WebElement userDropDown = driver.findElement(By.xpath("//a[@class='dropdown-toggle nav-link primary-global-link ng-tns-c302-1']"));
		userDropDown.click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
	}
	
	@Test(priority=4,groups="login")
	public void testLoginForGordon() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("gordon");
		driver.findElement(By.name("password")).sendKeys("123456");
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
		enterName.sendKeys("gordon01");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'gordon01')]"));
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
	
	@Test(priority=5,groups="login")
	public void testLoginForJames() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("james");
		driver.findElement(By.name("password")).sendKeys("123456");
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
		enterName.sendKeys("james01");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'james01')]"));
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
	@Test(priority=6,groups="login")
	public void testLoginForHarry() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("harry");
		driver.findElement(By.name("password")).sendKeys("123456");
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
		enterName.sendKeys("harry01");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'harry01')]"));
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
	
	@Test(priority=7,groups="login")
	public void testLoginForJohn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("123456");
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
		enterName.sendKeys("john01");
		WebElement saveButton = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		saveButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='home-nav-link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//scrm-varchar-detail[contains(text(),'john01')]"));
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
