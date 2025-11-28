package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;

public class WebTablePage extends ElementPage {
    private By registrationFieldAge = By.id("age");
    private By submitButton = By.id("submit");

    public void setAge(String name){
        set(registrationFieldAge, name);
    }
    public void clickSubmit(){
        click(submitButton);
    }
    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+ email + "']//following::span[@title='Edit']");
        click(edit);
    }

    public String getTableAge(String email){
        By tableAge = By.xpath("//div[text()='"+ email + "']//preceding::div[1]");
        return find(tableAge).getText();
    }











}
