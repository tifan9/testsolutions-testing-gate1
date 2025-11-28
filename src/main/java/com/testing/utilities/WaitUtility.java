package com.testing.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtility extends Utility{
    public static void fluentWait(int seconds, By locator){
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(seconds));
    }
    public static void explicitWait(int seconds, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
