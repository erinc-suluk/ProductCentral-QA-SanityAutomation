package Pages;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;
import com.pwc.productcentral.ReadXLSdata;

public class UMSPage extends HelperFunctions {
	public UMSPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		} 
	
	
	@FindBy(xpath="//input[@id='initEmail']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="(//button[.='Add User'])[1]")
	private WebElement addUser;
	
	@FindBy(xpath="(//button[.='Add User'])[4]")
	private WebElement addUser2;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//ap-button[starts-with(@class,'saveUser')]")
	private WebElement saveButton;
	
	@FindBy(xpath="//ap-button[@class='submitBt isValidClass']")
	private WebElement saveButton2;
	
	@FindBy(xpath="(//div[@class='ap-field-validation ap-field-visible'])[position()=1]")
	private WebElement firstErrorMessage;
	
	@FindBy(xpath="(//div[@class='ap-field-validation ap-field-visible'])[position()=2]")
	private WebElement secondErrorMessage;
	
	@FindBy(xpath="(//div[@class='ap-field-validation ap-field-visible'])[position()=3]")
	private WebElement thirdErrorMessage;
	
	@FindBy(xpath="//mat-select[@name='user_level']")
	private WebElement selectUserLevel;
	
	@FindBy(xpath="//span[.='User']")
	private WebElement userLabel;
	
	@FindBy(xpath="//span[normalize-space()='Admin']")
	private WebElement adminLabel;
	
	@FindBy(xpath="(//div[starts-with(@class,'mat-select-arrow-wrapper')])[2]")
	private WebElement selectProducts;
	
	@FindBy(xpath="//mat-select[@name='product_list1']")
	private WebElement selectProducts2;
	
	@FindBy(xpath="//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted']")
	private static List<WebElement> checkBoxes;
	
	@FindBy(xpath="//label[@class='ap-option-label']")
	private static List<WebElement> checkBoxes2;
	
	@FindBy(xpath="//mat-expansion-panel-header[starts-with(@id, \"mat-expansion-panel-header\")]")
	private WebElement checkProducts;
	
	@FindBy(xpath="(//span[.='Product 2'])[1]")
	private WebElement product2;
	

	
	@FindBy(xpath="/html/body/app-root/app-ums-landing/html/body/div/div[1]/div[2]/mat-accordion/mat-expansion-panel/div/div/table[2]/tr[2]/td[4]/button")
	private WebElement otherProductUsers;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement searchUsers;
	
	@FindBy(xpath="//button[normalize-space()='close']")
	private WebElement closeUsers;
	
	@FindBy(xpath="//div[@class='cdk-virtual-scroll-content-wrapper']//tbody//tr//td")
	private static List<WebElement> allUsers;
	
	@FindBy(xpath="(//table[@class='ng-tns-c58-13'])[2]//td[3]")
	private static List<WebElement> features;
	
	@FindBy(xpath="(//table[@class='ng-tns-c58-13'])[2]//td[2]")
	private static List<WebElement> products;
	
	@FindBy(xpath="((//table[starts-with(@class, \"ng-tns\")])[9])//tr")
	private static List<WebElement> productsRows;
	
	@FindBy(xpath="/html/body/app-root/app-ums-landing/html/body/div/div[1]/div[2]/mat-accordion/mat-expansion-panel/div/div/table[2]/tr[1]/td[4]/button")
	private WebElement product10users;
	
	@FindBy(xpath="(//ap-button[@class='apButton apButtonProductUser click1'])[2]")
	private WebElement product10users2;
	
	@FindBy(xpath="//span[.='Product 10']")
	private WebElement product10Title;
	
	@FindBy(xpath="//td[@class='emailAdd']")
	private WebElement emailForVerification;
	
	@FindBy(xpath="//div[@class='table ap-table-div']")
	private WebElement resultTable;
	
	@FindBy(xpath="//ap-button[@class='apButton apButtonProductUser click1'][1]")
	private WebElement product2users;
	
	@FindBy(xpath="//span[starts-with(@class, \"mat-expansion-indicator\")]")
	private WebElement checkProducts2;
	
	@FindBy(xpath="//div[starts-with(@class,'mat-select-panel')]")
	private WebElement selectProducts3;
	
	@FindBy(xpath="//ap-button[@class='click1 cancelBt']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//div[@class='ap-field-validation ap-field-visible']")
	private WebElement emailError;
	
	@FindBy(xpath="(//span[contains(@class, 'mat-content')]//table//tr//td[5]//button)[1]")
	private WebElement firstCompanyUsers;
	
	@FindBy(xpath="//td[@class='userName']")
	private WebElement resultUsername;
	
	@FindBy(xpath="//ap-button[@class='Appkit4-icon icon-close-fill apButtonDelete click1 companyLockedFalse']//button[@type='submit']")
	private WebElement closeIconforDeleteUsers;
	
	@FindBy(xpath="//ap-button[@class='submitBt']")
	private WebElement deleteUser;
	
	@FindBy(xpath="//div[@class='mat-dialog-title']")
	private WebElement dialogTitle;
	
	@FindBy(xpath="//div[@class='mat-dialog-title-info-new align-middle']")
	private WebElement companyUserNumber;
	
	@FindBy(xpath="//div[@class='umsText']")
	private WebElement UMSTitle;
	
	@FindBy(xpath="//ap-button[@class='click1 cancelBt']")
	private WebElement cancelButtonAddUser;
	
	@FindBy(xpath="//div[@class='warnMsg ng-star-inserted']")
	private WebElement warnMessage;
	
	@FindBy(xpath="//ap-button[@class='submitBt isValidClass']")
	private WebElement activateSaveButton;
	
	@FindBy(xpath="//input[@role='searchbox']")
	private WebElement searchCompany;
	
	@FindBy(xpath="//ap-button[@class='searchBt']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[normalize-space()='Company Automation']")
	private WebElement companyAutomation;
	
	@FindBy(xpath="//span[normalize-space()='Edit Company']")
	private WebElement editCompany;
	
	@FindBy(xpath="//input[@name='SC_Account_ID']")
	private WebElement SCaccount;
	
	@FindBy(xpath="//input[@name='SC_Product_ID']")
	private WebElement SCproduct;
	
	@FindBy(xpath="//ap-button[@class='saveBt']")
	private WebElement saveCompany;
	
	@FindBy(xpath="//span[normalize-space()='Company was updated.']")
	private WebElement updateCompanyMessage;
	
	@FindBy(xpath="//div[contains(text(),'Products')]")
	private WebElement productsTab;
	
	@FindBy(xpath="//div[normalize-space()='automation product1']")
	private WebElement productAutomation;
	
	@FindBy(xpath="//span[normalize-space()='Edit Product']//span[@class='mat-button-wrapper']")
	private WebElement editProduct;
	
	@FindBy(xpath="//span[normalize-space()='Product was updated.']")
	private WebElement updateProductMessage;
	
	@FindBy(xpath="//div[normalize-space()='automation2']")
	private WebElement automation2;
	
	@FindBy(xpath="//span[normalize-space()='Add Feature to Product']")
	private WebElement addFeatureButton;
	
	@FindBy(xpath="//ap-button[@class='submitBt']")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[normalize-space()='[Feature Name] is required']")
	private WebElement featureError;
	
	@FindBy(xpath="(//span[normalize-space()='Edit'])[1]")
	private WebElement editFeature;
	
	@FindBy(xpath="//input[@name='FeatureName']")
	private WebElement featureName;
	
	@FindBy(xpath="//span[normalize-space()='Feature was modified.']")
	private WebElement updateFeatureMessage;
	
	@FindBy(xpath="(//mat-expansion-panel-header[@role='button'])[1]")
	private WebElement firstResult;
	
	@FindBy(xpath="//ap-button[@class='clearBt']")
	private WebElement clearButton;
	
	@FindBy(xpath="(//mat-select[@role='combobox'])[1]")
	private WebElement selectProductdropdown;
	
	@FindBy(xpath="//div[contains(@id, 'mat-select-0-panel')]")
	private WebElement productsPanel;
	
	@FindBy(xpath="//span[normalize-space()='automation product1']")
	private WebElement selectAutomationProduct;
	
	@FindBy(xpath="//span[normalize-space()='automation2']")
	private WebElement selectAutomationProduct2;
	
	@FindBy(xpath="//span[normalize-space()='Download Company Report']")
	private WebElement downloadLink;
	
	@FindBy(xpath="//span[normalize-space()='+ Add New Company']")
	private WebElement addNewCompanyButton;
	
	@FindBy(xpath="//ap-button[@class='cancelSaveBt']")
	private WebElement cancelButton2;
	
	@FindBy(xpath="//span[contains(@class, 'locked')]")
	private WebElement lockedSymbol;
	
	@FindBy(xpath="(//span[contains(@class, 'mat-content')]//table//tr//td[5]//button)[2]")
	private WebElement lockedCompanyUsers;
	
	@FindBy(xpath="//ap-button[contains(@class, 'Edit')]//button")
	private WebElement editLocked;
	
	@FindBy(xpath="//ap-button[contains(@class, 'LockedTrue')]//button")
	private WebElement addUserLocked;
	
	@FindBy(xpath="//span[contains(@class, 'mat-select-value')]//span")
	private static List<WebElement> superDropdowns;
	
	@FindBy(xpath="//span[normalize-space()='automation2']")
	private WebElement selectAutomation2;
	
	@FindBy(xpath="//div[contains(text(),'erinc.suluk@net-effect.com')]")
	private WebElement warning;
	
	@FindBy(xpath="//span[normalize-space()='User added']")
	private WebElement userAdded;
	
	@FindBy(xpath="//ap-button[@class='addCompanyBt']")
	private WebElement addProductButton;
	
	@FindBy(xpath="//mat-select[contains(@id, 'mat-select')]//div[contains(@class, 'mat-select-arrow-wrapper')]")
	private WebElement MIMdropdown;
	
	@FindBy(xpath="(//span[normalize-space()='Yes'])[1]")
	private WebElement defaultYes;
	
	@FindBy(xpath="(//span[normalize-space()='No'])[1]")
	private WebElement noOption;
	
	@FindBy(xpath="//input[@name='productName']")
	private WebElement productNameField;
	
	@FindBy(xpath="//input[@name='productCode']")
	private WebElement productCodeField;
	
	@FindBy(xpath="//div[contains(@class, 'error_message')]")
	private WebElement scProductError;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	private WebElement startDate;
	
	@FindBy(xpath="//input[@id='mat-input-3']")
	private WebElement endDate;
	
	static Logger logger=Logger.getLogger("UMSPage");
	
	
	ReadXLSdata read1=new ReadXLSdata();
	
	public void setErrorMessages() throws Exception {
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
	//	pass.sendKeys(read1.getCellData("VALUE", 1));
	//	submit.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		addUser.click();
		HelperFunctions.staticWait(3);
		//if(emailAddress.getText().trim().isEmpty()&&firstName.getText().trim().isEmpty()&&lastName.getText().trim().isEmpty()) {
		//	boolean a=saveButton.getAttribute("aria-disabled").equals("true");
		//	Assert.assertTrue(a);
		//}
		HelperFunctions.staticWait(3);
		emailAddress.click();
		Faker faker = new Faker();
		emailAddress.sendKeys(faker.internet().emailAddress());
		HelperFunctions.staticWait(3);
		//JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
       // executor.executeScript("arguments[0].click();", saveButton2);
        saveButton2.click();
		String errorMessage1="First name is required";
		String errorMessage2="Last name is required";
		String errorMessage3="User level selection is required";
		//Assert.assertEquals(firstErrorMessage.getText(), errorMessage1);
		if (!firstErrorMessage.getText().equals(errorMessage1)) {
	           String errorMessage = "Error message does not appear";
	             logger.error(errorMessage);
	             throw new Exception(errorMessage);
	       }else {
	           String successMessage = "Error message appears";
	             logger.info(successMessage);
	       } 
		//Assert.assertEquals(secondErrorMessage.getText(), errorMessage2);
		if (!secondErrorMessage.getText().equals(errorMessage2)) {
	           String errorMessage = "Error message does not appear";
	             logger.error(errorMessage);
	             throw new Exception(errorMessage);
	       }else {
	           String successMessage = "Error message appears";
	             logger.info(successMessage);
	       } 
		//Assert.assertEquals(thirdErrorMessage.getText(), errorMessage3);
		if (!thirdErrorMessage.getText().equals(errorMessage3)) {
	           String errorMessage = "Error message does not appear";
	             logger.error(errorMessage);
	             throw new Exception(errorMessage);
	       }else {
	           String successMessage = "Error message appears";
	             logger.info(successMessage);
	       } 
		
		
		
		
		
	}
	public void setAssigningMultipleProducts(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
	//	pass.sendKeys(read1.getCellData("VALUE", 1));
	//	submit.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		test.info("Click on add user");
		addUser.click();
		HelperFunctions.staticWait(3);
		test.info("Click on email address and send email");
		emailAddress.click();
		Faker faker = new Faker();
		emailAddress.sendKeys(faker.internet().emailAddress());
		//emailAddress.sendKeys(read1.getCellData("VALUE", 24));
		test.info("Click on first name and send name");
		firstName.click();
		HelperFunctions.staticWait(2);
		firstName.sendKeys(faker.name().firstName());
		HelperFunctions.staticWait(2);
		test.info("Click on last name and send name");
		lastName.click();
		HelperFunctions.staticWait(2);
		lastName.sendKeys(faker.name().lastName());
		HelperFunctions.staticWait(2);
		test.info("Click on select user dropdown and select user label");
		selectUserLevel.click();
		HelperFunctions.staticWait(2);
		userLabel.click();
		HelperFunctions.staticWait(3);
		test.info("Click on select product dropdown");
		selectProducts.click();
		HelperFunctions.staticWait(3);
		test.info("Click on first checkbox");
		checkBoxes.get(0).click();
		HelperFunctions.staticWait(2);
		test.info("Click on second checkbox");
		//checkBoxes.get(1).click();
		//HelperFunctions.staticWait(2);
		/*for(WebElement each:checkBoxes) {
			each.click();	
			break;
		}*/
		//for(WebElement each:checkBoxes) {
		//Assert.assertTrue(each.isSelected());
		//}
		/*HelperFunctions.staticWait(2);
		Actions actions=new Actions(Driver.getDriver());
		actions.moveToElement(selectUserLevel).click().perform();
		//selectProducts.click();
		//selectUserLevel.click();
		//JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
       //  executor.executeScript("arguments[0].click();", selectUserLevel);
       //  HelperFunctions.staticWait(2);
       //  selectProducts.click();
        // JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
       //  executor2.executeScript("arguments[0].click();", selectProducts);
		//selectProducts3.click();
		//HelperFunctions.staticWait(3);
		saveButton2.click();
        //JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        //   executor.executeScript("arguments[0].click();", saveButton);
		//saveButton.click();
		String actualUrl=Driver.getDriver().getCurrentUrl();
		System.out.println(Driver.getDriver().getCurrentUrl());
		String expectedUrl="https://ums-productcentral-qa.pwc.com/home";
		Assert.assertEquals(actualUrl,expectedUrl);*/
		
		
		
		
		
		
	}
	
	public void setAdminForMultipleCompanies() throws Exception {
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
	//	pass.sendKeys(read1.getCellData("VALUE", 1));
	//	submit.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		addUser.click();
		HelperFunctions.staticWait(3);
		emailAddress.click();
		HelperFunctions.staticWait(3);
		emailAddress.sendKeys(read1.getCellData("VALUE", 24));
		HelperFunctions.staticWait(3);
		firstName.click();
		HelperFunctions.staticWait(3);
		firstName.clear();
		firstName.sendKeys(read1.getCellData("VALUE", 25));
		HelperFunctions.staticWait(3);
		lastName.click();
		HelperFunctions.staticWait(3);
		lastName.clear();
		HelperFunctions.staticWait(3);
		lastName.sendKeys(read1.getCellData("VALUE", 26));
		HelperFunctions.staticWait(3);
		selectUserLevel.click();
		HelperFunctions.staticWait(3);
		//adminLabel.click();
		//HelperFunctions.staticWait(3);
		/*selectProducts.click();
		HelperFunctions.staticWait(3);
		for(WebElement each:checkBoxes) {
			each.click();	
			break;
		}
		HelperFunctions.staticWait(3);
		selectProducts.click();
		HelperFunctions.staticWait(3);*/
		//saveButton2.click();
		// JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        // executor.executeScript("arguments[0].click();", saveButton);
		//saveButton.click();
		//String actualUrl=Driver.getDriver().getCurrentUrl();
		//System.out.println(Driver.getDriver().getCurrentUrl());
		//String expectedUrl="https://ums-productcentral-qa.pwc.com/home";
		//Assert.assertEquals(actualUrl,expectedUrl);
		/*HelperFunctions.staticWait(3);
		addUser.click();
		HelperFunctions.staticWait(3);
		emailAddress.click();
		HelperFunctions.staticWait(3);
		emailAddress.sendKeys(read1.getCellData("VALUE", 24));
		HelperFunctions.staticWait(3);
		firstName.click();
		HelperFunctions.staticWait(3);
		firstName.clear();
		firstName.sendKeys(read1.getCellData("VALUE", 25));
		HelperFunctions.staticWait(3);
		lastName.click();
		HelperFunctions.staticWait(3);
		lastName.clear();
		HelperFunctions.staticWait(3);
		lastName.sendKeys(read1.getCellData("VALUE", 26));
		HelperFunctions.staticWait(3);
		selectUserLevel.click();
		HelperFunctions.staticWait(3);
		userLabel.click();
		HelperFunctions.staticWait(3);
		selectProducts.click();
		for(WebElement each:checkBoxes) {
			each.click();	
			break;
		}
		selectProducts.click();
		HelperFunctions.staticWait(3);
		saveButton.click();
		Assert.assertEquals(actualUrl,expectedUrl);
		
		HelperFunctions.staticWait(3);
		 JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
        executor3.executeScript("arguments[0].click();", saveButton);*/
         HelperFunctions.staticWait(3);
         String email="123@gmail.com";
 		checkProducts.click();
 		HelperFunctions.staticWait(3);
 		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
 	    js.executeScript("arguments[0].scrollIntoView(true);", product10Title);
 	    HelperFunctions.staticWait(3);
 	    product10users.click();
 	    HelperFunctions.staticWait(3);
 	    searchUsers.click();
 	    searchUsers.sendKeys(email);
 	    HelperFunctions.staticWait(3);
 	    String actualUser=emailForVerification.getText();
 	   // Assert.assertEquals(actualUser, email);
 	   if (!actualUser.equals(email)) {
           String errorMessage = "Email verification failed";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
       }else {
           String successMessage = "Email verification is successful";
             logger.info(successMessage);
       } 
 	    HelperFunctions.staticWait(3);
 	    closeUsers.click();
 	    HelperFunctions.staticWait(3);
 		checkProducts.click();
 		HelperFunctions.staticWait(3);
 		JavascriptExecutor js2 = ((JavascriptExecutor) Driver.getDriver());
 	    js2.executeScript("arguments[0].scrollIntoView(true);", otherProductUsers);
 	    HelperFunctions.staticWait(3);
 	    otherProductUsers.click();
 	    HelperFunctions.staticWait(3);
 	    searchUsers.click();
 	    searchUsers.sendKeys(email);
 	    HelperFunctions.staticWait(3);
 	   String actualUser2=emailForVerification.getText();
	  //  Assert.assertEquals(actualUser2, email);
	    if (!actualUser2.equals(email)) {
	           String errorMessage = "Email verification failed";
	             logger.error(errorMessage);
	             throw new Exception(errorMessage);
	       }else {
	           String successMessage = "Email verification is successful";
	             logger.info(successMessage);
	       } 
	    HelperFunctions.staticWait(3);
	    closeUsers.click();
		
		
	}
	
	
	
	
	
	public void setAdminRights(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
	//	pass.sendKeys(read1.getCellData("VALUE", 1));
	//	submit.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		test.info("Click on add user");
		addUser.click();
		HelperFunctions.staticWait(3);
		test.info("Click on email field");
		emailAddress.click();
		Faker faker = new Faker();
		test.info("Send email on email field");
		emailAddress.sendKeys(faker.internet().emailAddress());
		//emailAddress.sendKeys(read1.getCellData("VALUE", 24));
		test.info("Click on first name field and send name");
		HelperFunctions.staticWait(2);
		firstName.click();
		HelperFunctions.staticWait(2);
		firstName.sendKeys(faker.name().firstName());
		test.info("Click on last name field and send name");
		HelperFunctions.staticWait(2);
		lastName.click();
		HelperFunctions.staticWait(2);
		lastName.sendKeys(faker.name().lastName());
		test.info("Click on select user dropdown");
		HelperFunctions.staticWait(2);
		selectUserLevel.click();
		test.info("Click on admin label");
		HelperFunctions.staticWait(2);
		adminLabel.click();
		HelperFunctions.staticWait(3);
		boolean a=selectProducts2.getAttribute("aria-disabled").equals("true");
		Assert.assertTrue(a);
		test.info("Verified select product dropdown is disabled");
		HelperFunctions.staticWait(3);
		
		
		
		
		
		
	}
	public void setDisplayingContentBasedOnLicence() throws Exception {
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
	//	pass.sendKeys(read1.getCellData("VALUE", 1));
	//	submit.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		addUser.click();
		HelperFunctions.staticWait(3);
		String email="admin@gmail.com";
		emailAddress.click();
		emailAddress.sendKeys(email);
		firstName.click();
		firstName.sendKeys("adminadmin");
		lastName.click();
		HelperFunctions.staticWait(3);
		lastName.clear();
		lastName.sendKeys("company");
		selectUserLevel.click();
		userLabel.click();
		HelperFunctions.staticWait(3);
		selectProducts.click();
		HelperFunctions.staticWait(3);
		for(int i=0;i<checkBoxes2.size();i++) {
			if(checkBoxes2.get(i).getText().equalsIgnoreCase("Product 2")) {
				checkBoxes2.get(i).click();
			}
		}
		HelperFunctions.staticWait(2);
		selectProducts.click();
		HelperFunctions.staticWait(2);
		// JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
	    //    executor3.executeScript("arguments[0].click();", saveButton2);
		saveButton2.click();
	
		HelperFunctions.staticWait(2);
		checkProducts2.click();
		HelperFunctions.staticWait(3);
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
	    js.executeScript("arguments[0].scrollIntoView(true);", product2users);
	    HelperFunctions.staticWait(3);
	    product2users.click();
	    HelperFunctions.staticWait(3);
	    searchUsers.click();
	    searchUsers.sendKeys(email);
	    HelperFunctions.staticWait(3);
	    String actualUser=emailForVerification.getText();
	  //  Assert.assertEquals(actualUser, email);
	    if (!actualUser.equals(email)) {
	           String errorMessage = "Email verification failed";
	             logger.error(errorMessage);
	             throw new Exception(errorMessage);
	       }else {
	           String successMessage = "Email verification is successful";
	             logger.info(successMessage);
	       } 
	    HelperFunctions.staticWait(3);
	    closeUsers.click();
	   // HelperFunctions.staticWait(3);
		//checkProducts2.click();
		//HelperFunctions.staticWait(3);
		//JavascriptExecutor js2 = ((JavascriptExecutor) Driver.getDriver());
	   // js2.executeScript("arguments[0].scrollIntoView(true);", product10users2);
	    HelperFunctions.staticWait(3);
	    product10users2.click();
	    HelperFunctions.staticWait(3);
	    searchUsers.click();
	    searchUsers.sendKeys(email);
	    HelperFunctions.staticWait(3);
	    Assert.assertFalse(resultTable.getText().equalsIgnoreCase(email));
	    HelperFunctions.staticWait(3);
		
			
	}
	public void setFaviconItem() throws Exception {
       /* read1.setExcelFile("./testdata.xlsx", "QA");
        email.sendKeys(read1.getCellData("DATA", 1));
        next.click();
        pass.sendKeys(read1.getCellData("VALUE", 1));
        submit.click();*/
        read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
        HelperFunctions.waitForPageToLoad(5);
        
        WebElement favicon = Driver.getDriver().findElement(By.cssSelector("link[rel='shortcut icon'], link[rel='icon']"));

        if (favicon != null) {
            System.out.println("Favicon is present on the page");
        } else {
            System.out.println("Favicon is not present on the page");
        }
        HelperFunctions.staticWait(3);
        
        
        
        
        
        
    }
	public void setMandatoryFieldError(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(2);
		test.info("Click on add user");
		addUser.click();
		HelperFunctions.staticWait(3);
		/*if(emailAddress.getText().trim().isEmpty()&&firstName.getText().trim().isEmpty()&&lastName.getText().trim().isEmpty()) {
			boolean a=saveButton.getAttribute("aria-disabled").equals("true");
			Assert.assertTrue(a);
		}*/
		HelperFunctions.staticWait(2);
		test.info("Click on email field");
		emailAddress.click();
		test.info("Send email to email field");
		HelperFunctions.staticWait(2);
		Faker faker = new Faker();
		emailAddress.sendKeys(faker.internet().emailAddress());
		HelperFunctions.staticWait(3);
		test.info("Click on save button");
		saveButton2.click();
		HelperFunctions.staticWait(2);
		String errorMessage1="First name is required";
		String errorMessage2="Last name is required";
		String errorMessage3="User level selection is required";
		Assert.assertEquals(firstErrorMessage.getText(), errorMessage1);
		Assert.assertEquals(secondErrorMessage.getText(), errorMessage2);
		Assert.assertEquals(thirdErrorMessage.getText(), errorMessage3);
		test.info("Verified error messages");
		test.info("Click on first name field");
		firstName.click();
		HelperFunctions.staticWait(2);
		test.info("Send text on first name field");
		firstName.sendKeys("abc");
		HelperFunctions.staticWait(2);
		test.info("Click on last name field");
		lastName.click();
		HelperFunctions.staticWait(2);
		test.info("Send text on last name field");
		lastName.sendKeys("def");
		HelperFunctions.staticWait(2);
		test.info("Click on select user dropdown");
		selectUserLevel.click();
		HelperFunctions.staticWait(2);
		test.info("Click on user ");
		userLabel.click();
		HelperFunctions.staticWait(2);
		test.info("Click on save button");
		saveButton2.click();
		HelperFunctions.staticWait(2);
		String errorMessageforemail="Please enter a valid email address";
		String errorMessageforproductSelect="Product selection is required";
		Assert.assertEquals(emailError.getText(), errorMessageforproductSelect);
		test.info("Verified error messages");
		test.info("Click on email field");
		emailAddress.click();
		HelperFunctions.staticWait(2);
		test.info("Clear email field");
		emailAddress.clear();
		HelperFunctions.staticWait(2);
		test.info("Send random text to email field");
		emailAddress.sendKeys("abcdef");
		HelperFunctions.staticWait(2);
		Assert.assertEquals(emailError.getText(), errorMessageforemail);
		test.info("Verified error messages");
		HelperFunctions.staticWait(3);
	}
	public void setUsernameEmailVisibility(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(2);
		test.info("Click on add user");
		addUser.click();
		HelperFunctions.staticWait(3);
		Faker faker=new Faker();
		//String mockEmail="te123s987ttest1234@gmail.com";
		test.info("Click on email field");
		emailAddress.click();
		test.info("Send email to email field");
		String mockEmail=faker.internet().emailAddress();
		emailAddress.sendKeys(mockEmail);
		HelperFunctions.staticWait(1);
		test.info("Click on first name field");
		firstName.click();
		HelperFunctions.staticWait(1);
		test.info("Clear on first name field");
		firstName.clear();
		HelperFunctions.staticWait(1);
		test.info("Send text to first name field");
		firstName.sendKeys("test");
		HelperFunctions.staticWait(1);
		test.info("Click on last name field");
		lastName.click();
		HelperFunctions.staticWait(1);
		test.info("Clear on last name field");
		lastName.clear();
		HelperFunctions.staticWait(1);
		test.info("Send text to last name field");
		lastName.sendKeys("test");
		HelperFunctions.staticWait(1);
		test.info("Click on select user dropdown");
		selectUserLevel.click();
		HelperFunctions.staticWait(1);
		test.info("Click on user ");
		userLabel.click();
		HelperFunctions.staticWait(3);
		test.info("Click on select product dropdown");
		selectProducts.click();
		HelperFunctions.staticWait(3);
		test.info("Click on product checkbox");
		checkBoxes.get(0).click();
		HelperFunctions.staticWait(3);
		Actions actions=new Actions(Driver.getDriver());
		actions.moveToElement(selectUserLevel).click().perform();
		//selectProducts.click();
		HelperFunctions.staticWait(1);
		test.info("Click on save button");
		saveButton2.click();
       // JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
         //  executor.executeScript("arguments[0].click();", saveButton);
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
	    wait1.until(ExpectedConditions.visibilityOf(userAdded));
           HelperFunctions.staticWait(5);
         //  JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
         //  executor2.executeScript("arguments[0].click();", firstCompanyUsers);
       	test.info("Click on first company users");
      /*  WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        try {
      		wait.until(ExpectedConditions.elementToBeClickable( firstCompanyUsers));
      		actions.moveToElement(firstCompanyUsers, 5,5).click().perform();
        }catch(ElementClickInterceptedException e) {
        	e.printStackTrace();
        }*/
         firstCompanyUsers.click();
   		//HelperFunctions.staticWait(3);
   		test.info("Click on search field");
   	  WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchUsers));
   	    searchUsers.click();
   	    HelperFunctions.staticWait(2);
   		test.info("Send user's email");
	    searchUsers.sendKeys(mockEmail);
	    HelperFunctions.staticWait(2);
	    String user=emailForVerification.getText();
	    Assert.assertEquals(user, mockEmail);
	    Assert.assertTrue(resultUsername.isDisplayed());
		test.info("Verified user has been added");
		test.info("Delete user");
           closeIconforDeleteUsers.click();
           WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
   	    wait3.until(ExpectedConditions.visibilityOf(deleteUser));
   	    if(deleteUser.isDisplayed()) {
   	    	 deleteUser.click();
   	    }
   	    HelperFunctions.staticWait(3);
   	   
	}
	public void setDialogTitle(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(2);
		test.info("Click on first company users");
		firstCompanyUsers.click();
		HelperFunctions.staticWait(2);
		String titleText = dialogTitle.getText();
		if (titleText.length() > 0) {
		    String[] titleParts = titleText.split(" ");
		    if (titleParts.length > 2 && titleParts[2].equals("user") && titleParts[3].equals("list")) {
		    	Assert.assertTrue(true);
		        System.out.println("Title is correct.");
		    } else {
		        System.out.println("Title is incorrect.");
		    }
		} else {
		    System.out.println("Title is incorrect.");
		}
		test.info("Verified dialog title contains user list");
		HelperFunctions.staticWait(2);
	}
	public void setVerifyCompanyTitle(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(2);
		test.info("Click on first company users");
           JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
           executor2.executeScript("arguments[0].click();", firstCompanyUsers);
   		HelperFunctions.staticWait(2);
   		Assert.assertTrue(companyUserNumber.isDisplayed());
   		test.info("Verified dialog title contains user number");
   		HelperFunctions.staticWait(3);
	}
	public void setCancelAddUser(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(2);
		test.info("Click on add user");
        addUser.click();
        HelperFunctions.staticWait(2);
        test.info("Click on cancel button");
        cancelButtonAddUser.click();
        HelperFunctions.staticWait(3);
        Assert.assertTrue(UMSTitle.isDisplayed());
        test.info("Verified UMS title");
        HelperFunctions.staticWait(2);
     
	}
	public void setCancelAddUser2(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(2);
		test.info("Click on add user");
        addUser.click();
        HelperFunctions.staticWait(2);
        test.info("Click on cancel button");
        cancelButtonAddUser.click();
        HelperFunctions.staticWait(3);
        Assert.assertTrue(UMSTitle.isDisplayed());
        test.info("Verified UMS title");
        HelperFunctions.staticWait(2);
     
	}
	public void setSaveButton(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(2);
		test.info("Click on add user");
		addUser.click();
		//HelperFunctions.staticWait(3);
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
		wait2.until(ExpectedConditions.visibilityOf(emailAddress));
		String mockEmail="te321st1234@gmail.com";
		test.info("Click on email field");
		emailAddress.click();
		HelperFunctions.staticWait(2);
		test.info("Send email to email field");
		emailAddress.sendKeys(mockEmail);
		HelperFunctions.staticWait(2);
		test.info("Click on first name field");
		firstName.click();
		HelperFunctions.staticWait(2);
		test.info("Clear first name");
		firstName.clear();
		HelperFunctions.staticWait(2);
		test.info("Send name to first name");
		firstName.sendKeys("test");
		HelperFunctions.staticWait(2);
		test.info("Click on first name field");
		lastName.click();
		HelperFunctions.staticWait(2);
		test.info("Clear last name");
		lastName.clear();
		HelperFunctions.staticWait(2);
		test.info("Send name to last name");
		lastName.sendKeys("test");
		HelperFunctions.staticWait(2);
		test.info("Click on select user dropdown");
		selectUserLevel.click();
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(userLabel));
		//HelperFunctions.staticWait(2);
		test.info("Click on user");
		userLabel.click();
		HelperFunctions.staticWait(3);
		test.info("Click on select product dropdown");
		selectProducts.click();
		//HelperFunctions.staticWait(3);
		WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		wait4.until(ExpectedConditions.visibilityOf(checkBoxes.get(0)));
		test.info("Click on product checkbox");
		checkBoxes.get(0).click();
		HelperFunctions.staticWait(2);
		Actions actions=new Actions(Driver.getDriver());
		actions.moveToElement(selectUserLevel).click().perform();
		//selectProducts.click();
		HelperFunctions.staticWait(1);
		test.info("Click on save button");
		saveButton2.click();
       // JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
         //  executor.executeScript("arguments[0].click();", saveButton);
           HelperFunctions.staticWait(5);
         //  JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
         //  executor2.executeScript("arguments[0].click();", firstCompanyUsers);
           test.info("Click on first company users");
           firstCompanyUsers.click();
           WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
   		wait5.until(ExpectedConditions.visibilityOf(searchUsers));
   		test.info("Click on search field");
   	    searchUsers.click();
   	    HelperFunctions.staticWait(2);
   	 test.info("Send email partially");
	    searchUsers.sendKeys("te321st1234@");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
		wait6.until(ExpectedConditions.visibilityOf(emailForVerification));
	   // HelperFunctions.staticWait(1);
	    String user=emailForVerification.getText();
	    Assert.assertEquals(user, mockEmail);
	    test.info("Verified email exists");
	    Assert.assertTrue(resultUsername.isDisplayed());
	    test.info("Click on sdelete user");
           closeIconforDeleteUsers.click();
   	    HelperFunctions.staticWait(1);
   	    if(deleteUser.isDisplayed()) {
   	    	 deleteUser.click();
   	    }
   	    HelperFunctions.staticWait(2);
   	   
	}
	public void setUserNeedsSelectProduct(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		test.info("Click on add user");
		addUser.click();
		HelperFunctions.staticWait(3);
		Faker faker=new Faker();
		test.info("Click on email field");
		emailAddress.click();
		HelperFunctions.staticWait(2);
		test.info("Send email to email field");
		emailAddress.sendKeys(faker.internet().emailAddress());
		test.info("Click on first name field");
		firstName.click();
		HelperFunctions.staticWait(2);
		test.info("Send name to first name");
		firstName.sendKeys(faker.name().firstName());
		HelperFunctions.staticWait(2);
		test.info("Click on last name field");
		lastName.click();
		HelperFunctions.staticWait(2);
		test.info("Send name to last name");
		lastName.sendKeys(faker.name().lastName());
		HelperFunctions.staticWait(2);
		test.info("Click on select user dropdown");
		selectUserLevel.click();
		HelperFunctions.staticWait(2);
		test.info("Click on user");
		userLabel.click();
		HelperFunctions.staticWait(2);
		test.info("Click on save button");
		saveButton2.click();
		// JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        // executor.executeScript("arguments[0].click();", saveButton);
         HelperFunctions.staticWait(3);
         String expectedErrorMessage="Product selection is required";
         if(emailError.isDisplayed()&&emailError.getText().contains(expectedErrorMessage)) {
        	 Assert.assertTrue(true);
         }else {
        	 String errorMessage = "User does not see error message for select product section";
 	        logger.error(errorMessage);
 	        throw new Exception(errorMessage);
         }
         test.info("Verified error message 'Product selection is required'");
         HelperFunctions.staticWait(2);
	}
	public void setUserAlreadyExist(ExtentTest test) throws Exception {
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(2);
		addUser.click();
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
		wait2.until(ExpectedConditions.visibilityOf(emailAddress));
		String email="erinc.suluk@net-effect.com";
		emailAddress.click();
		HelperFunctions.staticWait(2);
		emailAddress.sendKeys(email);
		HelperFunctions.staticWait(3);
		firstName.click();
		HelperFunctions.staticWait(1);
		firstName.clear();
		HelperFunctions.staticWait(1);
		firstName.sendKeys("er");
		HelperFunctions.staticWait(1);
		lastName.click();
		HelperFunctions.staticWait(1);
		lastName.clear();
		HelperFunctions.staticWait(1);
		lastName.sendKeys("su");
		HelperFunctions.staticWait(1);
		selectUserLevel.click();
		HelperFunctions.staticWait(3);
		adminLabel.click();
		HelperFunctions.staticWait(2);
		saveButton2.click();
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(warning));
	    Assert.assertTrue(warning.isDisplayed());
	    //Assert.assertTrue(saveButton.isEnabled());
	    HelperFunctions.staticWait(2);
		
	}
	public void setSaveButtonActivation(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		test.info("Click on add user");
		addUser.click();
		HelperFunctions.staticWait(3);
		String mockEmail1="abcd@hotmail.com";
		String mockEmail2="abcd@gft.com";
		String mockEmail3="abcd@gmail.com";
		test.info("Click on email field");
		emailAddress.click();
		HelperFunctions.staticWait(2);
		test.info("Send email to email field");
		emailAddress.sendKeys(mockEmail1);
		HelperFunctions.staticWait(2);
		Assert.assertTrue(activateSaveButton.isDisplayed());
		test.info("Verified save button is active");
		HelperFunctions.staticWait(2);
		test.info("Click on email field");
		emailAddress.click();
		HelperFunctions.staticWait(2);
		emailAddress.clear();
		test.info("Send email to email field");
		emailAddress.sendKeys(mockEmail2);
		HelperFunctions.staticWait(2);
		Assert.assertTrue(activateSaveButton.isDisplayed());
		test.info("Verified save button is active");
		HelperFunctions.staticWait(2);
		test.info("Click on email field");
		emailAddress.click();
		HelperFunctions.staticWait(2);
		emailAddress.clear();
		test.info("Send email to email field");
		emailAddress.sendKeys(mockEmail3);
		HelperFunctions.staticWait(2);
		Assert.assertTrue(activateSaveButton.isDisplayed());
		test.info("Verified save button is active");
		HelperFunctions.staticWait(2);

	}
	public void setSC_AccountID(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
		test.info("Wait for search company visibility");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
		searchCompany.click();
		test.info("Clicked on search company and search company automation");
		String auto="Company Automation";
		searchCompany.sendKeys(auto);
		HelperFunctions.staticWait(2);
		searchButton.click();
		test.info("Wait for company automation visibility");
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
		wait1.until(ExpectedConditions.visibilityOf(companyAutomation));
		companyAutomation.click();
		test.info("Clicked on company automation and wait for edit company button visibility");
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
		wait2.until(ExpectedConditions.visibilityOf(editCompany));
		editCompany.click();
		test.info("Clicked on edit company and wait for SC account visibility");
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(SCaccount));
		SCaccount.click();
		test.info("Clicked on SC Account and send new text");
		HelperFunctions.staticWait(2);
		Faker faker=new Faker();
		String random=faker.lorem().characters(4);
		SCaccount.clear();
		HelperFunctions.staticWait(2);
		SCaccount.sendKeys(random);
		HelperFunctions.staticWait(2);
		saveCompany.click();
		test.info("Clicked on save button");
		WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		wait4.until(ExpectedConditions.visibilityOf(updateCompanyMessage));
		Assert.assertTrue(updateCompanyMessage.isDisplayed());
		test.info("Verified updateCompanyMessage is displayed");
		HelperFunctions.staticWait(3);

	}
	public void setEditProduct(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
	    HelperFunctions.staticWait(3);
		productsTab.click();
		HelperFunctions.staticWait(15);
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
		wait1.until(ExpectedConditions.visibilityOf(searchCompany));
		String auto="automation product1";
		searchCompany.sendKeys(auto);
		HelperFunctions.staticWait(2);
		searchButton.click();
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
		wait2.until(ExpectedConditions.visibilityOf(productAutomation));
		productAutomation.click();
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(editProduct));
		editProduct.click();
		WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		wait4.until(ExpectedConditions.visibilityOf(SCproduct));
		SCproduct.click();
		HelperFunctions.staticWait(2);
		Faker faker=new Faker();
		String random=faker.lorem().characters(4);
		SCproduct.clear();
		HelperFunctions.staticWait(2);
		SCproduct.sendKeys(random);
		HelperFunctions.staticWait(2);
		saveCompany.click();
		WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
		wait5.until(ExpectedConditions.visibilityOf(updateProductMessage));
		Assert.assertTrue(updateProductMessage.isDisplayed());
		HelperFunctions.staticWait(3);

	}
	public void setAddFeature(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
	    HelperFunctions.staticWait(3);
		productsTab.click();
		HelperFunctions.staticWait(15);
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
		wait1.until(ExpectedConditions.visibilityOf(searchCompany));
		String auto="automation2";
		searchCompany.sendKeys(auto);
		HelperFunctions.staticWait(2);
		searchButton.click();
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
		wait2.until(ExpectedConditions.visibilityOf(automation2));
		automation2.click();
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(editFeature));
		editFeature.click();
		WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		wait4.until(ExpectedConditions.visibilityOf(featureName));
		featureName.click();
		HelperFunctions.staticWait(2);
		Faker faker=new Faker();
		String random=faker.lorem().characters(6);
		featureName.clear();
		HelperFunctions.staticWait(2);
		featureName.sendKeys(random);
		HelperFunctions.staticWait(2);
		submitButton.click();
		WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
		wait5.until(ExpectedConditions.visibilityOf(updateFeatureMessage));
		Assert.assertTrue(updateFeatureMessage.isDisplayed());
		HelperFunctions.staticWait(2);
		WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
		wait6.until(ExpectedConditions.visibilityOf(addFeatureButton));
		addFeatureButton.click();
		WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
		wait7.until(ExpectedConditions.visibilityOf(submitButton));
		submitButton.click();
		WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
		wait8.until(ExpectedConditions.visibilityOf(featureError));
		Assert.assertTrue(featureError.isDisplayed());
		HelperFunctions.staticWait(3);

	}
	public void setResetResult(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
		searchCompany.click();
		String auto="Company Automation";
		searchCompany.sendKeys(auto);
		HelperFunctions.staticWait(2);
		searchButton.click();
		String first=firstResult.getAttribute("class");
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
		wait1.until(ExpectedConditions.visibilityOf(companyAutomation));
		Assert.assertTrue(companyAutomation.isDisplayed());
		HelperFunctions.staticWait(2);
		clearButton.click();
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 40);
		wait2.until(ExpectedConditions.visibilityOf(firstResult));
		HelperFunctions.staticWait(3);
		String second=firstResult.getAttribute("class");
		Assert.assertNotEquals(first, second);
		HelperFunctions.staticWait(3);
	}
	public void setSingleSelectProductDropdown(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 40);
	    wait.until(ExpectedConditions.visibilityOf(firstResult));
	    //Actions action=new Actions(Driver.getDriver());
	    //action.doubleClick(selectProductdropdown);
	    selectProductdropdown.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(productsPanel));
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", selectAutomationProduct);
	    HelperFunctions.staticWait(3);
	    selectProductdropdown.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(productsPanel));
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", selectAutomation2);
	    HelperFunctions.staticWait(3);
		
	}
	public void setDownloadCompanyReport(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
		test.info("Wait for search company visibility");
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
	    Assert.assertTrue(downloadLink.isDisplayed());
	    test.info("Verified download link is displayed");
		JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
        executor2.executeScript("arguments[0].click();", downloadLink);
        test.info("Clicked on download link");
		 HelperFunctions.staticWait(20);
		 String directoryPath = "C:\\Users\\GLBL_RDP_USER_02\\Downloads";
		 String expectedFileName = "UMS-CompanyDetails";

		 File directory = new File(directoryPath);
		 File[] files = directory.listFiles();

		 boolean fileExists = false;
		 if (files != null) {
		     for (File file : files) {
		         if (file.getName().startsWith(expectedFileName)) {
		             fileExists = true;
		             break;
		         }
		     }
		 }

		 Assert.assertTrue(fileExists);
	        test.info("Verified user is able to download company report");
	        HelperFunctions.staticWait(3);
		
	}
	public void setAddNewCompany(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
		test.info("Wait for search company visibility");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 40);
	    wait.until(ExpectedConditions.visibilityOf(firstResult));
	    Assert.assertTrue(addNewCompanyButton.isDisplayed());
	    addNewCompanyButton.click();
	    WebDriverWait wait0 = new WebDriverWait(Driver.getDriver(), 10);
	    wait0.until(ExpectedConditions.visibilityOf(SCaccount));
	    Assert.assertTrue(SCaccount.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Verified add new company button is landing on add company page");
	    
	}
	public void setLockedSymbolVisibility(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(lockedSymbol));
	    Assert.assertTrue(lockedSymbol.isDisplayed());
	    HelperFunctions.staticWait(3);
		
	}
	
	public void setLockedSymbolNotEditable(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(lockedSymbol));
	    String expectedValue=addUserLocked.getAttribute("aria-disabled");
	    Assert.assertTrue(expectedValue.contains("true"));
	    HelperFunctions.staticWait(3);
	    lockedCompanyUsers.click();
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(editLocked));
	    String expectedValue2=editLocked.getAttribute("aria-disabled");
	    Assert.assertTrue(expectedValue2.contains("true"));
	    HelperFunctions.staticWait(3);
	}
	public void setAllToggle(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		HelperFunctions.waitForPageToLoad(15);
		test.info("Wait for search company visibility");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(superDropdowns.get(0)));
	    String expected=superDropdowns.get(0).getText();
	    String actual="All";
	    Assert.assertTrue(expected.equalsIgnoreCase(actual));
	    HelperFunctions.staticWait(3);
	}
	public void setDigitalMIM(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
	    HelperFunctions.staticWait(3);
		productsTab.click();
		//HelperFunctions.staticWait(15);
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
		wait1.until(ExpectedConditions.visibilityOf(addProductButton));
		HelperFunctions.staticWait(2);
		addProductButton.click();
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
		wait2.until(ExpectedConditions.visibilityOf(saveCompany));
		HelperFunctions.staticWait(2);
		Assert.assertTrue(defaultYes.isDisplayed());
		HelperFunctions.staticWait(2);
		MIMdropdown.click();
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 15);
		wait3.until(ExpectedConditions.visibilityOf(noOption));
		HelperFunctions.staticWait(2);
		Assert.assertTrue(noOption.isDisplayed());
		HelperFunctions.staticWait(2);
	}
	public void setMandatoryProductSCs(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		read1.setExcelFile("./testdata.xlsx", "QA");
		email.sendKeys(read1.getCellData("VALUE", 44));
		next.click();
		HelperFunctions.waitForPageToLoad(15);
		addUser.click();
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 77));
		//Driver.getDriver().get("https://ums-productcentral-qa.pwc.com/ums");
		HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchCompany));
	    HelperFunctions.staticWait(3);
		productsTab.click();
		test.info("Clicked on product tab");
		//HelperFunctions.staticWait(15);
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
		wait1.until(ExpectedConditions.visibilityOf(addProductButton));
		HelperFunctions.staticWait(3);
		addProductButton.click();
		test.info("Clicked on add product button");
		WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
		wait2.until(ExpectedConditions.visibilityOf(saveCompany));
		productNameField.click();
		test.info("Clicked on product name and send key");
		HelperFunctions.staticWait(2);
		Faker faker=new Faker();
		String random=faker.lorem().characters(4);
		productNameField.sendKeys(random);
		HelperFunctions.staticWait(2);
		productCodeField.click();
		test.info("Clicked on product code and send key");
		HelperFunctions.staticWait(2);
		Faker faker2=new Faker();
		String random2=faker2.lorem().characters(4);
		productCodeField.sendKeys(random2);
		HelperFunctions.staticWait(2);
		saveCompany.click();
		test.info("Clicked on save company");
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 15);
		wait3.until(ExpectedConditions.visibilityOf(scProductError));
		Assert.assertTrue(scProductError.getText().contains("SC_Product"));
		test.info("Verified error field because of no SC product id");
		HelperFunctions.staticWait(3);
		SCproduct.click();
		test.info("Clicked on SC product id and send key");
		HelperFunctions.staticWait(2);
		Faker faker3=new Faker();
		String random3=faker3.lorem().characters(4);
		SCproduct.sendKeys(random3);
		HelperFunctions.staticWait(2);
		saveCompany.click();
		test.info("Clicked on save company");
		WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 15);
		wait4.until(ExpectedConditions.visibilityOf(scProductError));
		test.info("Verified error field because of no filling date areas");
		HelperFunctions.staticWait(2);
		SCproduct.click();
		HelperFunctions.staticWait(2);
		SCproduct.clear();
		HelperFunctions.staticWait(2);
		Faker faker4=new Faker();
		String random4=faker4.lorem().characters(50);
		SCproduct.sendKeys(random4);
		test.info("Clicked on SC product id and send very long charachter");
		HelperFunctions.staticWait(2);
		saveCompany.click();
		test.info("Clicked on save company");
		WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 15);
		wait5.until(ExpectedConditions.visibilityOf(scProductError));
		HelperFunctions.staticWait(2);
		Assert.assertTrue(scProductError.getText().contains("too long"));
		test.info("Verified error field because of sc product id is too long");
		HelperFunctions.staticWait(3);
		SCproduct.click();
		HelperFunctions.staticWait(2);
		SCproduct.clear();
		HelperFunctions.staticWait(2);
		productNameField.click();
		HelperFunctions.staticWait(2);
		productNameField.clear();
		HelperFunctions.staticWait(2);
		productCodeField.click();
		HelperFunctions.staticWait(2);
		productCodeField.clear();
		HelperFunctions.staticWait(2);
		test.info("Clicked on SC product id-product name-product code and clear the areas");
		startDate.click();
		HelperFunctions.staticWait(2);
		LocalDate currentDate=LocalDate.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate=currentDate.format(formatter);
		startDate.sendKeys(formattedDate);
		HelperFunctions.staticWait(2);
		LocalDate currentDate2=LocalDate.now();
		LocalDate futureDate=currentDate2.plusMonths(3);
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate2=futureDate.format(formatter2);
		HelperFunctions.staticWait(2);
		test.info("Clicked on start date and send today's date");
		saveCompany.click();
		test.info("Clicked on save company");
		WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 15);
		wait6.until(ExpectedConditions.visibilityOf(scProductError));
		test.info("Verified error field because of no filling out sc product id");
		HelperFunctions.staticWait(2);
	}

}
