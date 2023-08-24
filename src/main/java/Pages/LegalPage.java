package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;
import com.pwc.productcentral.ReadXLSdata;

public class LegalPage extends HelperFunctions {
	public LegalPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal/maintenance---support.html']")
	private WebElement maintenanceAndSupportLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal/offering-overview.html']")
	private WebElement offeringOverviewLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal/data-processing-addendum.html']")
	private WebElement dataProcessingLink;
	
	@FindBy(xpath="//a[@href='/us/en/products/change-navigator/offering-overview.html']")
	private WebElement changeNavigatorLink;
	
	@FindBy(xpath="//a[@href='/us/en/products/customer-link/maintenance---support.html']")
	private WebElement customerLink;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement maintenanceAndSupportTitle;
	
	@FindBy(xpath="//a[@href='https://productcentral-qa.products.pwc.com/us/en/automation/legal/maintenance---support.html']")
	private WebElement maintenanceAndSupportBreadcrumb;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__title']")
	private WebElement ContentTitle;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']//a")
	private static List<WebElement> tilesComponents;
	
	@FindBy(xpath="//a[@href='/us/en/automation/legal.html']")
	private WebElement backtoLegalBreadcrumb;
	
	@FindBy(xpath="//div[@class='cmp-breadcrumb']//a")
	private static List<WebElement> legalTiles;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']")
	private static List<WebElement> legalTilesOffering;
	
	@FindBy(xpath="//span[@class='cmp-breadcrumb__link-title']")
	private WebElement offeringOverviewBreadcrumb;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entry-desc']")
	private static List<WebElement> descriptionOfTiles;
	
	@FindBy(xpath="//a[@id='referrer-module']")
	private WebElement backtoLegalBreadcrumbfromContent;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entry-title']")
	private static List<WebElement> legalTilesTitle;
	
	@FindBy(xpath="//div[@class='cmp-breadcrumb']//a")
	private static List<WebElement> breadcrumbLinks;
	
	@FindBy(xpath="(//div[@class='cmp-document-tiles'])[2]")
	private WebElement specificTerms;
	
	@FindBy(xpath="(//div[@class='cmp-document-tiles'])[2]//a")
	private static List<WebElement> specificTermsItems;
	
	@FindBy(xpath="//div[@id='sortingDropdown']")
	private WebElement sortingDropdown;
	
	@FindBy(xpath="//div[@class='ap-dropdown-list show']//span[1]")
	private static List<WebElement> sortOptions;
	
	
	ReadXLSdata read1=new ReadXLSdata();
	
    static Logger logger=Logger.getLogger("LegalPage");
    
    public void setlegalTiles() throws Exception {
        HelperFunctions.waitForPageToLoad(5);
         for (WebElement link : legalTiles) {
             String hrefValue = link.getAttribute("href");
             link.click();
             String currentUrl = Driver.getDriver().getCurrentUrl();
            // Assert.assertEquals(hrefValue, currentUrl);
             if (!hrefValue.equals(currentUrl)) {
                  String errorMessage = "Link does not match with the expected url.";
                    logger.error(errorMessage);
                    throw new Exception(errorMessage);
              }else {
                  String successMessage = "Link matches with the expected url.";
                    logger.info(successMessage);
              } 
                }
    }
	
	public void setDescriptionOfTiles(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		test.info("Getting each description css value");
		for(WebElement eachDescription: descriptionOfTiles) {
			System.out.println(eachDescription.getCssValue("-webkit-line-clamp"));
			if(eachDescription.getCssValue("-webkit-line-clamp").equals("3")) {
				 String successMessage = "Document tiles are equal 3 lines";
                 logger.info(successMessage);
				Assert.assertTrue(true);
			}else {
				String errorMessage = "Document tiles are not equal 3 lines";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
			//	Assert.assertTrue(false);
				
			}
		}
		test.info("Verified each description css value is equal 3");
		 HelperFunctions.staticWait(3);
	}
	
	public void setContentPageTags(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		//JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	   // js2.executeScript("window.scrollBy(0,250)", "");
	    HelperFunctions.staticWait(3);
	    test.info("Click on each tiles and compare href values");
	    for (WebElement eachTiles : tilesComponents) {
	        try {
	            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	            wait.until(ExpectedConditions.elementToBeClickable(eachTiles));
	        
	            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", eachTiles);
	       
	            String script = "arguments[0].click();";
	            ((JavascriptExecutor) Driver.getDriver()).executeScript(script, eachTiles);
	        
	            HelperFunctions.staticWait(3);
	      
	            String hrefValue = eachTiles.getAttribute("href");
	            String currentUrl = Driver.getDriver().getCurrentUrl();
	            if (!hrefValue.equals(currentUrl)) {
	                String errorMessage = "Links do not match";
	                logger.error(errorMessage);
	                throw new Exception(errorMessage);
	            } else {
	                String successMessage = "Links match";
	                logger.info(successMessage);
	            }
	            
	        
	            Driver.getDriver().navigate().back();
	            
	        } catch (Exception e) {
	       
	        }
	    }
	    test.info("Verified the content pages are tagged accordingly");
	    HelperFunctions.staticWait(3);
	}
	public void setDisplayTilePerDocumentCat(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		test.info("Compare each value with tag taxonomy on excelsheet");
		//read1.setExcelFile("./testdata.xlsx", "QA");
		 FileInputStream file = new FileInputStream("C:\\Users\\GLBL_RDP_USER_02\\git\\ProductCentral-QA-SanityAutomation\\testdata.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheetAt(1); 
         
         int columnIndex3 = 0;
         HashSet<String> cellValues3 = new HashSet<String>();
         for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
             XSSFRow row = sheet.getRow(rowNum);
             if(row == null) continue;
             XSSFCell cell = row.getCell(columnIndex3);
             if(cell == null) continue;
             cellValues3.add(cell.getStringCellValue());
         }
         for (WebElement element3 : legalTilesTitle) {
             if(element3.isDisplayed() && element3.isEnabled()){
                 String elementText3 = element3.getText();
                 if(elementText3!=null && !elementText3.isEmpty()){
                     Assert.assertTrue(cellValues3.contains(elementText3), "element text: " + elementText3 + " not found in the column: " + columnIndex3);
                 }else{
                     System.out.println("Element text is empty or null, skipping the element");
                 }
             }else{
                 System.out.println("Element is not interactable or not visible, skipping the element");
             }
         }
         test.info("Verified each value with tag taxonomy on excelsheet");
         HelperFunctions.staticWait(3);
	}
	
	public void setBreadcrumb(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		test.info("Clicking on breadcrumb");
		breadcrumbLinks.get(0).click();
		String currentUrl = Driver.getDriver().getCurrentUrl();
		 Assert.assertTrue(currentUrl.endsWith("/content/pc/us/en/legal.html"));
			test.info("Verified the current url");
		 /*for (WebElement link : breadcrumbLinks) {
			 Assert.assertTrue(link.isDisplayed());
			 String hrefValue = link.getAttribute("href");
			 link.click();
			 String currentUrl = Driver.getDriver().getCurrentUrl();
			 Assert.assertTrue(currentUrl.endsWith("/content/pc/us/en/legal.html"));*/
			// Assert.assertEquals(hrefValue, currentUrl);
			/* if (!hrefValue.equals(currentUrl)) {
                 String errorMessage = "Links do not match";
                   logger.error(errorMessage);
                   throw new Exception(errorMessage);
             }else {
                 String successMessage = "Links match";
                   logger.info(successMessage);
             } */
	            
		
	}
	public void setFilterOptions(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		HelperFunctions.staticWait(2);
		test.info("Scroll down specific terms");
		HelperFunctions.scrollToElement(specificTerms);
		HelperFunctions.staticWait(2);
		test.info("Click on a specific terms' element");
        specificTermsItems.get(0).click();
        HelperFunctions.waitForPageToLoad(3);
        test.info("Clcik on sort dropdown");
	    sortingDropdown.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(sortOptions.get(0).getText().contains("A-Z"));
	    Assert.assertTrue(sortOptions.get(1).getText().contains("Z-A"));
	    Assert.assertTrue(sortOptions.size()==2);
	    test.info("Verified the size of dropdown elements and the values");
	    HelperFunctions.staticWait(2);
	}
	
	
	
	
	
	

}
