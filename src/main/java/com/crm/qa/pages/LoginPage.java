package com.crm.qa.pages;
import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends TestBase {


    //Page Factory - OR
    @FindBy(name ="username") //discribe locator name = username from webpage
    WebElement username;      // dont need driver.findelenent By xpath

    @FindBy(name ="password") //discribe locator name = password from webpage
    WebElement password;      // dont need driver.findelenent By xpath

    @FindBy(xpath = "//input [@type ='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@id='navbar-collapse']/ul[@class='nav navbar-nav navbar-right']//font[.='Sign Up']")
    WebElement signUp;

    @FindBy(xpath = "//img [@class = 'img-responsive' and @alt = 'free crm logo']")
    WebElement crmLogo;

    @FindBy(xpath = "//div[@id='navbar-collapse']/ul[@class='nav navbar-nav navbar-right']//a[@href='https://www.freecrm.com/features.html']")
    WebElement featuresLink;

    @FindBy(xpath = "//li/a/font [@color='red' and contains(text(), 'Sign Up')]")
    WebElement signUpLink;

    @FindBy(xpath = "//li/a [contains(text(), 'Pricing')]")
    WebElement pricingLink;

    @FindBy(xpath = "//section[@id='services']//div[@class='row']/div[1]/a[@role='button']")
    WebElement signUpButton_1;

    @FindBy(xpath = "//section[@id='services']//div[@class='row']/div[2]/a[@role='button']")
    WebElement signUpButton_2;

    @FindBy(xpath = "//section[@id='services']//div[@class='row']/div[3]/a[@role='button']")
    WebElement signUpButton_3;

    @FindBy(xpath = "//section[@id='services']//div[@class='row']/div[4]/a[@role='button']")
    WebElement signUpButton_4;

    @FindBy(xpath = "//i[@class='fa fa-users skrollable skrollable-after']")
    WebElement crmContactsLogo;

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-6 margin']/i [@class='fa fa-money skrollable skrollable-after']")
    WebElement salesPielineLogo;

    @FindBy(xpath = "//div [@class='col-md-3 col-sm-6 margin']/i [@class='fa fa-envelope skrollable skrollable-after']")
    WebElement marketingAutomationLogo;

    @FindBy(xpath = "//div [@class='col-md-3 col-sm-6 margin']/i [@class='fa fa-mobile-phone skrollable skrollable-after']")
    WebElement getMobileLogo;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[1]/p/small")
    WebElement crmContactsText;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[2]/p/small")
    WebElement salesPielineText;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[3]/p/small")
    WebElement marketingAutomationText;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[4]/p/small")
    WebElement getMobileText;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170a.jpg']")
    WebElement rpmcImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170b.png']")
    WebElement sofiImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170c.gif']")
    WebElement ancellImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170d.jpg']")
    WebElement uniColumbiaImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170g.jpg']")
    WebElement cardsMadeEasyImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170h.gif']")
    WebElement foyerImage;

    @FindBy(xpath = "//i [@class='fa fa-male fa-stack-1x fa-inverse']")
    WebElement companiesContactsLogo;

    @FindBy(xpath = "//div[@class='container']//div[1]/div[@class='row']/div[2]/p")
    WebElement companiesContactsText;

    @FindBy(xpath = "//div[@class='row']/div[2]/div[@class='row']/div[1]/span[@class='fa fa-stack']/i[2]")
    WebElement marketingCompaignsLogo;

    @FindBy(xpath = "//div[@class='row']/div[2]/div[@class='row']/div[2]/p/small")
    WebElement marketingCompaignsText;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[1]/span[@class='fa fa-stack']/i[2]")
    WebElement mobileIosAndrLogo;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[2]/p/small")
    WebElement mobileIosAndrText;

    @FindBy(xpath = "//div[@class='row']/div[1]/div[@class='row']/div[3]/span[@class='fa-stack']/i[2]")
    WebElement dealsSalesLogo;

    @FindBy(xpath = "//div[@class='row']/div[1]/div[@class='row']/div[4]/p/small")
    WebElement dealsSalesText;

    @FindBy(xpath = "//div[2]/div[@class='row']/div[3]/span[@class='fa fa-stack']/i[2]")
    WebElement taskEventLogo;

    @FindBy(xpath = "//div[2]/div[@class='row']/div[3]/span[@class='fa fa-stack']/i[2]")
    WebElement taskEventText;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[3]/span[@class='fa fa-stack']/i[2]")
    WebElement groupCalendarLogo;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[4]/p/small")
    WebElement groupCalendarText;

    @FindBy(xpath = "//div[@class='row']/div[1]/div[@class='row']/div[5]/span[@class='fa-stack']/i[2]")
    WebElement callsVoiceLogo;

    @FindBy(xpath = "//div[@class='row']/div[1]/div[@class='row']/div[6]/p/small")
    WebElement callsVoiceText;

    @FindBy(xpath = "//div[@class='row']/div[2]/div[@class='row']/div[5]/span[@class='fa fa-stack']/i[2]")
    WebElement importExportLogo;

    @FindBy(xpath = "//div[@class='row']/div[2]/div[@class='row']/div[6]/p/small")
    WebElement importExportText;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[5]/span[@class='fa fa-stack']/i[2]")
    WebElement documentsLogo;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[6]/p/small")
    WebElement documentsText;

    @FindBy(xpath = "//section[@id='details']/div[@class='container']/div[@class='row']/div[1]/div[@class='row']/div[7]/span[@class='fa-stack']/i[@class='fa fa-circle fa-stack-2x skrollable skrollable-after']")
    WebElement formsLogo;

    @FindBy(xpath = "//div[@class='container']/div[@class='row']/div[1]/div[@class='row']/div[8]/p/small")
    WebElement formsText;

    @FindBy(xpath = "//div[@class='row']/div[2]/div[@class='row']/div[7]/span[@class='fa fa-stack']/i[2]")
    WebElement printSmsLogo;

    @FindBy(xpath = "//div[@class='container']/div[@class='row']/div[2]/div[@class='row']/div[8]/p/small")
    WebElement printSmsText;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[7]/span[@class='fa fa-stack']/i[2]")
    WebElement backUpSecurityLogo;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[8]/p/small")
    WebElement backUpSecurityText;

    @FindBy(xpath = "//div[@class='row']/div[1]/div[@class='row']/div[9]/span[@class='fa-stack']/i[2]")
    WebElement reportsLogo;

    @FindBy(xpath = "//div[@class='container']/div[@class='row']/div[1]/div[@class='row']/div[10]/p/small")
    WebElement reportsText;

    @FindBy(xpath = "//div[@class='container']/div[@class='row']/div[2]/div[@class='row']/div[9]/span[@class='fa fa-stack']/i[2]")
    WebElement alertsRemindersLogo;

    @FindBy(xpath = "//div[@class='container']/div[@class='row']/div[2]/div[@class='row']/div[10]/p/small")
    WebElement alertsRemindersText;

    @FindBy(xpath = "//div[3]/div[@class='row']/div[9]/span[@class='fa fa-stack']/i[2]")
    WebElement customerSupportLogo;

    @FindBy(xpath = "//div[@class='row']/div[3]/div[@class='row']/div[10]/p/small")
    WebElement customerSupportText;

    @FindBy(xpath = "//h1 [@class='skrollable skrollable-between' and contains(text(),'#1 Free CRM software in the cloud for sales and service')]")
    WebElement freeCRMText;

    @FindBy(xpath = "//i [@class='fa fa-chevron-right']")
    WebElement turnRigtSign;

    //initializing of page objects
    public LoginPage() {
        PageFactory.initElements(driver, this); //initialization LoginPage class by driver and all FindBy elements
    }

    //Actions
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMImage(){
       return crmLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd) throws InterruptedException {
        username.clear();
        username.sendKeys(un);
        password.clear();
        password.sendKeys(pwd);
       // testUtil.switchToFrameChat();
       // Thread.sleep(10000);
        loginBtn.submit();


        return new HomePage();
    }

    public FeaturesPage clickOnFeaturesLink(){

        wait.until(ExpectedConditions.elementToBeClickable(featuresLink));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", featuresLink);
        return new FeaturesPage();
    }
    public SignUpPage clickOnSignUpLink(){

        wait.until(ExpectedConditions.elementToBeClickable(signUpLink));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", signUpLink);
        return new  SignUpPage();

    }

    public PricingPage clickOnPricingLink(){

        wait.until(ExpectedConditions.elementToBeClickable(pricingLink));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", pricingLink);
        return new  PricingPage();

    }

    public SignUpPage clickOnSignUpButton_1(){

        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", signUpButton_1);

        return new SignUpPage();
    }

    public SignUpPage clickOnSignUpButton_2(){

        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", signUpButton_2);
        return new SignUpPage();

    }

    public SignUpPage clickOnSignUpButton_3(){

        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", signUpButton_3);
        return new SignUpPage();
    }

    public SignUpPage clickOnSignUpButton_4(){

        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", signUpButton_4);
        return new SignUpPage();
    }

    public boolean validateCRMContactsLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(crmContactsLogo));
        return crmContactsLogo.isDisplayed();

    }

    public boolean validateSalesPipelineLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(salesPielineLogo));
        return salesPielineLogo.isDisplayed();

    }

    public boolean validateMarketingAutomationLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(marketingAutomationLogo));
        return marketingAutomationLogo.isDisplayed();

    }

    public boolean validateGetMobileLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(getMobileLogo));
        return getMobileLogo.isDisplayed();

    }

    public boolean validateCrmContactsText(){

        wait.until(ExpectedConditions.visibilityOf(crmContactsText));
        return crmContactsText.isDisplayed();
    }

    public boolean validateSalesPipelineText(){

        wait.until(ExpectedConditions.visibilityOf(salesPielineText));
        return salesPielineText.isDisplayed();
    }

    public boolean validateMarketingAutoText(){

        wait.until(ExpectedConditions.visibilityOf(marketingAutomationText));
        return marketingAutomationText.isDisplayed();
    }

    public boolean validateGetMobileText(){

        wait.until(ExpectedConditions.visibilityOf(getMobileText));
        return getMobileText.isDisplayed();
    }

    public boolean validateRpmcImage(){

        wait.until(ExpectedConditions.visibilityOf(rpmcImage));
        return rpmcImage.isDisplayed();
    }

    public boolean validateSofiImage(){

        wait.until(ExpectedConditions.visibilityOf(sofiImage));
        return sofiImage.isDisplayed();
    }

    public boolean validateAncellImage(){

        wait.until(ExpectedConditions.visibilityOf(ancellImage));
        return ancellImage.isDisplayed();
    }

    public boolean validateUniColumbiaImage(){

        wait.until(ExpectedConditions.visibilityOf(uniColumbiaImage));
        return uniColumbiaImage.isDisplayed();
    }

    public boolean validateCardsMadeEasyImage(){

        wait.until(ExpectedConditions.visibilityOf(cardsMadeEasyImage));
        return cardsMadeEasyImage.isDisplayed();
    }

    public boolean validateFoyerImage(){

        wait.until(ExpectedConditions.visibilityOf(foyerImage));
        return foyerImage.isDisplayed();
    }

    public boolean validateCompaniesContactsLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(companiesContactsLogo));
        return companiesContactsLogo.isDisplayed();

    }

    public boolean validateCompaniesContactsText(){

        wait.until(ExpectedConditions.visibilityOf(crmContactsText));
        return crmContactsText.isDisplayed();
    }

    public boolean validateMarketingCompaignsLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(marketingCompaignsLogo));
        return marketingCompaignsLogo.isDisplayed();

    }

    public boolean validateMarketingCompaignsText(){

        wait.until(ExpectedConditions.visibilityOf(marketingCompaignsText));
        return marketingCompaignsText.isDisplayed();
    }

    public boolean validateMobileIosAndrLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(mobileIosAndrLogo));
        return mobileIosAndrLogo.isDisplayed();

    }

    public boolean validateMobileIosAndrText(){

        wait.until(ExpectedConditions.visibilityOf(mobileIosAndrText));
        return mobileIosAndrText.isDisplayed();
    }

    public boolean validateDealsSalesLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(dealsSalesLogo));
        return dealsSalesLogo.isDisplayed();

    }

    public boolean validateDealsSalesText(){

        wait.until(ExpectedConditions.visibilityOf(dealsSalesText));
        return dealsSalesText.isDisplayed();
    }

    public boolean validateTaskEventLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(taskEventLogo));
        return taskEventLogo.isDisplayed();

    }

    public boolean validateTaskEventText(){

        wait.until(ExpectedConditions.visibilityOf(taskEventText));
        return taskEventText.isDisplayed();
    }

    public boolean validateGroupCalendarLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(groupCalendarLogo));
        return groupCalendarLogo.isDisplayed();

    }

    public boolean validateGroupCalendarText(){

        wait.until(ExpectedConditions.visibilityOf(groupCalendarText));
        return groupCalendarText.isDisplayed();
    }

    public boolean validateCallsVoiceLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(callsVoiceLogo));
        return callsVoiceLogo.isDisplayed();

    }

    public boolean validateCallsVoiceText(){

        wait.until(ExpectedConditions.visibilityOf(callsVoiceText));
        return callsVoiceText.isDisplayed();
    }

    public boolean validateImportExportLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(importExportLogo));
        return importExportLogo.isDisplayed();

    }

    public boolean validateImportExporText(){

        wait.until(ExpectedConditions.visibilityOf(importExportText));
        return importExportText.isDisplayed();
    }

    public boolean validateDocumentsLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(documentsLogo));
        return documentsLogo.isDisplayed();

    }

    public boolean validateDocumentsText(){

        wait.until(ExpectedConditions.visibilityOf(documentsText));
        return documentsText.isDisplayed();
    }

    public boolean validateFormsLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(formsLogo));
        return formsLogo.isDisplayed();

    }

    public boolean validateFormsText(){

        wait.until(ExpectedConditions.visibilityOf(formsText));
        return formsText.isDisplayed();
    }

    public boolean validatePrintSMSLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(printSmsLogo));
        return printSmsLogo.isDisplayed();

    }

    public boolean validatePrintSMSText(){

        wait.until(ExpectedConditions.visibilityOf(printSmsText));
        return printSmsText.isDisplayed();
    }

    public boolean validateBackUpSecurityLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(backUpSecurityLogo));
        return backUpSecurityLogo.isDisplayed();

    }

    public boolean validateBackUpSecurityText(){

        wait.until(ExpectedConditions.visibilityOf(backUpSecurityText));
        return backUpSecurityText.isDisplayed();
    }

    public boolean validateReportsLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(reportsLogo));
        return reportsLogo.isDisplayed();

    }

    public boolean validateReportsText(){

        wait.until(ExpectedConditions.visibilityOf(reportsText));
        return reportsText.isDisplayed();
    }

    public boolean validateAlertsRemindresLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(alertsRemindersLogo));
        return alertsRemindersLogo.isDisplayed();

    }

    public boolean validateAlertsRemindresText(){

        wait.until(ExpectedConditions.visibilityOf(alertsRemindersText));
        return alertsRemindersText.isDisplayed();
    }

    public boolean validateCustomerSupportLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        wait.until(ExpectedConditions.visibilityOf(customerSupportLogo));
        return customerSupportLogo.isDisplayed();

    }

    public boolean validateCustomerSupportText(){

        wait.until(ExpectedConditions.visibilityOf(customerSupportText));
        return customerSupportText.isDisplayed();
    }

    public String validateFreeCRMText(){

        wait.until(ExpectedConditions.visibilityOf(freeCRMText));
        String str = freeCRMText.getText();
        return str;
    }

    public boolean validateTurnRightSign(){

        wait.until(ExpectedConditions.elementToBeClickable(turnRigtSign));
        return turnRigtSign.isEnabled();
    }

}
