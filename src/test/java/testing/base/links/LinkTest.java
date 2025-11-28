package testing.base.links;

import org.testng.Assert;
import org.testng.annotations.Test;
import testing.base.BaseTest;

public class LinkTest extends BaseTest {
    @Test
    public void testLinks(){
        var linkPage = homePage.goToElement().clickLinks();
        linkPage.clickCreateLink();
        String actualResponse = linkPage.getResponse();
        Assert.assertEquals(actualResponse.contains("201")
                && actualResponse.contains("Created"),
                "\n Actual Response (" + actualResponse + ")\n Does not Contain '201' and 'Created' \n"
                );
    }











}
