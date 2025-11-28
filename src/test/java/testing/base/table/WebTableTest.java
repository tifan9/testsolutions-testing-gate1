package testing.base.table;

import org.testng.Assert;
import org.testng.annotations.Test;
import testing.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable(){
        String email = "cierra@example.com";
        String expectedAge="39";
        var webTablePage = homePage.goToElement().clickWebTable();
        webTablePage.clickEdit(email);
        webTablePage.setAge("39");
        webTablePage.clickSubmit();
        String actualSalary = webTablePage.getTableAge(email);
        Assert.assertEquals(actualSalary,expectedAge, "\n Actual & Expected Agge Do Not Match \n");
    }
}
