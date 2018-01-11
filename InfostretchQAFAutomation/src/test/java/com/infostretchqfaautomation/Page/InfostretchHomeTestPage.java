package com.infostretchqfaautomation.Page;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.infostretchqfaautomation.Component.DigitalServicesComponent;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class InfostretchHomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	@FindBy(locator = "menu.link")
	private QAFWebElement menuLink;
	@FindBy(locator = "submenu.link")
	private QAFWebElement submenuLink;
	@FindBy(locator = "close.popup")
	private QAFWebElement closepopup;
	@FindBy(locator = "all.digitalServices")
	private List<DigitalServicesComponent> alldigitalServices;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		Reporter.logWithScreenShot("<font color='orange'>Launching Site</font>");
		driver.manage().deleteAllCookies();
		driver.get("/");
		driver.manage().window().maximize();
	}
	
	@Override
	public void waitForPageToLoad() {
		//menuLink.waitForVisible();
	}

	public QAFWebElement getMenuLink() {
		return menuLink;
	}

	public QAFWebElement getSubmenuLink() {
		return submenuLink;
	}
	
	public List<DigitalServicesComponent> getDigitalServices() {
		return alldigitalServices;
	}
	
	public void verifyDigitalServicesList() {
		List<DigitalServicesComponent> digitalservicescomponent = 
				getDigitalServices();
		for(DigitalServicesComponent result:digitalservicescomponent) {
			
			Reporter.logWithScreenShot("<font color='green'> 1. "+result.getMainHeader().getText().trim()+"</font>");
			
			Reporter.logWithScreenShot("<font color='green'> 2. "+result.getMainImage().verifyVisible()+"</font>");
			
		}
		}
		
public void selectWebLink(String menuLink,String submenuLink) throws InterruptedException {
		
    QAFExtendedWebElement sublink = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("submenu.link"), submenuLink));
    
    sublink.click();
    waitForPageToLoad();
	
	}


public void verifiedHomePage() {
	Validator.verifyThat("Infostretch home Page validtion", driver.getTitle(),Matchers.containsString("Digital Testing"));
		}

public void verifySubLinks(String menuLink) throws InterruptedException {
	QAFExtendedWebElement mainlink = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("menu.link"), menuLink));
	mainlink.waitForVisible();
	Actions act = new Actions(driver);
	act.moveToElement(mainlink).build().perform();
	waitForPageToLoad();
	List<WebElement> sublinks = driver.findElements(By.xpath("//*[@id='menu-main-menu-05-may']/div[2]/div/div/div[1]/div/a/span"));
	
	for(WebElement sublink:sublinks) {
		
		Reporter.logWithScreenShot("<font color='green'>"+sublink.getText() + " is present under "+menuLink+"</font>");
		
	}
}

public void verifyWebLink(String submenuLink) throws InterruptedException {
	// TODO Auto-generated method stub
	
	String parentHandle = driver.getWindowHandle();
	new InfostretchHomeTestPage().switchToWindow();
		waitForPageToLoad();
		Validator.verifyThat("Selected Page validtion", driver.getTitle(),Matchers.containsString(submenuLink));
		//driver.close();
		driver.switchTo().window(parentHandle);

}

public void switchToWindow() {
	
	for (String windowHandle : driver.getWindowHandles()) {
	    driver.switchTo().window(windowHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
	}
		
	}
}
	

