package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
        if (crmContactsLogo.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean validateSalesPipelineLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(salesPielineLogo));
        if (salesPielineLogo.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean validateMarketingAutomationLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(getMobileLogo));
        if (getMobileLogo.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean validateGetMobileLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(salesPielineLogo));
        if (salesPielineLogo.isDisplayed())
            return true;
        else
            return false;
    }
}
