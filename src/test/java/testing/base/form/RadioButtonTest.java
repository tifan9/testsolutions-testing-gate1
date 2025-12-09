package testing.base.form;

import org.testng.Assert;
import org.testng.annotations.Test;
import testing.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForm().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,
                "\n Female Radio Button Is Not Selected \n");
    }
}
