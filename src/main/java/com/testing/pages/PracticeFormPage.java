package com.testing.pages;

import org.openqa.selenium.By;

import static com.testing.utilities.JavaScriptUtility.clickJs;
import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class PracticeFormPage extends FormPage{
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("email");
    private By femaleRadioButton = By.id("gender-radio-2");
    private By mobile = By.id("userNumber");
    private By sportHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton(){
        scrollToElement(femaleRadioButton);
        clickJs(femaleRadioButton);
    }
    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }
    public void clickSportCheckbox(){
        if(!find(sportHobbyCheckbox).isSelected()){
            scrollToElement(sportHobbyCheckbox);
            clickJs(sportHobbyCheckbox);
        }
    }
    public void clickSubmitButton(){
        click(submitButton);
    }

}
