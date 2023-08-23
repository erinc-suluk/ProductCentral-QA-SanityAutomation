package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;
import com.pwc.productcentral.ReadXLSdata;

public class HomePage extends HelperFunctions {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(xpath="//img[@class='cmp-hero__image']")
	private WebElement promotionBannerImage;
	
	@FindBy(xpath="//div[@class='cmp-hero__description']")
	private WebElement descriptionOfPromotionBanner;
	
	@FindBy(xpath="//div[@class='cmp-hero']")
	private WebElement promotionBanner;
	
	@FindBy(xpath="//div[@class='cmp-leftnavigation__items']")
	private static List<WebElement> leftNavigationItems2;
	
	@FindBy(xpath="//div[@class='cmp-tiles__entries']//a")
	private static List<WebElement> homePageTiles;
	
	@FindBy(xpath="(//div[@class='cmp-tiles__entry-title'])[1]")
	private WebElement legalTile;
	
	@FindBy(xpath="//div[@class='cmp-product-list__search-bar-container']")
	private WebElement landingPageComponentForLegalTile;
	
	@FindBy(xpath="//div[@class='cmp-tiles__entry-title']")
	private static List<WebElement> titleOfTiles;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement oneStopTitle;
	
	@FindBy(xpath="//div[@class='cmp-tiles__entry-desc']")
	private static List<WebElement> descriptionOfTiles;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement title;
	
	@FindBy(xpath="//div[@class='text cmp-tiles__description']")
	private WebElement descriptionOfTitle;
	
	@FindBy(xpath="(//a[@href='/us/en/my-products.html'])[1]")
	private WebElement logintoMyProduct;
	
	@FindBy(xpath="//div[@data-path='/content/pc/us/en/automation/homepage-demo/jcr:content/root/container/container/tiles/title']")
	private WebElement titleforAuthor;
	
	@FindBy(xpath="//button[@id='searchButtonHeader']")
	private WebElement searchButton;
	
	@FindBy(xpath="//input[@id='globalSearchInput']")
	private WebElement searchInput;
	
	@FindBy(xpath="//div[@id='searchProductDropdown']")
	private WebElement productDropdown;
	
	@FindBy(xpath="//div[@class='ap-dropdown-list show']//div//label")
	private static List<WebElement> productDropdownList;
	
	@FindBy(xpath="//input[@id='change-navigator']")
	private WebElement changeNavigatorCheckbox;
	
	@FindBy(xpath="//div[@id='docDropdown']")
	private WebElement catDropdown;
	
	@FindBy(xpath="//div[@id='searchSortingDropdown']")
	private WebElement sortingDropdown;
	
	@FindBy(xpath="//input[@id='data-processing-addendum']")
	private WebElement dataAppCheckbox;
	
	@FindBy(xpath="//input[@id='documentation']")
	private WebElement documentationCheckbox;
	
	@FindBy(xpath="(//div[@class='cmp-search-results__card-title'])[1]")
	private WebElement dataAppTitle;
	
	@FindBy(xpath="(//div[@class='cmp-search-results__card-title'])[2]")
	private WebElement documentationTitle;
	
	@FindBy(xpath="//span[@class='sdk-HeaderFileInfoView-fileBreadCrumb sdk-HeaderFileInfoView-fileBreadCrumbNormal']")
	private WebElement dataAppContent;
	
	@FindBy(xpath="(//div[@class='ap-dropdown-option-item'])//input")
	private static List<WebElement> catDropdownCheckboxes;
	
	@FindBy(xpath="(//div[@class='cmp-search-results__card-title'])[position()=1 or position()=2 or position()=3 or position()=4 or position()=5 or position()=6 or position()=7 or position()=8 or position()=9 or position()=10]")
	private static List<WebElement> resultList;
	
	@FindBy(xpath="(//a[@href='/us/en/my-products.html'])[1]")
	private WebElement loginToMyProductLink;
	
	@FindBy(xpath="(//*[@id='searchProductDropdown']/div[2])//div")
	private static List<WebElement> productDropdownItems;
	
	@FindBy(xpath="//*[@id='docDropdown']/div[2]//div")
	private static List<WebElement> catDropdownItems;
	
	@FindBy(xpath="(//div[@class='ap-dropdown-list show'])[2]//div//label")
	private static List<WebElement> catDropdownList;
	
	@FindBy(xpath="//div[@data-href='/content/pc/us/en/my-products/product-4.html']")
	private WebElement loginLink;
	
	@FindBy(xpath="//img[@id='PwCLogo']")
	private WebElement pwcLogo;
	
	@FindBy(xpath="//input[@id='initEmail']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@class='ap-dropdown-option-checkbox']")
	private static List<WebElement> productCheckbox;
	
	@FindBy(xpath="//div[@class='cmp-search-results__card-title']")
	private static List<WebElement> resultsTitles;
	
	@FindBy(xpath="//div[@class='ap-dropdown-list show']")
	private static List<WebElement> productDropdownList2;
	
	@FindBy(xpath="//div[@class='cmp-pdfviewer']")
	private WebElement pdfViewer;
	
	@FindBy(xpath="//div[@class='cmp-tiles__products-link']")
	private static List<WebElement> loginToMyProductsLinks;
	
	@FindBy(xpath="//div[@id='resultsContainer']//div//a")
    private WebElement resultContainer;
    
    @FindBy(xpath="//div[@class='cmp-breadcrumb']//a")
    private WebElement breadCrumb;
    
    @FindBy(xpath="//input[@aria-label='Search Product']")
    private WebElement searchProducts;
    
    @FindBy(xpath="//div[@class='ap-option-item']")
    private WebElement optionItem;
    
    @FindBy(xpath="//a[@class='cmp-product-list__card-link']")
    private WebElement resultLink;
	
    @FindBy(xpath="//div[@class='cmp-header__logo']")
    private WebElement pwcLogo2;
    
    @FindBy(xpath="//div[@class='cmp-hero__action-container']//a")
	private WebElement allProductsButton;
	
    @FindBy(xpath="//div[@class='cmp-tiles__entries']//a[1]")
	private WebElement FirsthomePageTile;
    
    @FindBy(xpath="//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")
	private static WebElement closeButtonforCookies;
    
    @FindBy(xpath="//div[@id='faqsTooltipDisplayButton']")
	private static WebElement needHelp;
	
	@FindBy(xpath="//div[@class='cmp-faqs-tooltip__links']//a")
	private static List<WebElement> tooltipLinks;
	
	@FindBy(xpath="//div[@data-option-id='A-Z']")
	private WebElement az;
	
	
	ReadXLSdata read2=new ReadXLSdata();
	
	
	
	
	
	
	
	
	
	
	

	
	static Logger logger=Logger.getLogger("HomePage");
	
	
	
	public void setImage() throws Exception {
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
        Boolean image = (Boolean) ((JavascriptExecutor) Driver.getDriver())
            .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" "
                + "&& arguments[0].naturalWidth > 0", promotionBannerImage);
        if (!image) {
            String errorMessage = "The promotion banner does not contain an image";
            logger.error(errorMessage);
            throw new Exception(errorMessage);

        } else {
            String successMessage = "The promotion banner contains an image";
            logger.info(successMessage);
        }
		
	}
	public void setDescriptionOfBanner() throws Exception {
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
        read2.setExcelFile("./testdata.xlsx", "QA");
        String actual = descriptionOfPromotionBanner.getText();
        System.out.println(actual);
        String expected = read2.getCellData("VALUE", 29);
        if (!actual.equals(expected)) {
            String errorMessage = "The promotion banner does not match with the expected text.";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
        }else {
            String successMessage = "The promotion banner contains an image";
            logger.info(successMessage);
        }
	}
	
	
	public void setPromotionBanner() throws Exception {
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
        if(promotionBanner.isDisplayed()) {
             String successMessage = "The promotion banner is visible to all users on homepage";
                logger.info(successMessage);
             Assert.assertTrue(true);
          } else {
              String errorMessage = "The promotion banner is not visible to all users on homepage";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
         //   logger.error("The promotion banner is not visible to all users on homepage");
          }
		
	}
	
	
	public void sethomePageTiles() throws Exception {
        HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(3);
        for(WebElement TilesItems:homePageTiles) {
            if(TilesItems.isDisplayed()) {
                 String successMessage = "The promotion banner contains an image";
                    logger.info(successMessage);
                Assert.assertTrue(true);
            }else {
                 String errorMessage = "Missing home page tile";
                    logger.error(errorMessage);
                    throw new Exception(errorMessage);
                //logger.error("Missing home page tile");
            }
    }
        
    }
	public void setLegalTile() {
	    HelperFunctions.waitForPageToLoad(10);
	    HelperFunctions.staticWait(3);
	    for (WebElement link : homePageTiles) {
	        try {
	            String expectedUrl = link.getAttribute("href");
	            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
	            WebElement linkClickable = wait.until(ExpectedConditions.elementToBeClickable(link));
	            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	            executor.executeScript("arguments[0].click();", linkClickable);
	            String actualUrl = Driver.getDriver().getCurrentUrl();
	            Assert.assertTrue(actualUrl.startsWith("https://login"));
	        } catch (StaleElementReferenceException e) {
	           
	        }
	    }
	}

	public void setTitleOfTiles() throws Exception {
		HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(3);
        for(WebElement eachTitle:titleOfTiles) {
            if(eachTitle.isDisplayed()) {
                 String successMessage = "Tiles contain a title";
                    logger.info(successMessage);
                Assert.assertTrue(true);
            }else {
                  String errorMessage = "Tiles do not contain a title";
                    logger.error(errorMessage);
                    throw new Exception(errorMessage);
                //logger.error("Tiles do not contain a title");
            }
    }
        
        
    }
	
	public void setOneStopTitle() throws Exception {
        HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(3);
        read2.setExcelFile("./testdata.xlsx", "QA");
        String actualTitle=oneStopTitle.getText();
        String expectedTitle=read2.getCellData("VALUE", 30);
        
    //    Assert.assertEquals(actualTitle, expectedTitle, "Actual and expected title do not match");
         if (!actualTitle.equals(expectedTitle)) {
              String errorMessage = "Actual and expected title do not match";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
          }else {
              String successMessage = "Actual and expected title match";
                logger.info(successMessage);
          }
    }
	
	public void setDescriptionOfTiles() throws Exception {
		 HelperFunctions.waitForPageToLoad(10);
		 HelperFunctions.staticWait(3);
        for(WebElement eachDescription: descriptionOfTiles) {
            System.out.println(eachDescription.getCssValue("-webkit-line-clamp"));
            if(eachDescription.getCssValue("-webkit-line-clamp").equals("6")) {
                 String successMessage = "The description is 6 lines";
                    logger.info(successMessage);
                Assert.assertTrue(true);
            }else {
                 String errorMessage = "The description is more than 6 lines";
                    logger.error(errorMessage);
                    throw new Exception(errorMessage);
//                logger.error("The description is more than 6 lines");
                
            }
        }
    }
	
	public void setTitleAndDescription() throws Exception {
        HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(3);
        if(title.isDisplayed() && descriptionOfTitle.isDisplayed()) {
            String successMessage = "Verified title and description";
            logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
            String errorMessage = "Not verified title and description";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
//            logger.error("The title or description does not exist on home page");
            
        }
    }
	
	public void setTitleforAuthor() {
		
	}
	
	public void setSearchButton() throws Exception {
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
        searchButton.click();
        HelperFunctions.staticWait(3);
        
        searchInput.sendKeys("products");
        searchInput.sendKeys(Keys.ENTER);
        if(productDropdown.isDisplayed() && catDropdown.isDisplayed() && sortingDropdown.isDisplayed()) {
             String successMessage = "dropdowns are displayed";
                logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
             String errorMessage = "dropdowns are not displayed";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
            //Assert.assertTrue(false);
        }
        HelperFunctions.staticWait(3);
        productDropdown.click();
        HelperFunctions.staticWait(3);
        changeNavigatorCheckbox.click();
        HelperFunctions.staticWait(3);
        catDropdown.click();
        HelperFunctions.staticWait(3);
        dataAppCheckbox.click();
        HelperFunctions.staticWait(3);
        documentationCheckbox.click();
        HelperFunctions.staticWait(3);
        catDropdown.click();
        HelperFunctions.staticWait(3);
     //   Assert.assertEquals(dataAppTitle.getText(), "Data Processing Addendum");
        if (!dataAppTitle.getText().equals("Data Processing Addendum")) {
              String errorMessage = "Texts are not matching";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
          }else {
              String successMessage = "Texts are matching";
                logger.info(successMessage);
          }
        Assert.assertEquals(documentationTitle.getText(), "Documentation");
        if (!documentationTitle.getText().equals("Documentation")) {
              String errorMessage = "Texts are not matching";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
          }else {
              String successMessage = "Texts are matching";
                logger.info(successMessage);
          }
        HelperFunctions.staticWait(2);
        dataAppTitle.click();
        HelperFunctions.staticWait(2);
        if(pdfViewer.isDisplayed()) {
            String successMessage = "Pdf is displayed";
            logger.info(successMessage);
                Assert.assertTrue(true);
            }else {
                 String errorMessage = "Pdf is not displayed";
                 logger.error(errorMessage);
                 throw new Exception(errorMessage);
           //    logger.error("Data App content is not displayed");
                
            }
        
        
        
        
        
        
    }
    
	public void setSortedResult(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		test.info("Click on search field");
        searchButton.click();
        HelperFunctions.staticWait(3);
        test.info("Send text to search field");
        searchInput.sendKeys("offering");
        test.info("Click on enter");
        searchInput.sendKeys(Keys.ENTER);
        HelperFunctions.waitForPageToLoad(15);
        HelperFunctions.staticWait(3);
        test.info("Click on product dropdown");
        productDropdown.click();
       // changeNavigatorCheckbox.click();
        HelperFunctions.staticWait(3);
        productDropdown.click();
        HelperFunctions.staticWait(3);
        test.info("Click on category dropdown");
        test.info("Selecting all checkboxes");
        catDropdown.click();
        for(int i=0; i<catDropdownCheckboxes.size(); i++)
        {
            if(catDropdownCheckboxes.get(i).isDisplayed() && catDropdownCheckboxes.get(i).isEnabled())
            {
                  // System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
                   catDropdownCheckboxes.get(i).click();
            }
        }
        HelperFunctions.staticWait(3);
        catDropdown.click();
        HelperFunctions.staticWait(3);
        sortingDropdown.click();
        HelperFunctions.staticWait(3);
        az.click();
        HelperFunctions.staticWait(3);
        
        ArrayList<String> obtainedList = new ArrayList<>();
        for (WebElement we : resultList) {
            obtainedList.add(we.getText());
        }

        ArrayList<String> sortedList = new ArrayList<>(obtainedList); 

        Comparator<String> caseInsensitiveComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        };

        Collections.sort(sortedList, caseInsensitiveComparator);

        if (!sortedList.equals(obtainedList)) {
            String errorMessage = "Results are not sorted";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
        } else {
            String successMessage = "Results are sorted";
            logger.info(successMessage);
        }

        test.info("Verified results are sorted");
        HelperFunctions.staticWait(3);
        
        
        
        
    }
	public void setDropdown(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		test.info("Clicking on search button");
		wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
        HelperFunctions.staticWait(3); 
        test.info("Send text on search button");
        searchInput.sendKeys("products");
        HelperFunctions.staticWait(2); 
        test.info("Clicking on enter");
        searchInput.sendKeys(Keys.ENTER);
        HelperFunctions.waitForPageToLoad(15);
        HelperFunctions.staticWait(3);
        test.info("Verified dropdowns");
        if(productDropdown.isEnabled() && productDropdown.isDisplayed()) 
        { 
            String successMessage = "Product Dropdown is enabled and visible";
            logger.info(successMessage);
        } 
       else { 
           String errorMessage = "Product Dropdown is not visible";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
          
       } 
        HelperFunctions.staticWait(3);
        test.info("Clicking on product dropdown");
        productDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(changeNavigatorCheckbox));
        test.info("Clicking on checkbox");
        changeNavigatorCheckbox.click();
        HelperFunctions.staticWait(3);
        if(catDropdown.isEnabled() && catDropdown.isDisplayed()) 
        { 
            String successMessage = "Category Dropdown is enabled and visible";
            logger.info(successMessage);
        } 
       else { 
           String errorMessage = "Category Dropdown is not visible";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
         
       } 
        HelperFunctions.staticWait(3);
        productDropdown.click();
        HelperFunctions.staticWait(3);
        test.info("Clicking on category dropdown");
        catDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(dataAppCheckbox));
        test.info("Clicking on data app checkbox");
        dataAppCheckbox.click();
        HelperFunctions.staticWait(3);
        test.info("Clicking on documentation checkbox");
        documentationCheckbox.click();
        HelperFunctions.staticWait(3);
        catDropdown.click();
        wait.until(ExpectedConditions.visibilityOf(dataAppTitle));
        test.info("Verified texts are matching on the result table");
        if (!dataAppTitle.getText().equals("Data Processing Addendum")) {
              String errorMessage = "Texts are not matching.";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
          }else {
              String successMessage = "Texts are matching";
                logger.info(successMessage);
          }
      
        if (!documentationTitle.getText().equals("Documentation")) {
              String errorMessage = "Texts are not matching.";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
          }else {
              String successMessage = "Texts are matching";
                logger.info(successMessage);
          }
        test.info("Clicking on data app on result table");
        dataAppTitle.click();
        //Driver.getDriver().switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOf(pdfViewer));
        test.info("Verified content pdf is visible");
        if(pdfViewer.isDisplayed()) {
            String successMessage = "pdf viewer is displayed";
            logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
            String errorMessage = "pdf viewer is not displayed";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
//            logger.error("Data App content is not displayed");
            
        }
        HelperFunctions.staticWait(2); 
    }
    
    public void setLogintoMyProduct() {
    	HelperFunctions.waitForPageToLoad(10);
    	HelperFunctions.staticWait(3);
    	loginToMyProductLink.click();
    }
    
    public void setDropdownList() {
    	HelperFunctions.waitForPageToLoad(5);
    	HelperFunctions.staticWait(3);
    	searchButton.click();
    	HelperFunctions.staticWait(3);
    	
        searchInput.sendKeys("products");
        searchInput.sendKeys(Keys.ENTER);
        HelperFunctions.staticWait(3);
        if(productDropdown.isEnabled() && productDropdown.isDisplayed()) 
        { 
           System.out.println("Product Dropdown is enabled and visible"); 
        } 
       else { 
           System.out.println("Product Dropdown is not visible"); 
       }   
        
        
    }
    public void setDropdownList2(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
    	HelperFunctions.waitForPageToLoad(20);
    	test.info("Click on product dropdown");
    	productDropdown.click();
    	test.info("Comparing elements with tag taxonomy in the excelsheet");
    	 FileInputStream file = new FileInputStream("C:\\Users\\GLBL_RDP_USER_02\\eclipse-workspace\\ProductCentralProject-Automation-0.0.1-SNAPSHOT2\\testdata.xlsx");
         XSSFWorkbook workbook = new XSSFWorkbook(file);
         XSSFSheet sheet = workbook.getSheetAt(1); 
    	HelperFunctions.staticWait(3);
        int columnIndex2 = 1;
        HashSet<String> cellValues2 = new HashSet<String>();
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
            XSSFRow row = sheet.getRow(rowNum);
            if(row == null) continue;
            XSSFCell cell = row.getCell(columnIndex2);
            if(cell == null) continue;
            cellValues2.add(cell.getStringCellValue());
            System.out.println(cell);
        }
        for (WebElement element2 : productDropdownList) {
            System.out.println(element2);
            if(element2.isDisplayed() && element2.isEnabled()){
                String elementText2 = element2.getText();
                if(elementText2!=null && !elementText2.isEmpty()){
                    if(elementText2.equalsIgnoreCase("Workforce Orchestrator")) {
                        System.out.println("Ignoring element: " + elementText2);
                        continue; 
                    }
                    if(elementText2.equalsIgnoreCase("Board Central")) {
                        System.out.println("Ignoring element: " + elementText2);
                        continue; 
                    }
                    if(elementText2.equalsIgnoreCase("Master Data Management")) {
                        System.out.println("Ignoring element: " + elementText2);
                        continue; 
                    }
                    
                    Assert.assertTrue(cellValues2.contains(elementText2), "element text: " + elementText2 + " not found in the column1: " + columnIndex2);
                }else{
                    System.out.println("Element text is empty or null, skipping the element");
                }
            }else{
                System.out.println("Element is not interactable or not visible, skipping the element");
            }
        }
        test.info("Verified all the elements in product dropdown are in tag taxonomy");
    	HelperFunctions.staticWait(3); 
    	test.info("Click on category dropdown");
    	catDropdown.click();
    	test.info("Comparing elements with tag taxonomy in the excelsheet");
    	 HelperFunctions.staticWait(3);
         int columnIndex3 = 0;
         HashSet<String> cellValues3 = new HashSet<String>();
         for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
             XSSFRow row = sheet.getRow(rowNum);
             if(row == null) continue;
             XSSFCell cell = row.getCell(columnIndex3);
             if(cell == null) continue;
             cellValues3.add(cell.getStringCellValue());
         }
         for (WebElement element3 : catDropdownList) {
             if(element3.isDisplayed() && element3.isEnabled()){
                 String elementText3 = element3.getText();
                 if(elementText3!=null && !elementText3.isEmpty()){
                     Assert.assertTrue(cellValues3.contains(elementText3), "element text: " + elementText3 + " not found in the column2: " + columnIndex3);
                 }else{
                     System.out.println("Element text is empty or null, skipping the element");
                 }
             }else{
                 System.out.println("Element is not interactable or not visible, skipping the element");
             }
         }
         test.info("Verified all the elements in category dropdown are in tag taxonomy");
         HelperFunctions.staticWait(5);
        
        }
    
   public void setSearchResult(ExtentTest test) throws Exception {
	   test.info("Wait for the page to load.");
	   HelperFunctions.waitForPageToLoad(20);
	  // HelperFunctions.staticWait(3);
	   test.info("Click on search field");
   	searchButton.click();
   	HelperFunctions.staticWait(3);
   	test.info("Send text to search field");
       searchInput.sendKeys("products");
       test.info("Click on enter");
       searchInput.sendKeys(Keys.ENTER);
       HelperFunctions.waitForPageToLoad(20);
       HelperFunctions.staticWait(3);
       test.info("Select product from product dropdown");
       productDropdown.click();
       HelperFunctions.staticWait(2);
       String expectedProductName="change-navigator";
       for(int i=0; i<productCheckbox.size(); i++) {
           if(productCheckbox.get(i).getAttribute("id").equalsIgnoreCase(expectedProductName)) {
               productCheckbox.get(i).click();
           }
       }
       HelperFunctions.staticWait(2);
       test.info("Close the dropdown");
       productDropdown.click();
       HelperFunctions.staticWait(3);
       String actualProductName=resultContainer.getAttribute("data-product-name");
       System.out.println(actualProductName);
     //  Assert.assertEquals(actualProductName, expectedProductName);
       if (!actualProductName.equals(expectedProductName)) {
           String errorMessage = "Product names do not match";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
       }else {
           String successMessage = "Product names match";
             logger.info(successMessage);
       } 
       test.info("Verified selecting product appears on result table");
       test.info("Click on product on result table");
       HelperFunctions.staticWait(2);
       resultContainer.click();
       HelperFunctions.waitForPageToLoad(10);
       HelperFunctions.staticWait(3);
      // breadCrumb.click();
      // HelperFunctions.staticWait(3);
       String actualTitle=oneStopTitle.getText();
       String expectedTitle="Change Navigator";
    //   Assert.assertEquals(actualTitle, expectedTitle);
       if (!actualTitle.equals(expectedTitle)) {
           String errorMessage = "Titles do not match";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
       }else {
           String successMessage = "Titles match";
             logger.info(successMessage);
       } 
       test.info("Verified actual title matches with expected title");
       test.info("Click on breadcrumb");
       HelperFunctions.staticWait(2);
       breadCrumb.click();
       HelperFunctions.waitForPageToLoad(10);
       HelperFunctions.staticWait(3);
       test.info("Click on search products");
       searchProducts.click();
       HelperFunctions.staticWait(2);
       test.info("Send expected title ");
       searchProducts.sendKeys(expectedTitle);
       test.info("Click on product");
       HelperFunctions.staticWait(2);
       optionItem.click();
       HelperFunctions.staticWait(3);
       String actualTitle2=resultLink.getAttribute("data-product-name");
     //  Assert.assertEquals(actualTitle2, expectedTitle);
       if (!actualTitle2.equals(expectedTitle)) {
           String errorMessage = "Titles do not match";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
       }else {
           String successMessage = "Titles match";
             logger.info(successMessage);
       } 
       test.info("Verified actual title matches with expected title");

       HelperFunctions.staticWait(2);
   }
   
    
    
    
    public void setLoginToMyProductLink(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
    	HelperFunctions.waitForPageToLoad(20);
    	 JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
 	    js2.executeScript("window.scrollBy(0,250)", "");
 	   HelperFunctions.staticWait(3);
 	  test.info("Click on login to my products");
    	for(WebElement each:loginToMyProductsLinks) {
    		each.click();
    		break;
    		
    	}
    	test.info("Verified pwc logo, email field and next button are displayed.");
    	if(pwcLogo.isDisplayed() && email.isDisplayed() && next.isDisplayed()) {
    		String successMessage = "LoginToMyProductLink elements are displayed";
            logger.info(successMessage);
    		Assert.assertTrue(true);
    	}else {
    		 String errorMessage = "LoginToMyProductLink elements are not displayed";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
    	//	Assert.assertTrue(false);
    	}
    	HelperFunctions.staticWait(3);
    }
    public void setOpenHomePagePwcLogo(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
    	HelperFunctions.waitForPageToLoad(20);
    	test.info("Click on pwc logo");
        pwcLogo2.click();
        HelperFunctions.staticWait(2);
        String currentUrl=Driver.getDriver().getCurrentUrl();
        if(currentUrl.contains("/us/en/homepage.html")) {
            Assert.assertTrue(true);
        }else {
             String errorMessage = "When clicking pwc logo pc homepage is not loaded ";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
        }
        test.info("Verified page is landing homepage");
        HelperFunctions.staticWait(3);
    }
    
    public void setOpenMyProductPagePwcLogo() throws Exception {
    	
    	HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(3);
       // pwcLogo2.click();
        HelperFunctions.staticWait(2);
        String currentUrl=Driver.getDriver().getCurrentUrl();
        if(currentUrl.contains("/content/pc/us/en/my-products/")) {
            Assert.assertTrue(true);
        }else {
             String errorMessage = "When clicking pwc logo pc my product page is not loaded ";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
        }
        
        HelperFunctions.staticWait(3);
    }
        
        
    public void setAllProductsButtonFunctionality(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
    	HelperFunctions.waitForPageToLoad(20);
    	
        if(allProductsButton.getAttribute("href")!=null && allProductsButton.getAttribute("href").endsWith("products.html")) {
        	 String successMessage = "This component contains a link/button for my product page";
    	        logger.info(successMessage);
        	Assert.assertTrue(true);
        }else {
        	 String errorMessage = "This component does not contain a link/button for my product page";
    	        logger.error(errorMessage);
    	        throw new Exception(errorMessage);
        
        }
        test.info("Verified all products button contains href value and the href value landing on product page ");
        HelperFunctions.staticWait(2);
    }   
    public void setTilesHasLoginLink(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		//HelperFunctions.staticWait(3);
		if(FirsthomePageTile.getText().contains("My Products")&&FirsthomePageTile.getText().contains("Login to My Products")) {
			Assert.assertTrue(true);
		}else {
			 String errorMessage = "My Product Tile does not contain 'login to my product' link";
		        logger.error(errorMessage);
		        throw new Exception(errorMessage);
		}
		test.info("Verified homepage tile has login to my products link");
		HelperFunctions.staticWait(3);
	}
    public void setItemsinNeedHelpExpandCollapse(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
    	HelperFunctions.waitForPageToLoad(20);
    	HelperFunctions.staticWait(2);
    	test.info("Click on close cookies button");
    	try {
    	if (closeButtonforCookies.isDisplayed()) {
    	   
    		closeButtonforCookies.click();
    	    System.out.println("Close cookies.");
    	} 
    	}catch(NoSuchElementException | StaleElementReferenceException ignored) {
    		
    	}
    	test.info("Click on need help");
    	HelperFunctions.staticWait(2);
    	needHelp.click();
    	HelperFunctions.staticWait(2);
    	for(WebElement eachLink:tooltipLinks) {
    		if(eachLink.isDisplayed()) {
    			String successMessage = "Each link is displayed";
    	        logger.info(successMessage);
    		Assert.assertTrue(true);
    		}else {
    			 String errorMessage = "Each link is not displayed";
    		        logger.error(errorMessage);
    		        throw new Exception(errorMessage);

    		}
    		test.info("Verified each link in need help are displayed.");
    	}
    	test.info("Click on need help");
    	HelperFunctions.staticWait(2);
    	needHelp.click();
    	HelperFunctions.staticWait(2);
    	for(WebElement eachLink:tooltipLinks) {
    		if(!eachLink.isDisplayed()) {
    			String successMessage = "Each link is not displayed";
    	        logger.info(successMessage);
    		Assert.assertTrue(true);
    		}else {
    			 String errorMessage = "Each link still is displayed";
    		        logger.error(errorMessage);
    		        throw new Exception(errorMessage);

    		}
    	}
    	test.info("Verified each link in need help are not displayed.");
    	HelperFunctions.staticWait(3);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
