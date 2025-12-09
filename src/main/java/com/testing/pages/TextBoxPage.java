package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.testing.utilities.ActionUtility.sendKeys;
import static com.testing.utilities.GetUtility.getText;
import static com.testing.utilities.JavaScriptUtility.scrollToElement;
import static com.testing.utilities.WaitUtility.explicitWaitUntilVisible;
public class TextBoxPage extends ElementPage {
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By permanentAddressField = By.id("permanentAddress");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress() {
        explicitWaitUntilVisible(5, currentAddressResult);
        return getText(currentAddressResult);
    }

    public void clickSubmitButton() {
        scrollToElement(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setPermanentAddress(String address) {
        find(permanentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setFullName(String name) {
        delay(1000);
        scrollToElement(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        set(emailField, email);
    }
}
