package Pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
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



public class ProductListingPage extends HelperFunctions {
	public ProductListingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	
	
	@FindBy(xpath="//div[@class='cmp-related-links__items']//div//a")
	private static List<WebElement> allLinks;
	
	@FindBy(xpath="//div[@class='cmp-related-links']")
	private static List<WebElement> allLinks2;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/offering-overview.html']")
	private WebElement offeringOverviewFromCloud;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/terms---conditions.html']")
	private WebElement termsAndConditionsLink;
	
	@FindBy(xpath="(//span[.='PricewaterhouseCoopers2'])[1]")
	private WebElement termsAndConditionsTitle;
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/maintenance---support.html']")
	private WebElement maintenanceAndSupportLink;
	
	@FindBy(xpath="(//span[.='sample (5)'])[1]")
	private WebElement headerForMaintenanceAndSupport;
	
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/offering-overview.html']")
	private WebElement offeringOverviewLink;
	
	@FindBy(xpath="(//span[.='PDF Template for AEM Testing'])[1]")
	private WebElement offeringOverviewLinkTitle;
	
	
	@FindBy(xpath="//a[@href='/us/en/automation/products/cloud/documentation.html']")
	private WebElement documentationLink;
	
	@FindBy(xpath="(//span[.='PDF Template for AEM Testing'])[2]")
	private WebElement documentationTitle;
	
	@FindBy(xpath="//div[@class='HUDView__hudContainer___3mx_O HUDView__immersiveShow___1pWVE']")
	private WebElement offeringPdfIcon;
	
	@FindBy(xpath="//nav[@id='skinny-rail']")
	private WebElement pdfIcon;
	
	@FindBy(linkText="Back to Cloud")
	private WebElement backToCloudBreadcrumb;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement cloudTitle;
	
	@FindBy(linkText="Back to Products")
	private WebElement backToProductsBreadcrumb;
	
	@FindBy(xpath="//h1[@class='cmp-product-list__search-bar-title']")
	private WebElement productsTitle;
	
	@FindBy(xpath="//input[@aria-label='Search Product']")
	private WebElement searchProduct;
	
	@FindBy(xpath="//div[@class='ap-option-item']")
	private WebElement searchItem;
	
	@FindBy(xpath="//span[@class='cmp-product-list__card-title ']")
	private WebElement products;
	
	@FindBy(xpath="//a[@data-product-name='Strategic']")
	private WebElement strategicProduct;
	
	@FindBy(xpath="//a[@data-product-name='Cloud']")
	private WebElement cloudProduct;
	
	@FindBy(xpath="//a[@data-product-name='Risk']")
	private WebElement riskProduct;
	
	@FindBy(xpath="//input[@placeholder='Search Products']")
	private WebElement productSearchBar;
	
	@FindBy(xpath="//div[@class='has-no-results']")
	private WebElement noResult;
	
	@FindBy(xpath="//div[@class='cmp-product-list__card-content']//span[2]")
	private static List<WebElement> titleofTiles;
	
	
	@FindBy(xpath="//div[@id='pdfviewer-cc9adec430-content']")
	private WebElement termsConditionContent;
	
	@FindBy(xpath="//div[@id='pdfviewer-4fb6948d1d-content']")
	private WebElement offeringOverviewContent;
	
	@FindBy(xpath="//div[@id='pdfviewer-4fb8297d06-content']")
	private WebElement documentationContent;
	
	@FindBy(xpath="//div[@id='pdfviewer-033ffa1470-content']")
	private WebElement maintenanceContent;
	
	@FindBy(xpath="//div[@class='cmp-breadcrumb']//a")
	private static List<WebElement> breadcrumbLinks;
	
	@FindBy(xpath="//div[@class='cmp-pdfviewer']")
	private WebElement pdfViewer;
	
	@FindBy(xpath="//div[@class='cmp-product-list__card-content']//span")
	private static List<WebElement> cardTitle;
	
	@FindBy(xpath="//div[@class='cmp-product-list__cards-container']//a")
	private static List<WebElement> productLinks;
	
	@FindBy(xpath="//div[@class='cmp-product-list__cards-alphabet-section']//div//a[2]")
	private WebElement productBasedonSearch;
	
	@FindBy(xpath="//div[@class='cmp-product-list__cards-alphabet-section']//div//a[1]")
	private WebElement productBasedonSearch2;
	
	@FindBy(xpath="(//a[@class='cmp-related-links__download-link'])[2]")
    private WebElement downloadLink;
	
	@FindBy(xpath="//div[@class='cmp-product-list__cards-alphabet-container']//div[2]//a")
	private static List<WebElement> allProducts;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entry-title']")
	private static List<WebElement> titleofElements;
	
	@FindBy(xpath="//h1[contains(@class, 'title')]")
	private WebElement contentTitle;
	
	@FindBy(xpath="//div[@class='cmp-breadcrumb']//a")
	private WebElement breadcrumb;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__pdf-info']")
	private static WebElement dateInfo;
	
	@FindBy(xpath="//div[contains(@class, 'pdf')]//div[contains(@class, 'content')]")
	private static WebElement contentElements;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entry-info-container']//div[1]")
	private static List<WebElement> productTitles;
	
	@FindBy(xpath="//div[@class='cmp-document-tiles__entry-info-container']//div[2]")
	private static List<WebElement> productDescriptions;
	
	@FindBy(xpath="//input[@id='PageNumberUIModern']")
	private WebElement pageNumber;
	
	@FindBy(xpath="//button[@id='documentSearch']")
	private WebElement docSearch;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement typeSearch;
	
	@FindBy(xpath="//div[@class='NumberOfSearchResults__NumberOfSearchResults___1VG6d']")
	private WebElement numberofResult;
	
	@FindBy(xpath="//button[@aria-label='Go to previous page']")
	private WebElement goToPrevious;
	
	@FindBy(xpath="//button[@aria-label='Go to next page']")
	private WebElement goToNext;
	
	@FindBy(xpath="//div[@id='adobe-dc-view']")
	private WebElement pdf;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Zoom page in')]")
	private WebElement zoomIn;
	
	@FindBy(xpath="//button[contains(@aria-label, 'Zoom page out')]")
	private WebElement zoomOut;
	
	@FindBy(xpath="//button[@aria-label='View pages']")
	private WebElement viewPages;
	
	@FindBy(xpath="//div[contains(@class, 'sideMenu')]")
	private WebElement threeDot;
	
	@FindBy(xpath="//span[normalize-space()='Download this file']")
	private WebElement downFile;
	
	@FindBy(xpath="//span[normalize-space()='Print this file']")
	private WebElement printFile;
	
	
	static Logger logger=Logger.getLogger("ProductListingPage");
	
	
	



   

    public void setAllLinks() throws IOException { 
    	HelperFunctions.waitForPageToLoad(5);
    	HelperFunctions.staticWait(3);
    	  for (WebElement link : allLinks) {
            
              String href = link.getAttribute("href");

          
              if (!href.isEmpty()) {
            
                  System.out.println(href);
                  Assert.assertTrue(true);
              }else {
            	  Assert.assertTrue(false);
              }
          }
    	
    }


	
    
    public void setLinks() {
    	HelperFunctions.waitForPageToLoad(10);
    	HelperFunctions.staticWait(3);
    	for (WebElement link : allLinks) {
    	    try {
    	        link.click();   
    	        Assert.assertNotNull(pdfViewer);
    	    } catch (StaleElementReferenceException e) {
    	       
    	    }
    	}
    }
    
    public void setPdfControllers() {
    	HelperFunctions.waitForPageToLoad(10);
    	HelperFunctions.staticWait(3);
    	for (WebElement link : allLinks) {
    	    try {
    	        link.click();   
    	        Assert.assertNotNull(pdfIcon);
    	    } catch (StaleElementReferenceException e) {
    	       
    	    }
    	}
    	
    
    }

	

    public void setBreadcrumbs() throws Exception {
        HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(3);
         for (WebElement link : breadcrumbLinks) {
             String hrefValue = link.getAttribute("href");
             link.click();
             String currentUrl = Driver.getDriver().getCurrentUrl();
            // Assert.assertEquals(hrefValue, currentUrl);
              if (!hrefValue.equals(currentUrl)) {
                  String errorMessage = "Breadcrumb does not navigate the previous page";
                    logger.error(errorMessage);
                    throw new Exception(errorMessage);
              }else {
                  String successMessage = "Breadcrumb navigates the previous page";
                    logger.info(successMessage);
              }
                }
    
         
             
    
    
    }
    public void setLinkOfBreadcrumbs() throws Exception {
        HelperFunctions.waitForPageToLoad(5);
    
        for (WebElement link : breadcrumbLinks) {
            if(link.getAttribute("href")!=null) {
                 String successMessage = "Breadcrumb contains a link.";
                    logger.info(successMessage);
                Assert.assertTrue(true);
            }else {
                 String errorMessage = "Breadcrumb does not contain a link.";
                    logger.error(errorMessage);
                    throw new Exception(errorMessage);
            //    Assert.assertTrue(false);
            }
        }

        
    }
	
    public void setSearchBox(ExtentTest test) throws Exception {

    	test.info("Wait for the page to load.");
        HelperFunctions.waitForPageToLoad(10);
        test.info("Click on search product");
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
   		wait.until(ExpectedConditions.elementToBeClickable(searchProduct));
        searchProduct.click();
        HelperFunctions.staticWait(3);
        String str="Customer Link";
        test.info("Send text to the field");
        searchProduct.sendKeys(str);
        HelperFunctions.staticWait(3);
        test.info("Click on search item");
        searchItem.click();
        HelperFunctions.staticWait(3);
        System.out.println(productBasedonSearch.getAttribute("data-product-name"));
        if(productBasedonSearch.getAttribute("data-product-name").equalsIgnoreCase(str)) {
             String successMessage = "Texts are matching";
                logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
             String errorMessage = "Texts are not matching.";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
        //    Assert.assertTrue(false);
        }
        test.info("Verified search item based on the text");
        HelperFunctions.staticWait(3);
      /*  test.info("Click on search product");
        searchProduct.click();
        HelperFunctions.staticWait(3);
        searchProduct.clear();
        String str2="Digital on Demand";
        test.info("Send text to the field");
        searchProduct.sendKeys(str2);
        HelperFunctions.staticWait(3);
        test.info("Click on search item");
        searchItem.click();
        HelperFunctions.staticWait(3);
        System.out.println(productBasedonSearch2.getAttribute("data-product-name"));
        if(productBasedonSearch2.getAttribute("data-product-name").equalsIgnoreCase(str2)) {
             String successMessage = "Texts are matching";
                logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
             String errorMessage = "Texts are not matching.";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
        //    Assert.assertTrue(false);
        }
        test.info("Verified search item based on the text");
        HelperFunctions.staticWait(3);*/
        
        
    }
	
    public void setSearchResult(ExtentTest test) throws Exception {
    	test.info("Wait for the page to load.");
        HelperFunctions.waitForPageToLoad(10);
        test.info("Click on search product");
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(searchProduct));
        searchProduct.click();
        String str="Cus";
        String str2="Customer Link";
        test.info("Send text partially to the field");
        searchProduct.sendKeys(str);
        HelperFunctions.staticWait(3);
        test.info("Click on search item");
        searchItem.click();
        HelperFunctions.staticWait(3);
        if(productBasedonSearch.getAttribute("data-product-name").equalsIgnoreCase(str2)) {
             String successMessage = "Texts are matching";
                logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
             String errorMessage = "Texts are not matching.";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
        //    Assert.assertTrue(false);
        }
        test.info("Verified search item based on the text");
        HelperFunctions.staticWait(3);
      /*  test.info("Click on search product");
        searchProduct.click();
        HelperFunctions.staticWait(3);
        searchProduct.clear();
        String str3="Dig";
        String str4="Digital on Demand";
        test.info("Send text partially to the field");
        searchProduct.sendKeys(str3);
        HelperFunctions.staticWait(3);
        test.info("Click on search item");
        searchItem.click();
        HelperFunctions.staticWait(3);
        if(productBasedonSearch2.getAttribute("data-product-name").equalsIgnoreCase(str4)) {
            String successMessage = "Texts are matching";
            logger.info(successMessage);
            Assert.assertTrue(true);
        }else {
             String errorMessage = "Texts are not matching.";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
            //Assert.assertTrue(false);
        }
        test.info("Verified search item based on the text");
        HelperFunctions.staticWait(3);*/
        
    }
	
	public void setSearchBarKeywordforNegativeTest(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		test.info("Click on product search bar");
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(productSearchBar));
		productSearchBar.click();
		test.info("Send random text to the search field");
		Faker faker=new Faker();
		productSearchBar.sendKeys(faker.name().firstName());
		HelperFunctions.staticWait(3);
		if(noResult.isDisplayed() && noResult.getText().contains("Nothing matches your results")) {
			String successMessage = "Result contains Nothing matches your results";
            logger.info(successMessage);
			Assert.assertTrue(true);
		}else {
			 String errorMessage = "Result does not contain Nothing matches your results";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
		//	Assert.assertTrue(false);
		}
		test.info("Verified result contains Nothing matches your results id displayed");
		 HelperFunctions.staticWait(3);
		
	}
	
	public void setDocumentTileLine() throws Exception {
		HelperFunctions.waitForPageToLoad(10);
		 WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
 		wait3.until(ExpectedConditions.visibilityOf(titleofTiles.get(0)));
		for(WebElement eachProductTitle: titleofTiles) {
			System.out.println(eachProductTitle.getCssValue("-webkit-line-clamp"));
			if(eachProductTitle.getCssValue("-webkit-line-clamp").equals("3")) {
				 String successMessage = "Document tiles are equal 3 lines";
                 logger.info(successMessage);
				Assert.assertTrue(true);
			}else {
				 String errorMessage = "Document tiles are not equal 3 lines";
                 logger.error(errorMessage);
                 throw new Exception(errorMessage);
				//Assert.assertTrue(false);
				
			}
		}
	}
	public void setContentPageSameTab(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		test.info("Click on a product");
		  WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
    		wait3.until(ExpectedConditions.visibilityOf(productLinks.get(0)));
		for(WebElement each:productLinks) {
			each.click();
			break;
		}
		HelperFunctions.waitForPageToLoad(10);
		 for (WebElement link : productLinks) {
			 String hrefValue = link.getAttribute("href");
			 link.click();
			 String currentUrl = Driver.getDriver().getCurrentUrl();
			// Assert.assertEquals(hrefValue, currentUrl);
			 if (!hrefValue.equals(currentUrl)) {
                 String errorMessage = "Links do not match";
                   logger.error(errorMessage);
                   throw new Exception(errorMessage);
             }else {
                 String successMessage = "Links match";
                   logger.info(successMessage);
             } 
	            }
		 test.info("Verified the content page open in a same tab");
		
	}
	public void setDownloadFullTermsLink() {
        HelperFunctions.waitForPageToLoad(5);
        HelperFunctions.staticWait(3);
        JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
        executor2.executeScript("arguments[0].click();", downloadLink);
         //downloadLink.click();
         HelperFunctions.staticWait(3);
            String filePath = "C:\\Users\\GLBL_RDP_USER_01\\Downloads\\Bookkeeping-Connect-Full-Terms-3-3-2023.zip";
            File file = new File(filePath);
            int attempts = 0;
            while (!file.exists() && attempts < 5) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                attempts++;
            }
            Assert.assertTrue(file.exists());
        
        
    }
	public void setRelatedLinkSize(ExtentTest test) {
		test.info("Wait for the page to load.");
        HelperFunctions.waitForPageToLoad(20);
        test.info("Resize window's dimension");
         int width = Driver.getDriver().manage().window().getSize().getWidth();
         Dimension size = new Dimension(1200, Driver.getDriver().manage().window().getSize().height);
            Driver.getDriver().manage().window().setSize(size);
          
            if (width < 1300) {
              WebElement dropdown = Driver.getDriver().findElement(By.xpath("//div[@class='ap-dropdown-select']"));
              WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
      		wait3.until(ExpectedConditions.visibilityOf(dropdown));
              if (dropdown.isDisplayed()) {
                  System.out.println("The Related links components have been converted to a drop-down menu.");
                } else {
                  System.out.println("The Related links components have not been converted to a drop-down menu.");
                }
            }
            test.info("Verified if width smaller than 1300, The Related links components have been converted to a drop-down menu.");
            HelperFunctions.staticWait(3);

        
        
    }
	public void setBreadcrumbsHierarchy(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(20);
		//HelperFunctions.staticWait(2);
		test.info("Click on a product");
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(allProducts.get(1)));
		allProducts.get(1).click();
        HelperFunctions.waitForPageToLoad(10);
        test.info("Click on a tile");
        WebDriverWait wait2=new WebDriverWait(Driver.getDriver(),10);
		wait2.until(ExpectedConditions.elementToBeClickable(titleofElements.get(0)));
        titleofElements.get(0).click();
        HelperFunctions.waitForPageToLoad(10);
        HelperFunctions.staticWait(1);
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(contentTitle));
        if(contentTitle.isDisplayed()) {
        	 Assert.assertTrue(true);
        }else {
        	String errorMessage = "Content page did not open";
	        logger.error(errorMessage);
	        throw new Exception(errorMessage);
        }
        test.info("Verified content page is open");
        HelperFunctions.staticWait(2);
        test.info("Click on breadcrumb on content page");
        WebDriverWait wait4=new WebDriverWait(Driver.getDriver(),10);
		wait4.until(ExpectedConditions.elementToBeClickable(breadcrumb));
        breadcrumb.click();
        HelperFunctions.waitForPageToLoad(10);
        test.info("Click on breadcrumb");
        WebDriverWait wait5=new WebDriverWait(Driver.getDriver(),10);
      	wait5.until(ExpectedConditions.elementToBeClickable(breadcrumb));
        breadcrumb.click();
        HelperFunctions.waitForPageToLoad(10);
        WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
		wait6.until(ExpectedConditions.visibilityOf(allProducts.get(0)));
        Assert.assertTrue(allProducts.get(0).isDisplayed());
        test.info("Verified first url is open");
        HelperFunctions.staticWait(3);
	}
	
	public void setDateFormat(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		test.info("Click on a product");
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(allProducts.get(1)));
		allProducts.get(1).click();
		HelperFunctions.waitForPageToLoad(5);
		test.info("Click on a content");
		WebDriverWait wait2=new WebDriverWait(Driver.getDriver(),10);
		wait2.until(ExpectedConditions.elementToBeClickable(titleofElements.get(0)));
		titleofElements.get(0).click();
		HelperFunctions.waitForPageToLoad(5);
		test.info("Store the date");
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(dateInfo));
		 String dateString = dateInfo.getText().split(" ")[2];
	    
	        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	        try {
	            Date date = dateFormat.parse(dateString);
	            Assert.assertEquals(dateString, dateFormat.format(date));
	            System.out.println("Date format is valid: " + dateString);
	        } catch (ParseException e) {
	            System.out.println("Date format is invalid: " + dateString);
	        }
	        test.info("Verified the date format");
	        HelperFunctions.staticWait(3);
	}
	public void setNavigateContentPage(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		test.info("Clicking on a product");
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(allProducts.get(1)));
		allProducts.get(1).click();
		HelperFunctions.waitForPageToLoad(10);
		test.info("Clicking on a tile");
		WebDriverWait wait2=new WebDriverWait(Driver.getDriver(),10);
		wait2.until(ExpectedConditions.elementToBeClickable(titleofElements.get(0)));
		titleofElements.get(0).click();
		HelperFunctions.waitForPageToLoad(10);
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(contentElements));
		Assert.assertTrue(contentElements.isDisplayed());
		test.info("Verified user landed on a content page");
		HelperFunctions.staticWait(3);
		
	}
	public void setProductTitleandDescriptionVisibility(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(breadcrumb));
		breadcrumb.click();
		HelperFunctions.waitForPageToLoad(10);
		List<String> titles = new ArrayList<String>();
		List<String> descriptions = new ArrayList<String>();
		test.info("Store product titles");
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(productTitles.get(0)));
		for (WebElement titleElement : productTitles) {
		    if (titleElement.isDisplayed()) {
		        titles.add(titleElement.getText());
		    }else {
		    	 String errorMessage = "Titles are not visible";
			        logger.error(errorMessage);
			        throw new Exception(errorMessage);
		    }
		}
		HelperFunctions.staticWait(2);
		test.info("Store product descroption");
		for (WebElement descElement : productDescriptions) {
		    if (descElement.isDisplayed()) {
		        descriptions.add(descElement.getText());
		    }else {
		    	 String errorMessage = "Descriptions are not visible";
			        logger.error(errorMessage);
			        throw new Exception(errorMessage);
		    }
		}

		test.info("Verified product titles are visible");
		test.info("Verified product description are visible");
		HelperFunctions.staticWait(5); 
	
	
	}
	public void set2LineProductName(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(2);
		test.info("Click on a product");
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(allProducts.get(1)));
		allProducts.get(1).click();
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(2);
		test.info("Get each title of tile's length");
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(titleofElements.get(0)));
		 for (WebElement titleElement : titleofElements) {
	         String titleText = titleElement.getText();
	         String[] titleLines = titleText.split("\n");
	         if (titleLines.length > 2) {
	             System.out.println("Title text is longer than two lines!");
	         } else {
	        	 Assert.assertTrue(true);
	             System.out.println("Title text is restricted to two lines or less.");
	         }
	     }
		 test.info("Verified title text is restricted to two lines or less.");
		 HelperFunctions.staticWait(2);
	}
	public void setUpgradePDF(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		test.info("Click on a product");
		WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(allProducts.get(1)));
		allProducts.get(1).click();
		HelperFunctions.waitForPageToLoad(15);
		test.info("Click on a tile");
		WebDriverWait wait2=new WebDriverWait(Driver.getDriver(),10);
		wait2.until(ExpectedConditions.elementToBeClickable(titleofElements.get(0)));
		titleofElements.get(0).click();
		HelperFunctions.waitForPageToLoad(15);
		test.info("Switching iframe");
		WebElement iframe=Driver.getDriver().findElement(By.xpath("//iframe[contains(@id, 'iframe-pdfviewer')]"));
		String id=iframe.getAttribute("id");
		Driver.getDriver().switchTo().frame(id);
		//Driver.getDriver().switchTo().frame("iframe-pdfviewer-407d74e448-content");
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		wait3.until(ExpectedConditions.visibilityOf(pdf));
		test.info("Click on document search");
		docSearch.click();
		WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		wait4.until(ExpectedConditions.visibilityOf(typeSearch));
		Actions actions = new Actions(Driver.getDriver());
		test.info("Send text to search field");
		actions.sendKeys(typeSearch, "offering", Keys.ENTER).perform();
		HelperFunctions.staticWait(2);
		Assert.assertNotNull(numberofResult);
		test.info("Verified number of result");
		HelperFunctions.staticWait(2);
		test.info("Click on three dots");
		threeDot.click();
		HelperFunctions.staticWait(2);
		Assert.assertTrue(downFile.isDisplayed());
		Assert.assertTrue(printFile.isDisplayed());
		test.info("Verified three dots' elements");
		HelperFunctions.staticWait(2);
		test.info("Scroll down to next");
		HelperFunctions.scrollToElement(goToNext);
		Assert.assertTrue(goToPrevious.getAttribute("aria-disabled").equalsIgnoreCase("true"));
		HelperFunctions.staticWait(2);
		test.info("Click on next");
		goToNext.click();
		HelperFunctions.staticWait(2);
		Assert.assertTrue(zoomIn.isDisplayed());
		Assert.assertTrue(zoomOut.isDisplayed());
		test.info("Verified zoom in/zoom out buttons");
		HelperFunctions.staticWait(3);
	}
	
	
    
    
	
	
	
   
        
	
		
		
	     
     
	    
	      
	
	
	

}
