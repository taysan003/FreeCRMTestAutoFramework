package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super(); // colling constructor TestBase class
    }

    @BeforeMethod
    public void setUp(){
        initialization();  //colling driver and go to login page

        loginPage = new LoginPage(); // fill in specified field necessary data login and password
    }

    @Test(priority = 1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
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

    @AfterMethod
    public void tearDown (){
        driver.close(); // closing the browser
    }
}
