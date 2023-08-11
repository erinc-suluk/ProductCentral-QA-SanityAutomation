
package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.productcentral.Driver;
import com.pwc.productcentral.HelperFunctions;

public class SecurityPage extends HelperFunctions {
	public SecurityPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		} 
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//div[@class='cmp-legal-product-listing__tiles']")
	private static List<WebElement> securityTiles;
	
	@FindBy(xpath="//div[@id='productListingDropdown']")
	private WebElement productListingDropdown;
	
	@FindBy(xpath="//div[@id='sortingDropdown']")
	private WebElement sortingDropdown;
	
	
	
	public void setSecurityTiles(ExtentTest test) {
		test.info("Wait for the page to load.");
		HelperFunctions.waitForPageToLoad(15);
		
		boolean isAllDisplayed = true;
        for(WebElement eachTiles : securityTiles){
            if(eachTiles.isDisplayed() == false){
                isAllDisplayed = false;
                break;
            }
        }
        test.info("Verified each tiles are displayed");
       
       HelperFunctions.staticWait(3);
       Boolean pld=productListingDropdown.isDisplayed();
       test.info("Verified Product Listing Dropdown is displayed ");
       System.out.println("Product Listing Dropdown is displayed  :" + pld);
       HelperFunctions.staticWait(3);
       Boolean sd=sortingDropdown.isDisplayed();
       test.info("VSorting Dropdown is displayed ");
       System.out.println("Sorting Dropdown is displayed  :" + sd);
       HelperFunctions.staticWait(3);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
