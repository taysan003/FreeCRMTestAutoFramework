package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//td[contains(text(), 'Andrei Kastsiuchenka')]")
    WebElement userNameLabel;

    @FindBy(xpath = "//li/a [@title='Contacts' and contains(text(), 'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath = "//a[contains(text(), 'Deals')]")
    WebElement dealsLink;

    @FindBy(xpath = "//a [contains(text(), 'Tasks')]")
    WebElement taskLink;

    //initializing of page objects

    public HomePage() {
        PageFactory.initElements(driver, this); //initialization home class by driver and all FindBy elements
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }
    public boolean verifyCorrectUserName(){
      return userNameLabel.isDisplayed();

    }

    public ContactsPage clickOnContactsLink(){
        contactsLink.click();
        return new ContactsPage();
    }

    public DealsPage dealsLink(){
        dealsLink.click();
        return new DealsPage();
    }

    public TaskPage taskLink(){
        taskLink.click();
        return new TaskPage();
    }
}
