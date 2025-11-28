package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class HomePage extends BasePage{
    private WebDriver driver;
    private By elementCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By formCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    public ElementPage goToElement(){
        scrollToElement(elementCard);
        click(elementCard);
        return new ElementPage();
    }

    public FormPage goToForm(){
        scrollToElement(formCard);
        click(formCard);
        return new FormPage();
    }














}
