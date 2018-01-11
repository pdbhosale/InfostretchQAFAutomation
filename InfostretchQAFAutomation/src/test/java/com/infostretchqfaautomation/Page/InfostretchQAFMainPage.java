package com.infostretchqfaautomation.Page;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.infostretchqfaautomation.Listnener.*;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;

import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Reporter;


public class InfostretchQAFMainPage {

	@Test
	public void verificationInfostretchWeb() throws InterruptedException, AWTException {
		Reporter.log("<font color='orange'>Started QAF Automation</font>");
		
		InfostretchHomeTestPage infostretchHomePageTest = new InfostretchHomeTestPage();
		infostretchHomePageTest.launchPage(null);
		
		infostretchHomePageTest.verifiedHomePage();
		infostretchHomePageTest.verifySubLinks("IP & INNOVATION");
		infostretchHomePageTest.selectWebLink("IP & INNOVATION", "QMetry Test Management");
		infostretchHomePageTest.verifyWebLink("Test Management");
		infostretchHomePageTest.verifyDigitalServicesList();
		
		
		}

}
