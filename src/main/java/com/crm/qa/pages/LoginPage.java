package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import javafx.scene.web.WebEvent;
import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        username.clear();
        username.sendKeys(un);
        password.clear();
        password.sendKeys(pwd);
        loginBtn.submit();

        return new HomePage();
    }

    public FeaturesPage clickOnFeaturesLink(){
        //wait.until(ExpectedConditions.elementToBeClickable(featuresLink)).click();



        Actions act = new Actions(driver);
        act.moveToElement(featuresLink).perform();
        wait.until(ExpectedConditions.elementToBeClickable(featuresLink)).click();


        return new FeaturesPage();
    }
}
