package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class LinkPage extends ElementPage {
    private By createdLink = By.id("created");
    private By responseLink  = By.id("linkResponse");
    private WebDriver driver;
    public void clickCreateLink(){
        scrollToElement(createdLink);
        click(createdLink);
    }
    public String getResponse(){
        delay(2000);
        return find(responseLink).getText();
    }
}
