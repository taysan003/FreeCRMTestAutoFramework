package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super(); // colling constructor TestBase class
    }

    @BeforeMethod
    public void setUp(){
        initialization();  //colling driver and go to login page
        loginPage = new LoginPage(); // fill in specified field necessary data login and password
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void verifyHomePageTitleTest(){
        String title = homePage.verifyHomePageTitle();
        Assert.assertEquals(title, "CRMPRO", "Home page title does't matche");
    }


    @AfterMethod
    public void tearDown (){
        driver.quit();
    }

}
