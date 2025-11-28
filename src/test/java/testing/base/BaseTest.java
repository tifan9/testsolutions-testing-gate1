package testing.base;

import com.testing.pages.BasePage;
import com.testing.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static com.testing.utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String url = "https://toolsqa.com/";
    // this is the sub page of the first website link
    private String url1 ="https://demoqa.com/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url1);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();

    }

//    @AfterMethod
//    public void
//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
