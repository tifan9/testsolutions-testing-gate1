package testing.base.form;

import org.testng.Assert;
import org.testng.annotations.Test;
import testing.base.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test
    public void testForm(){
        var textBoxPage = homePage.goToElement().clickTextBox();
        String name = "Jane";
        String email ="jane@mail.com";
        String currentAddress = "123 Main";
        String permanentAddress = "456 Street";
        textBoxPage.setFullName(name);
        textBoxPage.setEmail(email);
        textBoxPage.setCurrentAddress(currentAddress);
        textBoxPage.setPermanentAddress(permanentAddress);
        textBoxPage.clickSubmitButton();
        String actualCurrent = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualCurrent.contains(currentAddress),
                "\nSubmitted current address not found in result.\nExpected to contain: " + currentAddress + "\nActual: " + actualCurrent);

    }
}
