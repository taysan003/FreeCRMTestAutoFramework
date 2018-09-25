package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class LoginPageTest extends TestBase {

    public LoginPageTest() {
        super(); // colling constructor TestBase class
    }

    @BeforeMethod
    public void setUp(){
        initialization();  //colling driver and go to login page

        LoginPage loginPage = new LoginPage(); // fill in specified field necessary data login and password
    }
}
