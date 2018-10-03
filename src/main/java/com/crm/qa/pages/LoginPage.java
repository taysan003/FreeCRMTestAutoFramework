package com.crm.qa.pages;
import com.crm.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[1]/p/small")
    WebElement crmContactsText;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[2]/p/small")
    WebElement salesPielineText;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[3]/p/small")
    WebElement marketingAutomationText;

    @FindBy(xpath = "//section[@id='services']/div[@class='container']/div/div[4]/p/small")
    WebElement getMobileText;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170a.jpg']")
    WebElement rpmcImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170b.png']")
    WebElement sofiImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170c.gif']")
    WebElement ancellImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170d.jpg']")
    WebElement uniColumbiaImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170g.jpg']")
    WebElement cardsMadeEasyImage;

    @FindBy(xpath = "//a/img [@src='https://d19rqa8v8yb76c.cloudfront.net/img/170h.gif']")
    WebElement foyerImage;

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
        return crmContactsLogo.isDisplayed();

    }

    public boolean validateSalesPipelineLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(salesPielineLogo));
        return salesPielineLogo.isDisplayed();

    }

    public boolean validateMarketingAutomationLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(marketingAutomationLogo));
        return marketingAutomationLogo.isDisplayed();

    }

    public boolean validateGetMobileLogo(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        wait.until(ExpectedConditions.visibilityOf(getMobileLogo));
        return getMobileLogo.isDisplayed();

    }

    public boolean validateCrmContactsText(){

        wait.until(ExpectedConditions.visibilityOf(crmContactsText));
        return crmContactsText.isDisplayed();
    }

    public boolean validateSalesPipelineText(){

        wait.until(ExpectedConditions.visibilityOf(salesPielineText));
        return salesPielineText.isDisplayed();
    }

    public boolean validateMarketingAutoText(){

        wait.until(ExpectedConditions.visibilityOf(marketingAutomationText));
        return marketingAutomationText.isDisplayed();
    }

    public boolean validateGetMobileText(){

        wait.until(ExpectedConditions.visibilityOf(getMobileText));
        return getMobileText.isDisplayed();
    }

    public boolean validateRpmcImage(){

        wait.until(ExpectedConditions.visibilityOf(rpmcImage));
        return rpmcImage.isDisplayed();
    }

    public boolean validateSofiImage(){

        wait.until(ExpectedConditions.visibilityOf(sofiImage));
        return sofiImage.isDisplayed();
    }

    public boolean validateAncellImage(){

        wait.until(ExpectedConditions.visibilityOf(ancellImage));
        return ancellImage.isDisplayed();
    }

    public boolean validateUniColumbiaImage(){

        wait.until(ExpectedConditions.visibilityOf(uniColumbiaImage));
        return uniColumbiaImage.isDisplayed();
    }

    public boolean validateCardsMadeEasyImage(){

        wait.until(ExpectedConditions.visibilityOf(cardsMadeEasyImage));
        return cardsMadeEasyImage.isDisplayed();
    }

    public boolean validateFoyerImage(){

        wait.until(ExpectedConditions.visibilityOf(foyerImage));
        return foyerImage.isDisplayed();
    }
}
