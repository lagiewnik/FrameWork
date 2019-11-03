import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class ValidateHomePageCenterText extends Base {

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

        Assert.assertEquals(lp.getCenterText().getText().toLowerCase(), "featured courses");
        log.info("Center text is correct");
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
        log.info("Driver Close");
    }



}
