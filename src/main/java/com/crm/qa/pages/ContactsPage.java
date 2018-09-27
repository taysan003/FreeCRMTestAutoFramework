package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends TestBase {

    @FindBy(xpath = "//td[contains(text(), 'Contacts')]")
    WebElement contactsLabel;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "surname")
    WebElement lastName;

    @FindBy(name = "client_lookup")
    WebElement company;

    @FindBy(xpath = "//form[@id='contactForm']/table/tbody/tr[1]/td/input[@value='Save']")
    WebElement saveBtn;

    public ContactsPage() {
        PageFactory.initElements(driver, this); //initialization home class by driver and all FindBy elements
    }

    public boolean verifyContactsLabel(){
       return contactsLabel.isDisplayed();
    }

    public void selectContacts(){
        driver.findElement(By.xpath("//td/input [@name='contact_id']")).click();
    }

    public void createNewContact(String title, String ftName, String ltName, String comp){
        Select select = new Select(driver.findElement(By.xpath("//select [@name ='title' and @class = 'select']")));
        select.selectByVisibleText(title);

        firstName.sendKeys(ftName);
        lastName.sendKeys(ltName);
        company.sendKeys(comp);
        saveBtn.click();

    }
}
