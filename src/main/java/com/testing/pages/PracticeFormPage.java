package com.testing.pages;

import org.openqa.selenium.By;

import static com.testing.utilities.JavaScriptUtility.clickJs;
import static com.testing.utilities.JavaScriptUtility.scrollToElement;

public class PracticeFormPage extends FormPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElement(femaleRadioButton);
        clickJs(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElement(sportsHobbyCheckbox);
            clickJs(sportsHobbyCheckbox);
        }
    }

    public void clickReadingCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElement(readingHobbyCheckbox);
            clickJs(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElement(musicHobbyCheckbox);
            clickJs(musicHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElement(readingHobbyCheckbox);
            clickJs(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
//    scrollToElementJS(submitButton);
        click(submitButton);
    }
}
