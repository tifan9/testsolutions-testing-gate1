package com.testing.utilities;

import com.testing.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {
    public static WebDriver driver;
    public static void setUtilityDriver(){
        driver = BasePage.driver;
    }
}
