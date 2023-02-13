package uk.co.library.testbase;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;
import uk.co.library.utility.Utility;


public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() throws InterruptedException {
        selectBrowser(browser);
        new Utility().acceptCookiesandSwitchToIframe();
    }


   @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
