package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class ContactsPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ContactsPage contactsPage;
    TestUtil testUtil;
    String sheetName = "contacts";


    public ContactsPageTest()
    {
        super(); // colling constructor TestBase class
    }

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        initialization();  //colling driver and go to login page
        testUtil = new TestUtil();
        contactsPage = new ContactsPage();
        loginPage = new LoginPage(); // fill in specified field necessary data login and password
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        testUtil.switchToFrame();
        contactsPage =homePage.clickOnContactsLink();

    }

    @Test(priority = 1)
    public void verifyContactsPageLabel(){

        Assert.assertTrue(contactsPage.verifyContactsLabel(), "Contacts lable is missing on the page");
    }

    @Test(priority = 2)
    public void selectContactsTest(){

        contactsPage.selectContacts();
    }

    @DataProvider
    public Object[][] getCRMTestData(){
        return TestUtil.getTestData(sheetName);
    }



    @Test(priority = 3, dataProvider = "getCRMTestData")
    public void validateCreateNewContact(String title, String ftName, String ltName, String comp){
        homePage.clickOnNewContactsLink();
      //  contactsPage.createNewContact("Mr.", "Andrei", "Ivanov", "Google");
        contactsPage.createNewContact(title, ftName, ltName, comp);
    }


    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
