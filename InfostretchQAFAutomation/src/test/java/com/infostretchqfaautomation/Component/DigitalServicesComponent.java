package com.infostretchqfaautomation.Component;

import com.qmetry.qaf.automation.ui.annotations.FindBy;

import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class DigitalServicesComponent
		extends
		QAFWebComponent {

	public DigitalServicesComponent(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}

	@FindBy(locator = "main.header")
	private QAFWebElement mainHeader;
	@FindBy(locator = "main.image")
	private QAFWebElement mainImage;

	

	public QAFWebElement getMainHeader() {
		return mainHeader;
	}

	public QAFWebElement getMainImage() {
		return mainImage;
	}

}
