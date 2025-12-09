package com.testing.pages;

import org.openqa.selenium.By;

import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class FormPage extends HomePage{
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        scrollToElement(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
