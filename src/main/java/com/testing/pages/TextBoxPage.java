package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.testing.utilities.ActionUtility.sendKeys;
import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class TextBoxPage extends ElementPage {
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By submitBtn = By.id("submit");

    public void setFullName(String name){
        scrollToElement(fullNameField);

    }
    public void setEmail(String email){
        set(emailField, email);
    }
    public void clickSubmit(){
        scrollToElement(submitBtn);
        click(submitBtn);
    }
}
