package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends TestBase {

    @FindBy(xpath = "//td[contains(text(), 'Contacts')]")
    WebElement contactsLabel;

    public ContactsPage() {
        PageFactory.initElements(driver, this); //initialization home class by driver and all FindBy elements
    }

    public boolean verifyContactsLabel(){
       return contactsLabel.isDisplayed();
    }

    public void selectContacts(){
        driver.findElement(By.xpath("//td/input [@name='contact_id']")).click();
    }
}
