package Pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class ResellerPage extends HelperFunctions {
	public ResellerPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//a[@href='/us/en/automation/reseller-demo/check-in.html']")
	private WebElement checkInLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/reseller-demo/dragos-alliance.html']")
	private WebElement complianceLink;
	
	@FindBy(xpath="//a[@href='/us/en/automation/reseller-demo/microsoft-alliance.html']")
	private WebElement microsoftAllianceLink;
	
	@FindBy(xpath="//div[@class='cmp-product-list__cards-container']//a")
	private static List<WebElement> productList;
	
	@FindBy(xpath="//a[@href='/us/en/automation/reseller-demo/check-in/resell-offering-overview.html']")
	private WebElement resellOfferingOverviewLink;
	
	@FindBy(xpath="//span[@class='cmp-pdf-highlights__title']")
	private WebElement resellOfferingOverviewTitle;
	
	@FindBy(xpath="//a[@href='/content/pc/us/en/automation/reseller-demo/check-in.html']")
	private WebElement backtoCheckinBreadcrumb;
	
	@FindBy(xpath="//a[@href='/content/pc/us/en/automation/reseller-demo.html']")
	private WebElement backtoResellerDemoBreadcrumb;
	
	@FindBy(xpath="//div[@class='cmp-breadcrumb']//a")
	private static List<WebElement> breadcrumbLinks;
	
	static Logger logger=Logger.getLogger("ResellerPage");
	
	public void setBreadcrumbs() throws Exception {
		
		HelperFunctions.waitForPageToLoad(5);
		for(WebElement link:productList) {
			link.click();
			break;
		}
		HelperFunctions.waitForPageToLoad(5);
		breadcrumbLinks.get(0).click();
		String currentUrl = Driver.getDriver().getCurrentUrl();
		 Assert.assertTrue(currentUrl.endsWith("/content/pc/us/en/resell-alliances.html"));
		
		/* for (WebElement link : breadcrumbLinks) {
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
	            }*/
		
	}
	
	public void setPageTitleAndProducts(ExtentTest test) throws Exception {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		test.info("Verified page title");
		Assert.assertTrue(pageTitle.isDisplayed());
		test.info("Get href value of each product");
		  for (WebElement link : productList) {
	            
              String href = link.getAttribute("href");

          
              if (!href.isEmpty()) {
            
                  System.out.println(href);
                  String successMessage = "Page title displays the name of the product";
                  logger.info(successMessage);
                  Assert.assertTrue(true);
              }else {
            	  String errorMessage = "Page title does not display the name of the product";
                  logger.error(errorMessage);
                  throw new Exception(errorMessage);
            	//  Assert.assertTrue(false);
              }
          }
		  test.info("Verified page title displays the name of the product");
			HelperFunctions.staticWait(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
