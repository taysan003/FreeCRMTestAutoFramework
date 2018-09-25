package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory - OR
    @FindBy(name ="username") //discribe locator name = username from webpage
    WebElement username;      // dont need driver.findelenent By xpath

    @FindBy(name ="password") //discribe locator name = password from webpage
    WebElement password;      // dont need driver.findelenent By xpath

    @FindBy(xpath = "//input [@type ='submit' and @class ='btn btn-small' ]")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@id='navbar-collapse']/ul[@class='nav navbar-nav navbar-right']//font[.='Sign Up']")
    WebElement signUp;

    @FindBy(xpath = "//img [@class = 'img-responsive' and @alt = 'free crm logo']")
    WebElement crmLogo;

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

    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }
}
