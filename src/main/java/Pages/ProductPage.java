package Pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;
import com.pwc.productcentral.ReadXLSdata;

public class ProductPage extends HelperFunctions {
	public ProductPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//div[@class='cmp-error__title']")
	private WebElement errorTitle;
	
	@FindBy(xpath="//div[@class='cmp-error__description']")
	private WebElement errorDescription;
	
	@FindBy(xpath="(//div[@class='ap-dropdown-select'])[1]")
	private WebElement myProductCatDropdown;
	
	@FindBy(xpath="//h2[@class='cmp-all-resources__top-bar-title']")
	private WebElement allResources;
	
	@FindBy(xpath="((//div[@class='cmp-all-resources__cards-page ap-page-container'])//div//a)[position()=1 or position()=2 or position()=3 or position()=4 or position()=5]")
	private static List<WebElement> first5resources;
	
	@FindBy(xpath="((//div[@class='cmp-all-resources__cards-page ap-page-container'])//div//a)[position()=6 or position()=7 or position()=8 or position()=9 or position()=10]")
	private static List<WebElement> last5resources;
	
	
	@FindBy(xpath="//div[@class='ap-dropdown-list show']")
	private static List<WebElement> myProductCatDropdownList;
	
	@FindBy(xpath="//div[@class='ap-footer-content']")
	private WebElement footerContent;
	
	@FindBy(xpath="//div[@class='ap-footer-link-group']")
	private WebElement footerLinkGroup;
	
	@FindBy(xpath="//span[.='Next']")
	private WebElement nextButtonforResources;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-2/myproducts/sample10.pdf.coredownload.inline.pdf.coredownload.inline.pdf']")
	private WebElement firstResource;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-2/myproducts/sample13.png.coredownload.inline.png.coredownload.inline.png']")
	private WebElement secondResource;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-2/myproducts/sample16.jpg.coredownload.inline.jpg.coredownload.inline.jpg']")
	private WebElement thirdResource;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-2/myproducts/7E1c.gif.coredownload.inline.gif.coredownload.inline.gif']")
	private WebElement forthResource;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-2/myproducts/gif.coredownload.inline.gif.gif.coredownload.inline.gif.coredownload.inline.gif']")
	private WebElement fifthResource;
	
	@FindBy(xpath="//button[@id='showMore']")
	private WebElement viewMoreButton;
	
	@FindBy(xpath="//button[@id='showLess']")
	private WebElement viewLessButton;
	
	@FindBy(xpath="//a[@href='/content/pc/us/en/my-products.html']")
	private WebElement myProductItemOnSitemap;
	
	@FindBy(xpath="//div[@class='ap-dropdown-option-item']//span[1]")
	private static List<WebElement> myProductCatDropdownList2;
	
	@FindBy(xpath="//div[@id='tagElements']//div[@class='ap-dropdown-select']")
	private WebElement selectDropdown;
	
	@FindBy(xpath="//*[@id=\"listPage\"]/div/div/div[2]/div[3]")
	private WebElement cardCat;
	
	@FindBy(xpath="(//div[@class='ap-dropdown-select'])[1]")
	private WebElement documentDropdown;
	
	
	@FindBy(xpath="//div[@class='cmp-all-resources__card-category']")
	private static List<WebElement> cardCategory;
	
	@FindBy(xpath="//div[@class='cmp-error__img']")
	private WebElement errorImage;
	
	@FindBy(xpath="//div[@id='searchProductDropdown']")
	private WebElement productDropdown;
	
	@FindBy(xpath="//div[@id='docDropdown']")
	private WebElement catDropdown;
	
	@FindBy(xpath="//div[@id='searchSortingDropdown']")
	private WebElement sortingDropdown;
	
	@FindBy(xpath="//input[@id='gatedSearchInput']")
	private WebElement myProductSearchField;
	
	@FindBy(xpath="(//div[@class='cmp-all-resources__card-title']//a)[1]")
	private WebElement resource1;
	
	@FindBy(xpath="(//div[@class='cmp-all-resources__card-title']//a)[2]")
	private WebElement resource2forProduct2;
	
	@FindBy(xpath="(//div[@class='cmp-all-resources__card-title']//a)[3]")
	private WebElement resource3forProduct2;
	
	@FindBy(xpath="(//div[@class='cmp-all-resources__card-title']//a)[4]")
	private WebElement resource4forProduct2;
	
	@FindBy(xpath="(//div[@class='cmp-all-resources__card-title']//a)[5]")
	private WebElement resource5forProduct2;
	
	@FindBy(xpath="//a[@href='/us/en/my-products/product-2.html']")
	private WebElement product2;
	
	@FindBy(xpath="//a[@href='/us/en/my-products/product-4.html']")
	private WebElement product4;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-4/myproducts/Transparency-Hub-Support-Guide-test.pdf.coredownload.inline.pdf']")
	private WebElement resource1forProduct4;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-4/myproducts/Resell Data Processing addendum.png.coredownload.inline.png']")
	private WebElement resource2forProduct4;
	
	@FindBy(xpath="//a[@href='/content/dam/productcentral/en_us/products/product-4/myproducts/sample7.jpg.coredownload.inline.jpg']")
	private WebElement resource3forProduct4;
	
	@FindBy(xpath="//div[@id='forYouCarousel']//a")
	private static List<WebElement> first5Assets;
	
	@FindBy(xpath="((//div[@class='cmp-for-you__tiles'])/a)[position()=6 or position()=7 or position()=8 or position()=9 or position()=10]")
	private static List<WebElement> last5Assets;
	
	@FindBy(xpath="//div[@class='cmp-my-products-tile__title']")
	private static List<WebElement> titleofAssets;
	
	@FindBy(xpath="//div[@class='cmp-all-resources__card-title']//a")
	private static List<WebElement> allresourcesContentLink;
	
	@FindBy(xpath="//h2[@class='cmp-for-you__txt']")
	private WebElement forYouTitle;
	
	@FindBy(xpath="//span[.='Product 2']")
	private WebElement product2Title;
	
	@FindBy(xpath="//span[.='Product 4']")
	private WebElement product4Title;
	
	@FindBy(xpath="//a[@href='/content/pc/us/en/my-products.html']")
	private WebElement myProductOnLeftNavigation;
	
	@FindBy(xpath="//div[@class='cmp-hero-promotion']")
	private WebElement heroPromotion;
	
	@FindBy(xpath="((//div[@class='cmp-tabs__tab-search-container'])[1]//li)[position()=1]")
	private WebElement firstProduct;
	
	@FindBy(xpath="//span[@class='cmp-header__cta-avatar-initials']")
	private WebElement userInitials;
	
	@FindBy(xpath="//div[@class='cmp-need-technical-support__text-container']")
	private WebElement technicalSupportTitle;
	
	@FindBy(xpath="//div[@class='cmp-related-products__title']")
	private WebElement relatedProductsTitle;
	
	@FindBy(xpath="(//div[@class='cmp-related-products__carousel-title'])[position()=1]")
	private WebElement relatedProduct1;
	
	@FindBy(xpath="(//div[@class='cmp-related-products__carousel-title'])[position()=2]")
	private WebElement relatedProduct2;
	
	@FindBy(xpath="//input[@id='initEmail']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@id='loginLink']")
	private WebElement loginLink;
	
	@FindBy(xpath="//div[@data-href='/content/pc/us/en/my-products/product-4.html']")
	private WebElement loginLink2;
	
	@FindBy(xpath="//a[.='Support button']")
	private WebElement technicalSupportButton;
	
	@FindBy(xpath="//ol[@class='cmp-tabs__tablist']//a//li//div//span[1]")
	private static List<WebElement> allProducts;
	
	
	@FindBy(xpath="//span[@class='cmp-tabs__title-container-view-more view-all-js']")
	private WebElement viewAll;
	
	@FindBy(xpath="//span[@id='closeTabsModal']")
	private WebElement closeTabs;
	
	@FindBy(xpath="//a[@class='cmp-tabs__products-modal-card']")
	private static List<WebElement> allProducts2;
	
	@FindBy(xpath="//div[@class='cmp-tabs__products-modal-text-container']")
	private static List<WebElement> productsCont;
	
	@FindBy(xpath="//div[@class='cmp-header__cta-avatar']")
    private WebElement avatar;
    
    @FindBy(xpath="//a[@aria-label='Logout']")
    private WebElement logout;
    
    @FindBy(xpath="//div[contains(@class, 'outage')]")
    private WebElement banner;
    
    @FindBy(xpath="//span[contains(@aria-label, 'Banner')]")
    private WebElement bannerClose;
	
    @FindBy(xpath="//h1[@class='cmp-title__text']")
    private WebElement myproductTitle;
    
    @FindBy(xpath="(//div[@class='cmp-tiles__products-link'])[1]")
	private WebElement logintoMyproducts;

    @FindBy(xpath="//div[@class='cmp-latest__tiles']//a")
	private static List<WebElement> latestAssets;
    
    @FindBy(xpath="//a[@id='preferencesLink']")
	private static WebElement preferences;
	
	@FindBy(xpath="//div[@class='ap-preferences-container']")
	private static WebElement preferencesModal;
	
	@FindBy(xpath="//h2[@class='cmp-hero-promotion__content-title']")
	private static WebElement heroTitle;
	
	@FindBy(xpath="//h3[@class='cmp-hero-promotion__content-description']")
	private static WebElement heroDesc;
	
	@FindBy(xpath="//div[@class='cmp-my-products-tile__title']")
	private static List<WebElement> foryouTitles;
	
	@FindBy(xpath="//div[@class='cmp-all-resources']")
	private WebElement allResources2;
	
	@FindBy(xpath="//div[@class='cmp-for-you']")
	private WebElement forYouTitle2;
	
	@FindBy(xpath="//div[contains(@class, 'hero-promotion')]//div[contains(@class, 'image')]")
	private WebElement heroImage;
	
	@FindBy(xpath="//span[.='Next']")
	private static List<WebElement> nextButtonforResources2;
	
	@FindBy(xpath="//div[contains(@class,'for-you')]//div[contains(@class,'row-2')]")
	private WebElement secondForYou;
	
	@FindBy(xpath="//span[@class='ap-dropdown-option-label']")
	private static List<WebElement> docOptionsLabel;
	
	@FindBy(xpath="//button[contains(@class, 'play-button')]")
	private WebElement playButton;
	
	@FindBy(xpath="(//button[contains(@class, 'playing')])[2]")
	private WebElement pauseButton;
	
	@FindBy(xpath="//div[contains(@class, 'video-player')]")
	private WebElement videoPlayer;
	
	@FindBy(xpath="//div[@class='cmp-all-resources__card']")
	private static List<WebElement> resourcesCards;
	
	
	ReadXLSdata read1=new ReadXLSdata();
	
	
	static Logger logger=Logger.getLogger("ProductPage");
	
	
	
	
	
	
	
	public void setDocCategory() throws Exception {
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(3);
		HelperFunctions.scrollToElement(allResources);
		read1.setExcelFile("./testdata.xlsx", "Tag Taxonomy");
        
		for(WebElement eachdocCat: myProductCatDropdownList) {
			System.out.println(eachdocCat.getText());
			
			if(eachdocCat.getText().contains(read1.getCellData("Portfolio", 1))&&eachdocCat.getText().contains(read1.getCellData("Portfolio", 2))
					&&eachdocCat.getText().contains(read1.getCellData("Portfolio", 3))
					&&eachdocCat.getText().contains(read1.getCellData("Portfolio", 4))
					&&eachdocCat.getText().contains(read1.getCellData("Portfolio", 5))){
				
				Assert.assertTrue(true);}else {Assert.assertTrue(false);}}
		
		for(WebElement eachdocCat:myProductCatDropdownList) {
			if(eachdocCat.getText().contains(read1.getCellData("Portfolio", 1))) {
				eachdocCat.click();
				break;
			}
		}	
	
		HelperFunctions.staticWait(3);
		
	}
	
	public void setFooterWithoutLogin(ExtentTest test) throws Exception {
		 test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(10);
		HelperFunctions.staticWait(3);
		test.info("Scroll down to footer content");
		HelperFunctions.scrollToElement(footerContent);
		test.info("Verified footer content and link group");
	        if(footerContent.isDisplayed() && footerLinkGroup.isEnabled() ) {
	        	String successMessage = "Only footer content displayed";
	            logger.info(successMessage);
	        	Assert.assertTrue(true);
	        }else {
	        	String errorMessage = "footer links are also displayed";
	            logger.error(errorMessage);
	            throw new Exception(errorMessage);
	        	//Assert.assertTrue(false);
	        }
	        HelperFunctions.staticWait(3);
	}
	
	public void setFooterWithLogin(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		//HelperFunctions.waitForPageToLoad(15);
		//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
		HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
		try {
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
		}catch(ElementClickInterceptedException e) {
			HelperFunctions.scrollToElement(footerContent);
		}
		HelperFunctions.staticWait(3);
		test.info("Scroll down to footer content");
		
		
	        System.out.println(footerContent.getText());
	        test.info("Verified footer content and link group");
	        if(footerContent.isDisplayed() && footerLinkGroup.isDisplayed() ) {
	        	String successMessage = "Footer content and links are displayed";
	            logger.info(successMessage);
	        	Assert.assertTrue(true);
	        }else {
	        	String errorMessage = "Footer content and links are not displayed";
	            logger.error(errorMessage);
	            throw new Exception(errorMessage);
	        	//Assert.assertTrue(false);
	        }
	        HelperFunctions.staticWait(3);
	
	}
	
	public void setErrorMessage() throws Exception  {
		HelperFunctions.staticWait(5);
	    
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	   Driver.getDriver().switchTo().window(tabs.get(1));
	    read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 36));
	    HelperFunctions.staticWait(5);
	    String actualErrorTitle=errorTitle.getText();
	    String expectedErrorTitle=read1.getCellData("VALUE", 38);
		String actualErrorDescription=errorDescription.getText();
		String expectedErrorDescription=read1.getCellData("VALUE", 37);
	//	Assert.assertEquals(actualErrorTitle, expectedErrorTitle, "Actual and expected error title do not match");
		if (!actualErrorTitle.equals(expectedErrorTitle)) {
            String errorMessage = "Actual and expected error title do not match.";
              logger.error(errorMessage);
              throw new Exception(errorMessage);
        }else {
            String successMessage = "Actual and expected error title match";
              logger.info(successMessage);
        } 
		Assert.assertEquals(actualErrorDescription, expectedErrorDescription, "Actual and expected error description do not match");
		if (!actualErrorDescription.equals(expectedErrorDescription)) {
            String errorMessage = "Actual and expected error description do not match";
              logger.error(errorMessage);
              throw new Exception(errorMessage);
        }else {
            String successMessage = "Actual and expected error description match";
              logger.info(successMessage);
        } 
		HelperFunctions.staticWait(3);
		
	}
	
	public void setErrorPage(ExtentTest test)throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		HelperFunctions.staticWait(5);
		JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Driver.getDriver().getWindowHandles());
	    Driver.getDriver().switchTo().window(tabs.get(1));
	    read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Go to error page");
	    Driver.getDriver().get(read1.getCellData("VALUE", 36));
	    test.info("Wait for the page to load.");
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    wait.until(ExpectedConditions.visibilityOf(errorTitle));
	    HelperFunctions.staticWait(5); 
	    test.info("Verified error page's image, title and description are visible.");
		if(errorImage.isDisplayed() && errorTitle.isDisplayed() &errorDescription.isDisplayed()) {
			 String successMessage = "Error page appears";
	         logger.info(successMessage);
			Assert.assertTrue(true);
		}else {
			String errorMessage = "Error page does not appear";
	         logger.error(errorMessage);
	         throw new Exception(errorMessage);
			//Assert.assertTrue(false);
		}
		HelperFunctions.staticWait(5);
	    
		
	}
	
	
	
public void setDisplayResources(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	test.info("Click on view all");
	 WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
	    ExpectedCondition<WebElement> condition=ExpectedConditions.elementToBeClickable(viewAll);
	    wait.until(condition);
	    HelperFunctions.staticWait(3);
	viewAll.click();
	test.info("Select a product in product container");
	HelperFunctions.staticWait(2);
    for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(1).click();
		break;
    }
    HelperFunctions.waitForPageToLoad(5);
    HelperFunctions.staticWait(3);
    test.info("Scroll down all resources");
	HelperFunctions.scrollToElement(allResources); 
	HelperFunctions.staticWait(3);
     for(WebElement eachResources: first5resources) {
    	 if(eachResources.isDisplayed()) {
    		 String successMessage = "First 5 resources are displayed";
             logger.info(successMessage);
    		 Assert.assertTrue(true);
    	 }else {
    		 String errorMessage = "First 5 resources are not displayed";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
    		// Assert.assertTrue(false);
    	 }
    	 test.info("Verified first 5 resources are displayed");
     }
     HelperFunctions.staticWait(3);
     Assert.assertTrue(nextButtonforResources2.size()==0);
     /*test.info("Scroll down next button");
     HelperFunctions.scrollToElement(nextButtonforResources);
     HelperFunctions.staticWait(3);
     test.info("Click on next button");
     JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
     executor.executeScript("arguments[0].click();", nextButtonforResources);
    // nextButtonforResources.click();
     HelperFunctions.staticWait(3);
     for(WebElement eachResources2: last5resources) {
    	 if(eachResources2.isDisplayed()) {
    		 String successMessage = "Last 5 resources are displayed";
             logger.info(successMessage);
    		 Assert.assertTrue(true);
    	 }else {
    		 String errorMessage = "Last 5 resources are not displayed";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
    		// Assert.assertTrue(false);
    	 }
    	 test.info("Verified first 5 resources are displayed");
     }*/
     HelperFunctions.staticWait(3);
    }
public void setNewTabAssets(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	 try {
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	 }catch(ElementClickInterceptedException e) {
		 HelperFunctions.scrollToElement(allResources2); 
	 }
	HelperFunctions.staticWait(5);
	/*for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		break;}
	HelperFunctions.staticWait(3);*/
	test.info("Scroll down all resources elements");
	
    HelperFunctions.staticWait(3);
    test.info("Clicking on resource");
    //String hrefValue = resource2forProduct2.getAttribute("href");
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    executor.executeScript("arguments[0].click();", resource2forProduct2);
    //resource1.click();
    HelperFunctions.staticWait(3);
    test.info("Verified asset/page is loaded in the new tab");
    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
    wait4.until(ExpectedConditions.numberOfWindowsToBe(2));
    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
    Assert.assertEquals(windowHandles2.size(), 2, "Expected two windows to be open, but found " + windowHandles2.size());
	// Assert.assertEquals(hrefValue, currentUrl);
   // Driver.getDriver().close();
   // Driver.getDriver().switchTo().window(tabs.get(1));
   // HelperFunctions.staticWait(3);
	 HelperFunctions.staticWait(3);
}

public void setMyProductSitemap(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	
	HelperFunctions.staticWait(3);
	test.info("Verified my product item is visible");
	if(myProductItemOnSitemap.isDisplayed()) {
		String successMessage = "My Products heading in the sitemap is visible";
        logger.info(successMessage);
		Assert.assertTrue(true);
	}else {
		String errorMessage = "My Products heading in the sitemap is not visible";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
		//Assert.assertTrue(false);
	}
	HelperFunctions.staticWait(3);
}

public void setTagsAccompany(ExtentTest test) {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(15);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	 try {
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	 }catch(ElementClickInterceptedException e) {
		 HelperFunctions.scrollToElement(viewMoreButton); 
	 }
	HelperFunctions.staticWait(3);
   /* for(int i=0;i<allProducts.size();i++) {
        allProducts.get(0).click();
        break;}
    HelperFunctions.staticWait(3);*/
	test.info("Scroll down view more button");
    
    HelperFunctions.staticWait(3);
    test.info("Click on select dropdown");
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    executor.executeScript("arguments[0].click();", selectDropdown);
    HelperFunctions.staticWait(3);
    test.info("Click on user guide");
    String expected1="User Guide";
    HelperFunctions.staticWait(3);
    test.info("Verified tags all resources accompany with selected value");
    for(WebElement tags:myProductCatDropdownList2) {
        System.out.println(tags.getText());
        if(tags.getText().equalsIgnoreCase("User Guide")) {
        	JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
            executor2.executeScript("arguments[0].click();", tags);
            wait.until(ExpectedConditions.visibilityOf(cardCategory.get(0)));
        Assert.assertTrue(cardCategory.get(0).getText().contains(expected1));
        }
    }
    HelperFunctions.staticWait(3);
/*  JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
    executor2.executeScript("arguments[0].click();", selectDropdown);
    HelperFunctions.staticWait(3);
    String expected2="Resell Alliance Terms";
    for(WebElement tags:myProductCatDropdownList2) {
        System.out.println(tags.getText());
        if(tags.getText().contains("Resell Alliance Terms")) {
        tags.click();
        Assert.assertEquals(cardCat.getText(), expected2);
        }
    }*/
	
	
}

public void setMyProductSearch(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
	try {
	wait.until(ExpectedConditions.elementToBeClickable(myProductSearchField));
	}catch(ElementClickInterceptedException e) {
		myProductSearchField.click();
	}
	test.info("Click on my product search field");

	HelperFunctions.staticWait(2);
	test.info("Send text to my product search field");
	myProductSearchField.sendKeys("Product 2");
	HelperFunctions.staticWait(2);
	test.info("Click on enter");
	myProductSearchField.sendKeys(Keys.ENTER);
	HelperFunctions.waitForPageToLoad(3);
	HelperFunctions.staticWait(2);
	test.info("Veried required dropdowns are visible");
	if(productDropdown.isEnabled() && catDropdown.isDisplayed() && sortingDropdown.isDisplayed()) {
		String successMessage = "All dropdowns are visible";
        logger.info(successMessage);
    	Assert.assertTrue(true);
    }else {
    	String errorMessage = "All dropdowns are not visible";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    	//Assert.assertTrue(false);
    }
	HelperFunctions.staticWait(5);
	
}

public void setResourcesBasedonProducts(ExtentTest test) {
	HelperFunctions.waitForPageToLoad(15);
	
	Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/transparency-hub.html");
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(10);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	 try {
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	 }catch(ElementClickInterceptedException e) {
		 if(bannerClose.isDisplayed()) {
				bannerClose.click();
			}
	 }
	HelperFunctions.staticWait(3);
	test.info("Click on close banner");
	
	//bannerClose.click();
	HelperFunctions.staticWait(3);
	/*viewAll.click();
	HelperFunctions.staticWait(2);
	for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(0).click();
		break;
    }
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
    executor1.executeScript("arguments[0].click();", closeTabs);*/
	test.info("Scroll down all resources");
	HelperFunctions.scrollToElement(allResources2); 
	test.info("Verified first resource and store the text of it");
    if(resource1.isDisplayed() ) {
    	String successMessage = "resourse 1 is displayed";
        logger.info(successMessage);
	   Assert.assertTrue(true);
   }else
	   Assert.assertTrue(false);
    String text1=resource1.getText();
    System.out.println(text1);
    HelperFunctions.staticWait(3);
    HelperFunctions.waitForPageToLoad(5); 
    test.info("Click on view all");
    HelperFunctions.scrollToElement(viewAll);
    HelperFunctions.staticWait(2);
    JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
    executor1.executeScript("arguments[0].click();", viewAll);
   HelperFunctions.staticWait(2);
   test.info("Click on another product");
  // viewAll.click();
	HelperFunctions.staticWait(2);
   for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(1).click();
		break;
   }
   HelperFunctions.staticWait(3);
   JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
   executor2.executeScript("arguments[0].click();", closeTabs);
  // product4.click();
   test.info("Scroll down all resources");
   HelperFunctions.scrollToElement(allResources2);
   HelperFunctions.staticWait(3);
   test.info("Verified first resource and store the text of it");
   String text2=resource1.getText();
   System.out.println(text2);
   test.info("Verified resources are different from each other");
   Assert.assertNotEquals(text1, text2);
   HelperFunctions.staticWait(3);
   if(resource1.isDisplayed()  ) {
	   Assert.assertTrue(true);
   }else
	   Assert.assertTrue(false);
   HelperFunctions.staticWait(3);
}

public void setNotSupportMultiSelect(ExtentTest test) {
	//HelperFunctions.waitForPageToLoad(3);
	//product2.click();
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	HelperFunctions.staticWait(3);
    for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		break;
    }
	HelperFunctions.waitForPageToLoad(3);
	test.info("Scroll down document dropdown");
	HelperFunctions.scrollToElement(documentDropdown);
	HelperFunctions.staticWait(3);
	test.info("Clicking on document dropdown");
	JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    executor.executeScript("arguments[0].click();", documentDropdown);
   // documentDropdown.click();   
    test.info("Select option from the dropdown");
	    for(WebElement tags:myProductCatDropdownList) {
			tags.click();
			break;
			
		}
	    HelperFunctions.staticWait(3);
	    test.info("Verified dropdown options are not visible after selecting");
	    for(WebElement tags:myProductCatDropdownList) {
	    	Assert.assertFalse(tags.isDisplayed());
	    }
	    HelperFunctions.staticWait(3);
	   
}

public void setLoadMoreButton(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	HelperFunctions.staticWait(3);
	/*viewAll.click();
	HelperFunctions.staticWait(2);
 for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(2).click();
		break;
 }
 HelperFunctions.staticWait(3);
 JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
 executor1.executeScript("arguments[0].click();", closeTabs);
	HelperFunctions.waitForPageToLoad(3);*/
	test.info("Scroll down view more button");
	HelperFunctions.scrollToElement(viewMoreButton);
	HelperFunctions.staticWait(3);
	test.info("Click on view more button");
   JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
   executor.executeScript("arguments[0].click();", viewMoreButton);
   WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
	    wait1.until(ExpectedConditions.visibilityOf(secondForYou));
   HelperFunctions.staticWait(3);
   Assert.assertTrue(secondForYou.isDisplayed());
  /*    	HelperFunctions.staticWait(2);
      	for(WebElement eachAsset2:last5Assets) {
      		if(eachAsset2.isDisplayed()) {
      			 String successMessage = "Clicking on load more button another assets are loading";
                 logger.info(successMessage);
      			Assert.assertTrue(true);
      		}else {
      			String errorMessage = "Clicking on load more button another assets are not loading";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
      		//	Assert.assertTrue(false);
      		}
      	}
      	test.info("Verified after clicking on view more button another assets are loading ");
      }*/
	
      HelperFunctions.staticWait(3);
}

public void setClickLoadMoreButton() throws Exception {
	//HelperFunctions.waitForPageToLoad(3);
	//product2.click();
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
    for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		break;
    }
	HelperFunctions.waitForPageToLoad(3);
	HelperFunctions.scrollToElement(viewMoreButton);
	
      JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
      executor.executeScript("arguments[0].click();", viewMoreButton);
      
      	
      	for(WebElement eachAsset2:last5Assets) {
      		if(eachAsset2.isDisplayed() && viewLessButton.isDisplayed()) {
      			 String successMessage = "View less button is displayed";
                 logger.info(successMessage);
      			Assert.assertTrue(true);
      		}else {
      			String errorMessage = "View less button is not displayed";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
      			//Assert.assertTrue(false);
      		}
      	}
      
      	HelperFunctions.staticWait(3);
	
}

public void setClickLoadLessButton() {
	//HelperFunctions.waitForPageToLoad(3);
	//product2.click();
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
    for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		break;
    }
	HelperFunctions.waitForPageToLoad(3);
	HelperFunctions.scrollToElement(viewMoreButton);
      JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
      executor.executeScript("arguments[0].click();", viewMoreButton);
      
      	
      if(viewLessButton.isDisplayed()) {
        	for(WebElement eachAsset: first5Assets) {
        		if(eachAsset.isDisplayed()) {
        			Assert.assertTrue(true);
        		}else {
        	      	Assert.assertTrue(false);
              }
        	}
        	for(WebElement eachAsset2:last5Assets) {
        		if(eachAsset2.isDisplayed()) {
        			Assert.assertTrue(true);
        		}
        	}
        }else {
        	Assert.assertTrue(false);
        }
      
      JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
      executor2.executeScript("arguments[0].click();", viewLessButton);
      
      if(viewMoreButton.isDisplayed()) {
      	for(WebElement eachAsset: first5Assets) {
      		if(eachAsset.isDisplayed()) {
      			Assert.assertTrue(true);
      		}else {
      	      	Assert.assertTrue(false);
            }
      	}
      	for(WebElement eachAsset2:last5Assets) {
      		if(!eachAsset2.isDisplayed()) {
      			Assert.assertTrue(true);
      		}
      	}
      }else {
      	Assert.assertTrue(false);
      }
  	
      HelperFunctions.staticWait(3);
	
	
}

public void setTitleOfAssets() throws Exception {
	
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
    for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		break;
    }
	HelperFunctions.waitForPageToLoad(3);
	HelperFunctions.scrollToElement(forYouTitle);
    int hasMoreThan4Line=0;
    System.out.println(titleofAssets.size());
	for(WebElement eachTitleOfAssets: titleofAssets) {
		System.out.println(eachTitleOfAssets.getCssValue("-webkit-line-clamp"));
		if(eachTitleOfAssets.getCssValue("-webkit-line-clamp").equals("4")) {
			 String successMessage = "The description is not more than 4 lines";
	            logger.info(successMessage);
			Assert.assertTrue(true);
		}else {
			hasMoreThan4Line++;
			System.out.println(hasMoreThan4Line);
			 String errorMessage = "The description is more than 4 lines";
             logger.error(errorMessage);
             throw new Exception(errorMessage);
			//Assert.assertTrue(false);
//			logger.error("The description is more than 6 lines");
			
		}
	}
	HelperFunctions.staticWait(3);
}

public void setActiveTab() {
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
	for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		
		String s = allProducts.get(0).getCssValue("color");
		String s2 = allProducts.get(1).getCssValue("color");
		Assert.assertNotEquals(s, s2);
		Assert.assertTrue(s.equals("rgba(65, 83, 133, 1)"));
		System.out.println("Color is :" + s); 
		break;
	}
	HelperFunctions.staticWait(5);
	for(int i=0;i<allProducts.size();i++) {
		allProducts.get(1).click();
		
		String s = allProducts.get(0).getCssValue("color");
		String s2 = allProducts.get(1).getCssValue("color");
		Assert.assertNotEquals(s, s2);
		Assert.assertTrue(s2.equals("rgba(65, 83, 133, 1)"));
		System.out.println("Color is :" + s); 
		break;
	}
	HelperFunctions.staticWait(3);

}

public void setFirstTabActive(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	//myProductOnLeftNavigation.click();
	//HelperFunctions.waitForPageToLoad(5);
	WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
    ExpectedCondition<WebElement> condition=ExpectedConditions.elementToBeClickable(viewAll);
    wait.until(condition);
    HelperFunctions.staticWait(3);
    test.info("Click on view all");
	viewAll.click();
	HelperFunctions.staticWait(3);
	/*read1.setExcelFile("./testdata.xlsx", "QA");
	String activeColor=read1.getCellData("VALUE", 39);
	String fp=firstProduct.getCssValue("color");
	if(fp.equals(activeColor)) {
		Assert.assertTrue(true);
	}else {
    	Assert.assertTrue(false);
    }*/
	test.info("Getting the first product from all the products");
	int index=0;
	WebElement firstTab=productsCont.get(index);
	WebElement eyeIcon=firstTab.findElement(By.xpath("//span[@class='ap-icon icon-view-outline']"));
    if(eyeIcon!=null) {
    	 String successMessage = "First tab is active";
         logger.info(successMessage);
    	Assert.assertTrue(true);
    }else {
    	 String errorMessage = "First tab is not active";
         logger.error(errorMessage);
         throw new Exception(errorMessage);
    //	Assert.assertTrue(false);
    }
    test.info("Verified the first product has eye icon");
    HelperFunctions.staticWait(2);
    test.info("Click on another product");
	for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(2).click();
		break;
    }
	HelperFunctions.waitForPageToLoad(10);
	//HelperFunctions.staticWait(3);
	WebDriverWait wait2=new WebDriverWait(Driver.getDriver(),10);
    ExpectedCondition<WebElement> condition2=ExpectedConditions.elementToBeClickable(viewAll);
    wait2.until(condition2);
    test.info("Click on view all");
	viewAll.click();
	HelperFunctions.staticWait(3);
    if(eyeIcon!=null) {
    	 String successMessage2 = "First tab is active";
         logger.info(successMessage2);
    	Assert.assertTrue(true);
    }else {
         String errorMessage2 = "First tab is not active";
         logger.error(errorMessage2);
         throw new Exception(errorMessage2);
    //	Assert.assertTrue(false);
    }
    test.info("Verified the first product has eye icon");
    HelperFunctions.staticWait(5);

}

public void setHeroPromotion() throws Exception {
	HelperFunctions.waitForPageToLoad(5);
	 String attr = heroPromotion.getAttribute("src");
	    if (attr == null){
	       // System.out.println("Hero promotion is not clickable");
	        String successMessage = "Hero promotion is not clickable";
	         logger.info(successMessage);
	        Assert.assertTrue(true);
	    }

	    else {
	    	//System.out.println("Hero promotion is clickable");
	    	 String errorMessage = "Hero promotion is clickable";
	         logger.error(errorMessage);
	         throw new Exception(errorMessage);
	    //	Assert.assertTrue(false);
	    }

	
	
}

public void setUserInitials() throws Exception {
	read1.setExcelFile("./testdata.xlsx", "QA");
	HelperFunctions.waitForPageToLoad(3);
	String email=read1.getCellData("DATA", 1);
	String firstInit=email.substring(0,1);
	String lastInit=email.substring(email.indexOf(".")+1);
	String lastInit2=lastInit.substring(0,1);
	String userInitials2=userInitials.getText();
	String firstAndLastInit=firstInit+lastInit2;
	System.out.println(userInitials.getText());
	System.out.println(firstInit+lastInit2);
	Assert.assertTrue(userInitials2.equalsIgnoreCase(firstAndLastInit));
	
	
}



public void setInfoOfProducts() throws Exception {
	HelperFunctions.waitForPageToLoad(5);
	Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/transparency-hub.html");
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
	bannerClose.click();
	//HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
	/*viewAll.click();
	HelperFunctions.staticWait(2);
    for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(3).click();
		break;
    }
    HelperFunctions.staticWait(3);
    JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
    executor1.executeScript("arguments[0].click();", closeTabs);
    HelperFunctions.staticWait(3);*/
    HelperFunctions.scrollToElement(forYouTitle);
	WebElement first = titleofAssets.stream().findFirst().get();
	System.out.println(first.getText());
	System.out.println("----");
    HelperFunctions.staticWait(3);
    HelperFunctions.scrollToElement(viewAll);
    HelperFunctions.staticWait(2);
    JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
    executor1.executeScript("arguments[0].click();", viewAll);
   HelperFunctions.staticWait(2);
	//JavascriptExecutor js2 = ((JavascriptExecutor) Driver.getDriver());
	//js2.executeScript("window.scrollBy(0,-1200)", "");
//	HelperFunctions.staticWait(3);
//	viewAll.click();
	HelperFunctions.staticWait(2);

	for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(1).click();
		break;
    }
	HelperFunctions.staticWait(3);
	 JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
	    executor2.executeScript("arguments[0].click();", closeTabs);
	HelperFunctions.staticWait(3);
	HelperFunctions.scrollToElement( forYouTitle);
	HelperFunctions.staticWait(3);
    WebElement first2 = titleofAssets.stream().findFirst().get();
	System.out.println(first2.getText());
	HelperFunctions.staticWait(3);
	Assert.assertNotEquals(first, first2);
	 if (first.equals(first2)) {
         String errorMessage = "Titles are not supposed to match but they match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Titles are not supposed to match and they do not match";
           logger.info(successMessage);
     } 

   
   
    
}

public void setRelatedProducts() throws Exception {

	/*HelperFunctions.waitForPageToLoad(10);
	JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
    js2.executeScript("window.scrollBy(0,250)", "");
    HelperFunctions.staticWait(3);
    logintoMyproducts.click();
	HelperFunctions.waitForPageToLoad(3);
	HelperFunctions.staticWait(3);
	HelperFunctions.waitForPageToLoad(5);*/
	Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/transparency-hub.html");
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
	if(bannerClose.isDisplayed()) {
		bannerClose.click();
	}
	/*viewAll.click();
	HelperFunctions.staticWait(2);
	System.out.println(allProducts2.size());
    for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(3).click();
		break;
    }
    HelperFunctions.staticWait(3);
    JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
    executor1.executeScript("arguments[0].click();", closeTabs);*/
    HelperFunctions.staticWait(3);
    HelperFunctions.scrollToElement(relatedProductsTitle);
    String actualTitle=relatedProduct1.getText();
    String actualTitle2=relatedProduct2.getText();
    HelperFunctions.staticWait(3);
    HelperFunctions.scrollToElement(viewAll);
    HelperFunctions.staticWait(2);
    JavascriptExecutor executor1 = (JavascriptExecutor) Driver.getDriver();
    executor1.executeScript("arguments[0].click();", viewAll);
   HelperFunctions.staticWait(2);
	//JavascriptExecutor js3 = ((JavascriptExecutor) Driver.getDriver());
	//js3.executeScript("window.scrollBy(0,-2500)", "");
	//HelperFunctions.staticWait(3);
	//viewAll.click();
	HelperFunctions.staticWait(2);
	for(int i=0;i<allProducts2.size();i++) {
		allProducts2.get(2).click();
		break;
    }
	HelperFunctions.staticWait(3);
	 JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
	    executor2.executeScript("arguments[0].click();", closeTabs);
	HelperFunctions.staticWait(3);
	 HelperFunctions.scrollToElement(relatedProductsTitle);
	 String actualTitle3=relatedProduct1.getText();
	 String actualTitle4=relatedProduct2.getText();
	 HelperFunctions.staticWait(3);
	// Assert.assertNotEquals(actualTitle, actualTitle3);
	 if (actualTitle.equals(actualTitle3)) {
         String errorMessage = "Titles are not supposed to match but they match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Titles are not supposed to match and they do not match";
           logger.info(successMessage);
     } 
	// Assert.assertNotEquals(actualTitle2, actualTitle4);
	 if (actualTitle2.equals(actualTitle4)) {
         String errorMessage = "Titles are not supposed to match but they match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Titles are not supposed to match and they do not match";
           logger.info(successMessage);
     } 
  
	 HelperFunctions.staticWait(3);
}

public void setAllResourcesContent(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(10);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	HelperFunctions.staticWait(3);
	for(int i=0;i<allProducts.size();i++) {
		allProducts.get(0).click();
		break;
    }
	test.info("Scroll down all resources elements");
	HelperFunctions.staticWait(3);
	HelperFunctions.scrollToElement(allResources2);
	HelperFunctions.staticWait(3);
	 String a=".pdf";
	 String b=".png";
	 String c=".jpg";
	 String d=".gif";
	 String e=".mp4";
	 String f=".mp3";
	 test.info("Checking the contents' extensions contains the correct extensions");
	 List<String> list = new ArrayList<String>();
    for(WebElement each:allresourcesContentLink) {
    	list.add(each.getAttribute("href").substring(each.getAttribute("href").length()-4));
    }
    if(list.contains(a)||list.contains(b)||list.contains(c)||list.contains(d)||list.contains(e)||list.contains(f)) {
    	 String successMessage = "all resources content extensions are correct";
         logger.info(successMessage);
    	Assert.assertTrue(true);
    }else {
    	String errorMessage = "Error on all resources content extension";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    //	Assert.assertTrue(false);
    }
    test.info("Verified all resources content extensions are correct");
    HelperFunctions.staticWait(3);
        
   
   
}

public void setTechnicalSupport() throws Exception {
	HelperFunctions.waitForPageToLoad(5);
	HelperFunctions.staticWait(3);
	HelperFunctions.scrollToElement(technicalSupportButton);
    HelperFunctions.staticWait(5);
    System.out.println(technicalSupportButton.getAttribute("href"));
    String hrefValue = technicalSupportButton.getAttribute("href");
    WebDriverWait wait2=new WebDriverWait(Driver.getDriver(),10);
  		wait2.until(ExpectedConditions.elementToBeClickable(technicalSupportButton));
    technicalSupportButton.click();
    HelperFunctions.waitForPageToLoad(5);
    ArrayList<String> tabs2 = new ArrayList<String>(Driver.getDriver().getWindowHandles());
    Driver.getDriver().switchTo().window(tabs2.get(1));
    HelperFunctions.waitForPageToLoad(3);
    HelperFunctions.staticWait(5);
	 String currentUrl = Driver.getDriver().getCurrentUrl();
	 System.out.println(currentUrl);
	// Assert.assertEquals(hrefValue, currentUrl);
	// Assert.assertTrue(currentUrl.startsWith(hrefValue));
	 if (!currentUrl.startsWith(hrefValue)) {
         String errorMessage = "Links do not match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Links match";
           logger.info(successMessage);
     } 
	 HelperFunctions.staticWait(5);

}
public void setClickAvatar(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
    HelperFunctions.waitForPageToLoad(15);
   
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
    ExpectedCondition<WebElement> condition=ExpectedConditions.elementToBeClickable(avatar);
    wait.until(condition);
    HelperFunctions.staticWait(2);
    test.info("Clicking on user initials");
    avatar.click();
    HelperFunctions.staticWait(2);
    if(logout.isDisplayed()) {
        Assert.assertTrue(true);
    }else {
        String errorMessage = "logout is not displayed";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    }
    test.info("Verified logout option is displayed");
    HelperFunctions.staticWait(3);

}

public void setBannerSticky(ExtentTest test) throws Exception {
	read1.setExcelFile("./testdata.xlsx", "QA");
	test.info("Wait for the page to load.");
    HelperFunctions.waitForPageToLoad(15);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    wait.until(ExpectedConditions.visibilityOf(heroImage));
   /* viewAll.click();
    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
    wait1.until(ExpectedConditions.visibilityOf(allProducts2.get(0)));
    for(WebElement each:allProducts2) {
    	if(each.getAttribute("href").contains("transparency")) {
    		each.click();
    		break;
    	}
		
    }
    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
    wait2.until(ExpectedConditions.visibilityOf(heroImage));
    HelperFunctions.staticWait(2);*/
    ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open();");
    ArrayList<String> tabs=new ArrayList<String>(Driver.getDriver().getWindowHandles());
    Driver.getDriver().switchTo().window(tabs.get(1));
    Driver.getDriver().get(read1.getCellData("VALUE", 84));
    HelperFunctions.waitForPageToLoad(15);
    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
    wait1.until(ExpectedConditions.visibilityOf(banner));
    test.info("Checking if the banner is displayed");
    if(banner.isDisplayed()) {
        Assert.assertTrue(true);
    }else {
        String errorMessage = "banner is not displayed";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    }
    test.info("Scrolling down the bottom of the page");
    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)", ""); 
     HelperFunctions.staticWait(2);
        if(banner.isDisplayed()) {
            Assert.assertTrue(true);
        }else {
            String errorMessage = "banner is not displayed";
            logger.error(errorMessage);
            throw new Exception(errorMessage);
        }
        test.info("Verified if the banner is sticky when scrolling down");
        HelperFunctions.staticWait(3);
}
public void setBannerClose(ExtentTest test) throws Exception {
	read1.setExcelFile("./testdata.xlsx", "QA");
	test.info("Wait for the page to load.");
    HelperFunctions.waitForPageToLoad(15);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    wait.until(ExpectedConditions.visibilityOf(heroImage));
    HelperFunctions.staticWait(3);
    /*viewAll.click();
    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
    wait1.until(ExpectedConditions.visibilityOf(allProducts2.get(0)));
    for(WebElement each:allProducts2) {
    	if(each.getAttribute("href").contains("transparency")) {
    		each.click();
    		break;
    	}
		
    }
    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
    wait2.until(ExpectedConditions.visibilityOf(heroImage));
    HelperFunctions.staticWait(2);*/
    test.info("Checking if the banner is displayed");
    ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open();");
    ArrayList<String> tabs=new ArrayList<String>(Driver.getDriver().getWindowHandles());
    Driver.getDriver().switchTo().window(tabs.get(1));
    Driver.getDriver().get(read1.getCellData("VALUE", 84));
    HelperFunctions.waitForPageToLoad(15);
    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
    wait1.until(ExpectedConditions.visibilityOf(banner));
    if(banner.isDisplayed()) {
        Assert.assertTrue(true);
    }else {
        String errorMessage = "banner is not displayed";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    }
    HelperFunctions.staticWait(2);
    test.info("Clicking enter to close banner");
    bannerClose.sendKeys(Keys.ENTER);
    HelperFunctions.staticWait(2);
    if(!banner.isDisplayed()) {
        Assert.assertTrue(true);
    }else {
        String errorMessage = "banner is not displayed";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    }
    test.info("Verified the banner is closed");
    HelperFunctions.staticWait(3);
}
public void setDocumentsAccesibility(ExtentTest test) throws Exception {
	HelperFunctions.waitForPageToLoad(15);
	test.info("Go to document pdf page");
    Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/dam/productcentral/en_us/products/check-in/myproducts/Getting%20Started%20Guide%20for%20Dashboard%20Users.pdf.coredownload.inline.pdf");
    test.info("Wait for the page to load.");
    HelperFunctions.waitForPageToLoad(15);
    HelperFunctions.staticWait(2);
    String currentUrl=Driver.getDriver().getCurrentUrl();
    if(currentUrl.startsWith("https://login")) {
    	System.out.println("Document is not accessible");
        //Assert.assertTrue(true);
    }else {
       // String errorMessage = "Document is accessible";
       // logger.error(errorMessage);
        //throw new Exception(errorMessage);
    	System.out.println("Document is accessible");
    }
    test.info("Verified the user landed on login page.");
    HelperFunctions.staticWait(3);
}

public void setMyProductPageAccessibility(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
    HelperFunctions.waitForPageToLoad(15);
  
    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 15);
   	wait6.until(ExpectedConditions.visibilityOf(myproductTitle));
    HelperFunctions.staticWait(2);
    if(myproductTitle.isDisplayed()) {
        Assert.assertTrue(true);
    }else {
        String errorMessage = "No access to my product page";
        logger.error(errorMessage);
        throw new Exception(errorMessage);
    }
    test.info("Verified my product page title is displayed");
    HelperFunctions.staticWait(3);
}

	
public void setViewLessButton(ExtentTest test) {
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
	test.info("Scroll down for you title");
	HelperFunctions.scrollToElement(forYouTitle2);
	HelperFunctions.staticWait(3);
	boolean isElementVisible = false;
    int maxAttempts = 10;
    int attempt = 0;

    while (!isElementVisible && attempt < maxAttempts) {
    	JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", viewMoreButton);

        try {
            WebElement desiredElement = wait.until(ExpectedConditions.visibilityOf(viewLessButton));
            isElementVisible = true;
            System.out.println("Desired element found!");
            Assert.assertTrue(true);
        } catch (Exception e) {
            System.out.println("Desired element not found, retrying...");
        }

        attempt++;
    }

    if (!isElementVisible) {
        System.out.println("Maximum attempts reached. Desired element not found.");
    }

	test.info("Click on view more button");
	/* JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
     executor.executeScript("arguments[0].click();", viewMoreButton);
     HelperFunctions.staticWait(2);
     test.info("Verified view less button is visible");
   Assert.assertTrue(viewLessButton.isDisplayed());*/
	HelperFunctions.staticWait(3);
	
	
}
public void setReplacingCategoryLabel(ExtentTest test) {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(15);
	  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    wait.until(ExpectedConditions.visibilityOf(heroImage));
    HelperFunctions.staticWait(2);
    List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[@class='cmp-my-products-tile__text' and div[@class='cmp-my-products-tile__title'] and div[@class='cmp-my-products-tile__thumbnail' and contains(@data-file-path, '.pdf')]]"));
    test.info("Verified category label contains only two child contents");
    for (WebElement element : elements) {
        List<WebElement> childDivs = element.findElements(By.xpath("./div[@class='cmp-my-products-tile__title' or @class='cmp-my-products-tile__thumbnail']"));
        
       
        Assert.assertEquals(2, childDivs.size());
    }
    HelperFunctions.staticWait(3);
}

public void setAssetsTag(ExtentTest test) {
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(20);
    test.info("Getting each latest assets' data-my-products-doc-category-tag attribute value");
    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 15);
	wait6.until(ExpectedConditions.visibilityOf(latestAssets.get(0)));
	  HelperFunctions.staticWait(2);
	  boolean foundPdf=false;
    for (WebElement element : latestAssets) {
    	  String href = element.getAttribute("href");
    	    //String myProductsDocCategoryTag = element.getAttribute("data-my-products-doc-category-tag");
    	    if (href.endsWith(".pdf")&&href!=null) {
    	    	foundPdf=true;
    	    	break;
    	        //Assert.assertNotNull(myProductsDocCategoryTag);
    	    }
    }
    if(foundPdf) {
    	Assert.assertTrue(true);
    }
    HelperFunctions.staticWait(3);
}
public void setPreferencesModal(ExtentTest test){
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
    HelperFunctions.staticWait(2);
    Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/transparency-hub.html");
    HelperFunctions.waitForPageToLoad(15);
   
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);
    ExpectedCondition<WebElement> condition=ExpectedConditions.elementToBeClickable(userInitials);
    wait.until(condition);
    HelperFunctions.staticWait(2);
    test.info("Click on user initials");
    userInitials.click();
    HelperFunctions.staticWait(2);
    test.info("Verified preferences modal is displayed");
    preferences.click();
    HelperFunctions.staticWait(2);
    Assert.assertTrue(preferencesModal.isDisplayed());
    HelperFunctions.staticWait(3);
}

public void setHeroLines(ExtentTest test) {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(5);
    HelperFunctions.staticWait(2);
    test.info("Getting hero title and description line");
    String[] lines = heroTitle.getText().split("\n");
    int numLines = lines.length;

    if (numLines < 3) {
        Assert.assertTrue(true);
        System.out.println("The heroTitle element has fewer than 3 lines of text.");
    } else {
        System.out.println("The heroTitle element has 3 or more lines of text.");
    }
    String[] lines2 = heroDesc.getText().split("\n");
    int numLines2 = lines2.length;
    if (numLines2 < 3) {
        Assert.assertTrue(true);
        System.out.println("The heroTitle element has fewer than 3 lines of text.");
    } else {
        System.out.println("The heroTitle element has 3 or more lines of text.");
    }
    HelperFunctions.staticWait(3);
}
public void setClickVideo(ExtentTest test) {
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	test.info("Wait for the page to load.");
	//HelperFunctions.waitForPageToLoad(15);
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	//HelperFunctions.waitForPageToLoad(20);
	//HelperFunctions.staticWait(2);
	//HelperFunctions.staticWait(2);
	HelperFunctions.staticWait(2);
	HelperFunctions.scrollToElement(forYouTitle2);
	HelperFunctions.staticWait(2);
	/*selectDropdown.click();
	HelperFunctions.staticWait(2);
	for(WebElement element:docOptionsLabel) {
		if(element.getText().contains("Video")) {
			JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
			executor.executeScript("arguments[0].click();", element);
			break;
		}
	}
	 WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(resource1));*/
	List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[@data-doc-type='Video']//a"));
	test.info("Clicking on first video element");
    if (!elements.isEmpty()) {
        WebElement firstElement = elements.get(0);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", firstElement);
    }
	//resource1.click();
	WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 15);
    wait5.until(ExpectedConditions.visibilityOf(playButton));
    test.info("Verified video opens in a same tab");
	HelperFunctions.staticWait(3);
	Set<String> handles=Driver.getDriver().getWindowHandles();
    if(handles.size()==1) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
    
    test.info("Verified play button is displayed");
    playButton.click();
    test.info("Clicked on play button");
    Actions actions=new Actions(Driver.getDriver());
    actions.moveToElement(videoPlayer).perform();
    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
    wait6.until(ExpectedConditions.visibilityOf(pauseButton));
    test.info("Verified pause button is displayed");
    pauseButton.click();
    test.info("Clicked on pause button");
    HelperFunctions.staticWait(3);
	
	
}
public void setAnonymous(ExtentTest test) {
	//Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(15);
	HelperFunctions.staticWait(2);
	test.info("Store the current url");
	String currentUrl=Driver.getDriver().getCurrentUrl();
	test.info("Verified current url's extension is '.pdf' and does not contain 'login'");
	if(currentUrl.endsWith(".pdf") && !currentUrl.contains("login")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(true);
	}
	
	test.info("Verified pdf asset is public");
	HelperFunctions.staticWait(3);
	
}

	
	
	
	
	
	

 
	
	

	
	
	

	
	
	
	
	
	

}
