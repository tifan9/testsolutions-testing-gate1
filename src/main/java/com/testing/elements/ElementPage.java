package com.testing.elements;

import com.testing.pages.HomePage;
import com.testing.pages.LinkPage;
import com.testing.pages.TextBoxPage;
import com.testing.pages.WebTablePage;
import org.openqa.selenium.By;

public class ElementPage extends HomePage {
    private By WebTable = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linkMenu = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By textBox = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public TextBoxPage clickTextBox(){
        click(textBox);
        return new TextBoxPage();
    }
    public WebTablePage clickWebTable(){
        click(WebTable);
        return new WebTablePage();
    }
    public LinkPage clickLinks(){
        click(linkMenu);
        return new LinkPage();
    }
}
