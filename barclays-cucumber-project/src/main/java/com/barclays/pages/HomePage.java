package com.barclays.pages;

import com.barclays.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Bank")
    WebElement _bankTab;
    @FindBy(linkText = "Switching bank account to Barclays")
    WebElement _switchToBankAccount;
    @FindBy(linkText = "Already bank with us?")
    WebElement _alreadyBankWithUs;

    public void clickonBankTab() {
        waitUntilElementToBeClickable(_bankTab, 20);
        Reporter.addStepLog("Clickin on bank tab :" + _bankTab.toString());
        mouseHoverToElementAndClick(_bankTab);
        log.info("Clickin on bank tab :" + _bankTab.toString());
    }

    public void clickOnSwitchAccountTab() {
        waitUntilElementToBeClickable(_switchToBankAccount, 20);
        Reporter.addStepLog("Clickin on bank tab :" + _switchToBankAccount.toString());
        mouseHoverToElementAndClick(_switchToBankAccount);
        log.info("Swtich on bank tab :" + _switchToBankAccount.toString());
    }

    public String vafiryAlreadyWithUsText(String alreadyText) {
        waitUntilElementToBeClickable(_alreadyBankWithUs, 20);
        Reporter.addStepLog("already bank with us :" + _alreadyBankWithUs.toString());
        log.info("already bank with us :" + _alreadyBankWithUs.toString());
        return getTextFromElement(_alreadyBankWithUs);

    }

}
