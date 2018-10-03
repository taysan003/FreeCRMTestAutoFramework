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
    public void setUp(String  browser) throws MalformedURLException {
        initialization(browser);  //colling driver and go to login page
        loginPage = new LoginPage(); // fill in specified field necessary data login and password
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        log.info("login page title is ---> " + title);
        Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
    }

    @Test (priority = 2)
    public void crmLogoImageTest(){
        boolean flag =loginPage.validateCRMImage();
        Assert.assertTrue(flag);
    }

    @Test (priority = 3)
    public void loginTest(){
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test (priority = 4)
    public void verifySignUpButton_1(){
        signUpPage = loginPage.clickOnSignUpButton_1();
    }

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

    @AfterMethod
    public void tearDown (){
        driver.close(); // closing the browser
        driver=null;
    }
}
