package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;

public class TextBoxPage extends ElementPage {
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userEmail");
    private By addressField = By.id("currentAddress");
    private By submitBtn = By.id("submit");

    public void setFullName(String fullName){
        set(fullNameField, fullName);
    }
    public void setEmail(String email){
        set(emailField, email);
    }
    public void setAddress(String address){
        set(addressField, address);
    }
    public void clickSubmit(){
        click(submitBtn);
    }
}
