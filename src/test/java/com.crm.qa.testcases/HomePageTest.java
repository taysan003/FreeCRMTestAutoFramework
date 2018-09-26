package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ContactsPage contactsPage;

    public HomePageTest() {
        super(); // colling constructor TestBase class
    }

    //test cases should be separated or independent with each other
    //before each test case --- launch the browser and login
    //@test - execute test case
    // after each test case --- close the browser
    @BeforeMethod
    public void setUp(){
        initialization();  //colling driver and go to login page
        testUtil = new TestUtil();
        contactsPage = new ContactsPage();
        loginPage = new LoginPage(); // fill in specified field necessary data login and password
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest(){
        String title = homePage.verifyHomePageTitle();
        Assert.assertEquals(title, "CRMPRO", "Home page title does't matche");
    }

    @Test(priority = 2)
    public void verifyCorrectUserName(){
        testUtil.switchToFrame();
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }

    @Test(priority = 3)
    public void verifyContactsLink(){
        testUtil.switchToFrame();
        contactsPage = homePage.clickOnContactsLink();

    }


    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

}
