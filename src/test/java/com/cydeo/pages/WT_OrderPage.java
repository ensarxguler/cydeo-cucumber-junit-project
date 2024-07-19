package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_BasePage {

    public WT_OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardButton;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressButton;

    @FindBy(xpath = "//input[@name='card']")
    public List<WebElement> cardTypes;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInput;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetName;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityName;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateName;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement cardNo;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        for (WebElement eachButton : radioButtons) {
            if (eachButton.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                eachButton.click();
            }
        }
    }

}
