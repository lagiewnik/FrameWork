import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;

public class ValidateNavigationBar extends Base {
    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
        driver.get(prop.getProperty("url"));
        log.info("URL is geting");
    }

    @Test
    public void basePageNavigation() throws IOException
    {


        LandingPage lp = new LandingPage(driver);

        Assert.assertTrue(lp.getCNavBar().isDisplayed());
        log.info("Navigation bar is ready");
    }

@AfterTest
    public void tearDown()
{
    driver.close();
    log.info("driver close");
}

}
