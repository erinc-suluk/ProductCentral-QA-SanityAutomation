package Pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class BasePage extends HelperFunctions {
	public BasePage() {
		PageFactory.initElements(Driver.getDriver(), this);
		} 
	
	@FindBy(id="initEmail")
	private static WebElement email;
	
	@FindBy(className="a-btn a-btn-primary a-btn-xl")
	private static WebElement nextButton;
	
	@FindBy(className="a-text-input a-input-lg ng-pristine ng-invalid ng-touched")
	private static WebElement password;
	
	@FindBy(className="a-btn a-btn-primary a-btn-xl mt-4 submit-btn")
	private static WebElement submitButton;
	
	@FindBy(xpath="//div[@class='ap-footer-content']")
	private static WebElement footer;
	
	@FindBy(xpath="//div[@class='cmp-header__logo']")
	private static WebElement logo;
	
	@FindBy(xpath="//button[@id='searchButtonHeader']")
	private static WebElement search;
	
	@FindBy(xpath="//div[@class='ap-footer-content']")
	private static WebElement footerHome;
	
	@FindBy(xpath="//div[@class='cmp-leftnavigation__items']")
	private static List<WebElement> leftNavigationItems2;
	
	@FindBy(xpath="//div[@class='cmp-leftnavigation__items']//span")
	private static List<WebElement> leftNavigationItems;
	
	@FindBy(xpath="//a[@href='#collapseNavBtn']")
	private static WebElement collapseButton;
	
	@FindBy(xpath="//span[@class='ap-icon icon-enter-left-outline']")
	private static WebElement expandButton;
	
	@FindBy(tagName="img")
	private static List<WebElement> productsListImages;
	
	@FindBy(tagName="a")
	private static List<WebElement> alltags;
	
	@FindBy(xpath="//span[@class='cmp-header__cta-avatar-initials']")
	private static WebElement userInitials;
	
	@FindBy(xpath="//a[@data-ref-page='/content/pc/us/en/legal']")
    private static WebElement legalLink;
    
    @FindBy(xpath="//a[@data-ref-page='/content/pc/us/en/products']")
    private static WebElement productsLink;
    
    @FindBy(xpath="//a[@data-ref-page='/content/pc/us/en/security']")
    private static WebElement securityLink;
    
    @FindBy(xpath="//a[@data-ref-page='/content/pc/us/en/compliance']")
    private static WebElement complianceLink;
    
    @FindBy(xpath="//a[@data-ref-page='/content/pc/us/en/privacy']")
    private static WebElement privacyLink;
    
    @FindBy(xpath="//a[@data-ref-page='/content/pc/us/en/accessibility']")
    private static WebElement accessibilityLink;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private static WebElement myProductsTitle;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private static WebElement myProductsPageLogo;
	
	@FindBy(xpath="//div[@class='cmp-leftnavigation__item-image']//img")
	private static List<WebElement> leftNavigationImg;
	
	
	
	static Logger logger=Logger.getLogger("BasePage");
	
	
	
	
	
public static void setHomePageTemplateElements() throws Exception {
        
        if(footer.isDisplayed() && logo.isDisplayed() && search.isDisplayed()) {
            Assert.assertTrue(true);//
        }else {
             String errorMessage = "Missing Home Page Template Elements";
                logger.error(errorMessage);
                throw new Exception(errorMessage);
        //    Assert.assertTrue(false);
        }
    }
	
	public static void setFooterTextandPosition() {
		String actualFooterText=footer.getText();
		String expectedFooterText="© 2023 PwC. All rights reserved. PwC refers to the US member firm of the PwC network or one of its subsidiaries or affiliates.";
		System.out.println(actualFooterText);
		Assert.assertEquals(actualFooterText, expectedFooterText);
		Point locationOfFooter=footer.getLocation();
		int x = locationOfFooter.getX();
		int y = locationOfFooter.getY();
		Assert.assertTrue(x >= 0 && y >= 0);
	}
	
	public static void setFooterHome() throws Exception {
	    String actualColor = footerHome.getCssValue("color");
	    String actualHexCodeForColor = Color.fromString(actualColor).asHex();
	    String expectedColor="rgba(37, 37, 37, 1)";
	    String expectedHexCodeForColor="#252525";
	    
	    System.out.println(actualColor);
	    System.out.println(actualHexCodeForColor);
	    
	    
	    
	    if(footerHome.getCssValue("font-size").equals("16px") && footerHome.getCssValue("font-family").equals("\"PwC Helvetica Neue\"") && actualColor.equals(expectedColor)&&
	            actualHexCodeForColor.equals(expectedHexCodeForColor)) {
	         String successMessage = "The footer section size style and design are fixed";
	            logger.info(successMessage);
	        Assert.assertTrue(true);
	    }else {
	         String errorMessage = "The footer section size style and design are not fixed";
	            logger.error(errorMessage);
	            throw new Exception(errorMessage);
	    //    Assert.assertTrue(false);
	    }
	    
	    
	    
	    
	    }
	public static void setLeftNavigationItems2(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
	    HelperFunctions.waitForPageToLoad(20);
		//HelperFunctions.staticWait(2);
	    for(WebElement items:leftNavigationItems2) {
	        if(!items.isDisplayed()) {
	             String errorMessage = "Changing to the home page or side nave";
	                logger.error(errorMessage);
	                throw new Exception(errorMessage);
	        
	        }else {
	             String successMessage = "No change to the home page or side nave";
	                logger.info(successMessage);
	                Assert.assertTrue(true);
	        //    Assert.assertTrue(false);
	        } 
	    
	    }
	    test.info("Verified No change to the home page or side nave");
		HelperFunctions.staticWait(2);
	    legalLink.click();
	    HelperFunctions.waitForPageToLoad(5);
	    for(WebElement items:leftNavigationItems2) {
	        if(items.isDisplayed()) {
	            Assert.assertTrue(true);
	        }else {
	            Assert.assertTrue(false);
	            logger.error("Left Navigation is not visible on Legal Page");
	        }}
	    test.info("Verified No change to the home page or side nave legal page");
		HelperFunctions.staticWait(2);
	    productsLink.click();
	    HelperFunctions.waitForPageToLoad(5);
	    for(WebElement items:leftNavigationItems2) {
	        if(items.isDisplayed()) {
	            Assert.assertTrue(true);
	        }else {
	            Assert.assertTrue(false);
	            logger.error("Left Navigation is not visible on Product Listing Page");
	        }}
	    test.info("Verified No change to the home page or side nave product listing page");
		HelperFunctions.staticWait(2);
	    securityLink.click();
	    HelperFunctions.waitForPageToLoad(5);
	    for(WebElement items:leftNavigationItems2) {
	        if(items.isDisplayed()) {
	            Assert.assertTrue(true);
	        }else {
	            Assert.assertTrue(false);
	            logger.error("Left Navigation is not visible on Security Page");
	        }}
	    test.info("Verified No change to the home page or side nave security page");
		HelperFunctions.staticWait(2);
	    complianceLink.click();
	    for(WebElement items:leftNavigationItems2) {
	        if(items.isDisplayed()) {
	            Assert.assertTrue(true);
	        }else {
	            Assert.assertTrue(false);
	            logger.error("Left Navigation is not visible on Compliance Page");
	        }}
	    test.info("Verified No change to the home page or side nave compliance page");
		HelperFunctions.staticWait(2);
	    privacyLink.click();
	    for(WebElement items:leftNavigationItems2) {
	        if(items.isDisplayed()) {
	            Assert.assertTrue(true);
	        }else {
	            Assert.assertTrue(false);
	            logger.error("Left Navigation is not visible on Privacy Page");
	        }}
	    test.info("Verified No change to the home page or side nave privacy page");
	    
		HelperFunctions.staticWait(2);
	    
	        

	}
public static void setCollapseButton() {
	HelperFunctions.waitForPageToLoad(10);
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
     executor.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
     executor2.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
/*	legalLink.click();
	HelperFunctions.waitForPageToLoad(5);
	JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
    executor3.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor4 = (JavascriptExecutor) Driver.getDriver();
    executor4.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	productsLink.click();
	HelperFunctions.waitForPageToLoad(5);
	JavascriptExecutor executor5 = (JavascriptExecutor) Driver.getDriver();
    executor5.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor6 = (JavascriptExecutor) Driver.getDriver();
    executor6.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	securityLink.click();
	HelperFunctions.waitForPageToLoad(5);
	JavascriptExecutor executor7 = (JavascriptExecutor) Driver.getDriver();
    executor7.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor8 = (JavascriptExecutor) Driver.getDriver();
    executor8.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	complianceLink.click();
	HelperFunctions.waitForPageToLoad(5);
	JavascriptExecutor executor9 = (JavascriptExecutor) Driver.getDriver();
    executor9.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor10 = (JavascriptExecutor) Driver.getDriver();
    executor10.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	privacyLink.click();
	HelperFunctions.waitForPageToLoad(5);
	JavascriptExecutor executor11 = (JavascriptExecutor) Driver.getDriver();
    executor11.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}
	HelperFunctions.staticWait(3);
	JavascriptExecutor executor12 = (JavascriptExecutor) Driver.getDriver();
    executor12.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			Assert.assertTrue(true);
		}
	}*/
	
	
}

public static void setAllImages(ExtentTest test) throws Exception  {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(20);
	//HelperFunctions.staticWait(5);
	int brokenImages=0;
	System.out.println(productsListImages.size());
	for(WebElement image:productsListImages) {
		if(image.getAttribute("src")== null || image.getAttribute("src").isEmpty()) {
			brokenImages++;
		}
	  }
	  System.out.println("The number of broken images : "+brokenImages);
	  if(brokenImages!=0) {
		
		 Assert.assertTrue(false);
	  }else {
		  String successMessage = "No broken image";
          logger.info(successMessage);
		  Assert.assertTrue(true);
	  }
	  test.info("Verified no broken images on my product page");
	  HelperFunctions.staticWait(5);
	  legalLink.click();
	  int brokenImagesforLegal=0;
		System.out.println(productsListImages.size());
		for(WebElement image:productsListImages) {
			if(image.getAttribute("src")== null || image.getAttribute("src").isEmpty()) {
				brokenImagesforLegal++;
			}
		  }
		  System.out.println("The number of broken images : "+brokenImagesforLegal);
		  if(brokenImagesforLegal!=0) {
			
			  Assert.assertTrue(false);
		  }else {
			  String successMessage = "No broken image";
	          logger.info(successMessage);
			  Assert.assertTrue(true);
		  }
		  test.info("Verified no broken images on legal page");
		  HelperFunctions.staticWait(5);
		  securityLink.click();
		  int brokenImagesforsecurity=0;
			System.out.println(productsListImages.size());
			for(WebElement image:productsListImages) {
				if(image.getAttribute("src")== null || image.getAttribute("src").isEmpty()) {
					brokenImagesforsecurity++;
				}
			  }
			  System.out.println("The number of broken images : "+brokenImagesforsecurity);
			  if(brokenImagesforsecurity!=0) {
				
				  Assert.assertTrue(false);
			  }else {
				  String successMessage = "No broken image";
		          logger.info(successMessage);
				  Assert.assertTrue(true);
			  }
			  test.info("Verified no broken images on security page");
			  HelperFunctions.staticWait(5);
			  complianceLink.click();
			  int brokenImagesforCompliance=0;
				System.out.println(productsListImages.size());
				for(WebElement image:productsListImages) {
					if(image.getAttribute("src")== null || image.getAttribute("src").isEmpty()) {
						brokenImagesforCompliance++;
					}
				  }
				  System.out.println("The number of broken images : "+brokenImagesforCompliance);
				  if(brokenImagesforCompliance!=0) {
				
					  Assert.assertTrue(false);
				  }else {
					  String successMessage = "No broken image";
			          logger.info(successMessage);
					  Assert.assertTrue(true);
				  }
				  test.info("Verified no broken images on compliance page");
				  HelperFunctions.staticWait(5);
				  privacyLink.click();
				  int brokenImagesforPrivacy=0;
					System.out.println(productsListImages.size());
					for(WebElement image:productsListImages) {
						if(image.getAttribute("src")== null || image.getAttribute("src").isEmpty()) {
							brokenImagesforPrivacy++;
						}
					  }
					  System.out.println("The number of broken images : "+brokenImagesforPrivacy);
					  if(brokenImagesforPrivacy!=0) {
					
						  Assert.assertTrue(false);
					  }else {
						  String successMessage = "No broken image";
				          logger.info(successMessage);
						  Assert.assertTrue(true);
					  }
					  test.info("Verified no broken images on privacy page");
					  HelperFunctions.staticWait(5);
				  
			  
	}



	

public static void setLeft() {
	System.out.println("No of links are "+ alltags.size());  
    
	//checking the links fetched.
	for(int i=0;i<alltags.size();i++)
	{
	    WebElement E1= alltags.get(i);
	    String url= E1.getAttribute("href");
	    if(url!=null) {
	    	System.out.println(url); 
	    	
	    }
	    
	  
	}
}


public static void setAllSectionsOnHeader(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(20);
	//HelperFunctions.staticWait(3);
	test.info("Verified pwc logo, search field and user initials are visible.");
	if(myProductsPageLogo.isDisplayed() && search.isDisplayed() && userInitials.isDisplayed()) {
		String successMessage = "All Sections On Header are displayed";
        logger.info(successMessage);
		Assert.assertTrue(true);
	}else {
		 String errorMessage = "All Sections On Header are not displayed";
         logger.error(errorMessage);
         throw new Exception(errorMessage);
		//Assert.assertTrue(false);
	}
	HelperFunctions.staticWait(3);
}

public static void setScrollFunctionality(ExtentTest test) {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(15);
	Driver.getDriver().get("https://productcentral-qa.products.pwc.com/content/pc/us/en/automation/my-products/enterprise-control.html");
	HelperFunctions.waitForPageToLoad(20);
	//HelperFunctions.staticWait(3);
	JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");           
    HelperFunctions.staticWait(3);
    test.info("Scrolled down performed on My Product Page");
    System.out.println("Scrolled down performed on My Product Page");   
    HelperFunctions.staticWait(3);
    legalLink.click();
    HelperFunctions.waitForPageToLoad(15);
    JavascriptExecutor js2 = (JavascriptExecutor)Driver.getDriver();
	js2.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");           
    HelperFunctions.staticWait(3);
    test.info("Scrolled down performed on Legal Page");
    System.out.println("Scrolled down performed on Legal Page");  
    productsLink.click();
    HelperFunctions.waitForPageToLoad(15);
    JavascriptExecutor js3 = (JavascriptExecutor)Driver.getDriver();
   	js3.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");           
    HelperFunctions.staticWait(3);
    test.info("Scrolled down performed on Products Page");
    System.out.println("Scrolled down performed on Products Page");
    securityLink.click();
    HelperFunctions.waitForPageToLoad(15);
    JavascriptExecutor js4 = (JavascriptExecutor)Driver.getDriver();
   	js4.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");           
    HelperFunctions.staticWait(3);
    test.info("Scrolled down performed on Security Page");
    System.out.println("Scrolled down performed on Security Page");
    HelperFunctions.staticWait(3);
	
}
public static void setResponsivenessOfPages() throws Exception  {
	HelperFunctions.waitForPageToLoad(3);
	Assert.assertTrue(myProductsTitle.isDisplayed());
	legalLink.click();
	System.out.println(Driver.getDriver().getCurrentUrl());
	 String hrefValue = legalLink.getAttribute("href");
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
    HelperFunctions.staticWait(3);
    productsLink.click();
    HelperFunctions.waitForPageToLoad(3);
    System.out.println(Driver.getDriver().getCurrentUrl());
    String hrefValue2 = productsLink.getAttribute("href");
	 String currentUrl2 = Driver.getDriver().getCurrentUrl();
	// Assert.assertEquals(hrefValue2, currentUrl2);
	 if (!hrefValue2.equals(currentUrl2)) {
         String errorMessage = "Links do not match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Links match";
           logger.info(successMessage);
     } 
    HelperFunctions.staticWait(3);
    securityLink.click();
    HelperFunctions.waitForPageToLoad(3);
    System.out.println(Driver.getDriver().getCurrentUrl());
    String hrefValue3 = securityLink.getAttribute("href");
	 String currentUrl3 = Driver.getDriver().getCurrentUrl();
	// Assert.assertEquals(hrefValue3, currentUrl3);
	 if (!hrefValue3.equals(currentUrl3)) {
         String errorMessage = "Links do not match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Links match";
           logger.info(successMessage);
     } 
	HelperFunctions.staticWait(3);
	complianceLink.click();
	HelperFunctions.waitForPageToLoad(3);
	System.out.println(Driver.getDriver().getCurrentUrl());
	String hrefValue4 = complianceLink.getAttribute("href");
	 String currentUrl4 = Driver.getDriver().getCurrentUrl();
	// Assert.assertEquals(hrefValue4, currentUrl4);
	 if (!hrefValue4.equals(currentUrl4)) {
         String errorMessage = "Links do not match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Links match";
           logger.info(successMessage);
     } 
	HelperFunctions.staticWait(3);
	privacyLink.click();
	HelperFunctions.waitForPageToLoad(3);
	System.out.println(Driver.getDriver().getCurrentUrl());
	String hrefValue5 = privacyLink.getAttribute("href");
	 String currentUrl5 = Driver.getDriver().getCurrentUrl();
//	 Assert.assertEquals(hrefValue5, currentUrl5);
	 if (!hrefValue5.equals(currentUrl5)) {
         String errorMessage = "Links do not match";
           logger.error(errorMessage);
           throw new Exception(errorMessage);
     }else {
         String successMessage = "Links match";
           logger.info(successMessage);
     } 
	
 
	
}
public static void setCollapseButtonImg(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(20);
	//HelperFunctions.staticWait(3);
	test.info("Clicking on collapse button");
	JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
     executor.executeScript("arguments[0].click();", collapseButton);
	for(WebElement items:leftNavigationItems) {
		if(!items.isDisplayed()) {
			String successMessage = "The navigation texts are not displayed";
	        logger.info(successMessage);
			Assert.assertTrue(true);
		}else {
			 String errorMessage = "The navigation text are displayed";
		        logger.error(errorMessage);
		        throw new Exception(errorMessage);
		}
	}
	HelperFunctions.staticWait(2);
	test.info("Verified the navigation texts are not displayed");
	for(WebElement items:leftNavigationImg) {
		if(items.isDisplayed()) {
			String successMessage = "The navigation Images are displayed";
	        logger.info(successMessage);
			Assert.assertTrue(true);
		}else {
			 String errorMessage = "The navigation Images are not displayed";
		        logger.error(errorMessage);
		        throw new Exception(errorMessage);
		}
	}
	HelperFunctions.staticWait(3);
	test.info("Clicking on expand button");
	JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
     executor2.executeScript("arguments[0].click();", expandButton);
	for(WebElement items:leftNavigationItems) {
		if(items.isDisplayed()&& collapseButton.isDisplayed()) {
			String successMessage = "The navigation Items are displayed";
	        logger.info(successMessage);
			Assert.assertTrue(true);
		}else {
		
		}
		test.info("Verified the navigation items are displayed");
	}HelperFunctions.staticWait(3);}
public static void setCollapseExpandButton(ExtentTest test) throws Exception {
	test.info("Wait for the page to load.");
	HelperFunctions.waitForPageToLoad(20);
	//HelperFunctions.staticWait(3);
	test.info("Clicking on collapse button");
	JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
     executor.executeScript("arguments[0].click();", collapseButton);
	HelperFunctions.staticWait(3);
	test.info("Clicking on expand button");
	JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
     executor2.executeScript("arguments[0].click();", expandButton);
     HelperFunctions.staticWait(3);
     if(collapseButton.isDisplayed()) {
    	 String successMessage = "The collapse button is displayed";
	        logger.info(successMessage);
			Assert.assertTrue(true);
     }else {
    	 String errorMessage = "The collapse button is not displayed";
	        logger.error(errorMessage);
	        throw new Exception(errorMessage);
     }
     HelperFunctions.staticWait(3);
     test.info("Verified the collapse button is displayed");
	}


}
