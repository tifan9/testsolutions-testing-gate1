package testing.base.javascriptTest;

import org.testng.annotations.Test;
import testing.base.BaseTest;

public class JavaScriptTest extends BaseTest {
    @Test
    public void testScrolling(){
        homePage.goToForm();
    }
}
