/**
 * 
 */
package com.infostretchqfaautomation.StepDefination;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.infostretchqfaautomation.Component.DigitalServicesComponent;
import com.infostretchqfaautomation.Page.InfostretchHomeTestPage;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

/**
 * @author Priyanka.Bhosale
 */
public class Infostretch {
	InfostretchHomeTestPage infostretchHomePageTest = new InfostretchHomeTestPage();
	
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user opens Infostretch application")
	public void userOpensInfostretchApplication() {
		// TODO: remove NotYetImplementedException and call test steps
		infostretchHomePageTest.launchPage(null);
		throw new NotYetImplementedException();
	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user verifies home page title")
	public void userVerifiesHomePageTitle() {
		// TODO: remove NotYetImplementedException and call test steps
		infostretchHomePageTest.verifiedHomePage();
		throw new NotYetImplementedException();
	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 * 
	 * @throws InterruptedException
	 */
	@QAFTestStep(description = "user verifies sublinks from {0}")
	public void userVerifiesSublinksFrom(String menuLink) throws InterruptedException {
		// TODO: remove NotYetImplementedException and call test steps
		infostretchHomePageTest.verifySubLinks("IP & INNOVATION");
		throw new NotYetImplementedException();
	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 * 
	 * @throws InterruptedException
	 */
	@QAFTestStep(description = "user search for tranning {0} from {1} category")
	public void userSearchForTranningFromCategory(String submenuLink, String menuLink)
			throws InterruptedException {
		// TODO: remove NotYetImplementedException and call test steps
		infostretchHomePageTest.selectWebLink("IP & INNOVATION", "QMetry Test Management");
		throw new NotYetImplementedException();
	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 * @throws InterruptedException 
	 */
	@QAFTestStep(description = "verify weblink {0}")
	public void verifyWeblink(String submenuLink) throws InterruptedException {
		// TODO: remove NotYetImplementedException and call test steps
		infostretchHomePageTest.verifyWebLink("Test Management");
		throw new NotYetImplementedException();
	}
	/**
	 * Auto-generated code snippet by QMetry Automation Framework.
	 */
	@QAFTestStep(description = "user verifies digital services list")
	public void userVerifiesDigitalServicesList() {
		// TODO: remove NotYetImplementedException and call test steps
		infostretchHomePageTest.verifyDigitalServicesList();
		throw new NotYetImplementedException();
	}

}
