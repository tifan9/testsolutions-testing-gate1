package com.testing.pages;

import com.testing.elements.ElementPage;
import org.openqa.selenium.By;

import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class LinkPage extends ElementPage {
    private By createdLink = By.id("created");
    private By responseLink  = By.cssSelector("#linkResponse");

    public void clickCreateLink(){
        scrollToElement(createdLink);
        click(createdLink);
    }
    public String getResponse(){
//        delay(1000);
        return find(responseLink).getText();
    }
}
