package com.testing.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{

    public static void scrollToElement(By locator){
        WebElement element = driver.findElement(locator);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, element);

    }
    public static void clickJs(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = ((JavascriptExecutor)driver);
        executor.executeScript("arguments[0].click();", element);
    }














}
