package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    FeaturesPage featuresPage;
    SignUpPage signUpPage;
    PricingPage pricingPage;

    public LoginPageTest() {
        super(); // colling constructor TestBase class
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String  browser) throws MalformedURLException, InterruptedException {
        initialization(browser);  //colling driver and go to login page
        loginPage = new LoginPage(); // fill in specified field necessary data login and password
    }

    @Test(priority = 1)
    public void loginPageTitleTest() throws InterruptedException {
        String title = loginPage.validateLoginPageTitle();
        log.info("login page title is ---> " + title);
        Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
    }

   /* @Test (priority = 2)
    public void crmLogoImageTest(){
        boolean flag =loginPage.validateCRMImage();
        Assert.assertTrue(flag);
    }*/
/*
    @Test (priority = 3)
    public void loginTest() throws InterruptedException {
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test (priority = 4)
    public void verifySignUpButton_1(){
        signUpPage = loginPage.clickOnSignUpButton_1();
    }*/
/*

    @Test (priority = 5)
    public void verifySignUpButton_2(){
        signUpPage = loginPage.clickOnSignUpButton_2();
    }

    @Test (priority = 6)
    public void verifySignUpButton_3(){
        signUpPage = loginPage.clickOnSignUpButton_3();
    }

    @Test (priority = 7)
    public void verifySignUpButton_4(){
        signUpPage = loginPage.clickOnSignUpButton_4();
    }

    @Test (priority = 8)
    public void crmContactsLogoTest(){
        boolean flag =loginPage.validateCRMContactsLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 9)
    public void salesPipelineLogoTest(){
        boolean flag =loginPage.validateSalesPipelineLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 10)
    public void marketingAutomationLogoTest(){
        boolean flag =loginPage.validateMarketingAutomationLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 11)
    public void getMobileLogoTest(){
        boolean flag =loginPage.validateGetMobileLogo();
        Assert.assertTrue(flag);
    }

    @Test(priority = 12)
    public void verifyFeaturesLink(){
        featuresPage = loginPage.clickOnFeaturesLink();

    }

    @Test(priority = 13)
    public void verifySignUpLink(){
        signUpPage = loginPage.clickOnSignUpLink();

    }

      @Test(priority = 14)
      public void verifyPricingLink(){
          pricingPage = loginPage.clickOnPricingLink();

      }

     @Test(priority = 15)
      public void verifyCrmContactsText(){
          boolean flag =  loginPage.validateCrmContactsText();
          Assert.assertTrue(flag);

      }

    @Test(priority = 16)
    public void verifySalesPipelineText(){
        boolean flag =  loginPage.validateSalesPipelineText();
        Assert.assertTrue(flag);

    }

    @Test(priority = 17)
    public void verifyMarketAutoText(){
        boolean flag =  loginPage.validateMarketingAutoText();
        Assert.assertTrue(flag);

    }

    @Test(priority = 19)
    public void verifyGetMobileText(){
        boolean flag =  loginPage.validateGetMobileText();
        Assert.assertTrue(flag);

    }

    @Test(priority = 20)
    public void verifyRpmcImage(){
        boolean flag =  loginPage.validateRpmcImage();
        Assert.assertTrue(flag);

    }

    @Test(priority = 21)
    public void verifySofiImage(){
        boolean flag =  loginPage.validateSofiImage();
        Assert.assertTrue(flag);

    }

    @Test(priority = 22)
    public void verifyAncellImage(){
        boolean flag =  loginPage.validateAncellImage();
        Assert.assertTrue(flag);

    }

    @Test(priority = 23)
    public void verifyUniColumbiaImage(){
        boolean flag =  loginPage.validateUniColumbiaImage();
        Assert.assertTrue(flag);

    }

    @Test(priority = 24)
    public void verifyCardsMadeEasyImage(){
        boolean flag =  loginPage.validateCardsMadeEasyImage();
        Assert.assertTrue(flag);

    }

    @Test(priority = 25)
    public void verifyFoyerImage(){
        boolean flag =  loginPage.validateFoyerImage();
        Assert.assertTrue(flag);

    }
    @Test (priority = 26)
    public void verifyVompaniesContactsLogoTest(){
        boolean flag = loginPage.validateCompaniesContactsLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 27)
    public void verifyCompaniesContactsTextTest(){
        boolean flag = loginPage.validateCompaniesContactsText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 28)
    public void verifyMarketingCampaignsLogoTest(){
        boolean flag = loginPage.validateMarketingCompaignsLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 29)
    public void verifyMarketingCampaignsTexstTest(){
        boolean flag = loginPage.validateMarketingCompaignsText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 30)
    public void verifyMobileIosAndrLogoTest(){
        boolean flag = loginPage.validateMobileIosAndrLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 31)
    public void verifyMobileIosAndrTextTest(){
        boolean flag = loginPage.validateMobileIosAndrText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 32)
    public void verifyDealsSalesLogoTest(){
        boolean flag = loginPage.validateDealsSalesLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 33)
    public void verifyDealesSalesTextTest(){
        boolean flag = loginPage.validateDealsSalesText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 34)
    public void verifyTaskEventLogoTest(){
        boolean flag = loginPage.validateTaskEventLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 35)
    public void verifyTaskEventTextTest(){
        boolean flag = loginPage.validateDealsSalesText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 36)
    public void verifyGroupCalendarLogoTest(){
        boolean flag = loginPage.validateGroupCalendarLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 37)
    public void verifyGroupCalendarTextTest(){
        boolean flag = loginPage.validateGroupCalendarText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 38)
    public void verifyCallsVoiceLogoTest(){
        boolean flag = loginPage.validateCallsVoiceLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 38)
    public void verifyCallsVoiceTextTest(){
        boolean flag = loginPage.validateCallsVoiceText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 39)
    public void verifyImportExportLogoTest(){
        boolean flag = loginPage.validateImportExportLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 40)
    public void verifyImportExportTextTest(){
        boolean flag = loginPage.validateImportExporText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 41)
    public void verifyDocumentsLogoTest(){
        boolean flag = loginPage.validateDocumentsLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 42)
    public void verifyDocumentsTextTest(){
        boolean flag = loginPage.validateDocumentsText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 43)
    public void verifyFormsLogoTest(){
        boolean flag = loginPage.validateFormsLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 44)
    public void verifyFormsTextTest(){
        boolean flag = loginPage.validateFormsText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 45)
    public void verifyPrintSMSLogoTest(){
        boolean flag = loginPage.validatePrintSMSLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 46)
    public void verifyPrintSMSTextTest(){
        boolean flag = loginPage.validatePrintSMSText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 47)
    public void verifyBackUpSecurityLogoTest(){
        boolean flag = loginPage.validateBackUpSecurityLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 48)
    public void verifyBackUpSecurityTextTest(){
        boolean flag = loginPage.validateBackUpSecurityText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 49)
    public void verifyReportsLogoTest(){
        boolean flag = loginPage.validateReportsLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 50)
    public void verifyReportsTextTest(){
        boolean flag = loginPage.validateReportsText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 51)
    public void verifyAlertsRemindersLogoTest(){
        boolean flag = loginPage.validateAlertsRemindresLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 52)
    public void verifyAlertsRemindersTextTest(){
        boolean flag = loginPage.validateReportsText();
        Assert.assertTrue(flag);
    }

    @Test (priority = 53)
    public void verifyCustomerSupportLogoTest(){
        boolean flag = loginPage.validateCustomerSupportLogo();
        Assert.assertTrue(flag);
    }

    @Test (priority = 54)
    public void verifyCustomerSupportTextTest(){
        boolean flag = loginPage.validateCustomerSupportText();
        Assert.assertTrue(flag);
    }
*/
   /* @Test (priority = 55)
    public void verifyFreeCRMTextTest(){
        String str = loginPage.validateFreeCRMText();
        Assert.assertEquals(str, "#1 Free CRM software in the cloud for sales and service");
    }

    @Test (priority = 56)
    public void verifyTurnRightSign(){
        boolean flag = loginPage.validateTurnRightSign();
        Assert.assertTrue(flag);
    }

    @Test (priority = 57)
    public void verifyTurnLeftSign(){
        boolean flag = loginPage.validateTurnLeftSign();
        Assert.assertTrue(flag);
    }*/

    @Test (priority = 58)
    public void verifyFreeCRMTSoftText(){
        String str = loginPage.validateFreeCRMSoftwareText();
        Assert.assertEquals(str, "Free CRM software in the cloud powers sales and customer serviceCRM");
    }

    @AfterMethod
    public void tearDown (){
        driver.close(); // closing the browser
        driver=null;
    }
}
