import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {
    public static Logger log = LogManager.getLogger(Base.class.getName());
    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String userName, String passwd, String text) throws IOException
    {

        driver.get(prop.getProperty("url"));
        log.info("Navigate to home Page");
        LandingPage l = new LandingPage(driver);
        l.getLogin().click();
        log.info("Click on login buton -> goto login page");
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(userName);
        log.info("Write username");
        lp.getPassword().sendKeys(passwd);
        log.info("Write password");
        System.out.println(text);

        lp.getSubmit().click();
        log.info("Click submit button");

    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
        log.info("Driver close");
        driver=null;
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[2][3];
        //0th row
        data[0][0] = "mis@las.pl";
        data[0][1] = "dupa123";
        data[0][2] = "restricted user";
//1th row
        data[1][0] = "staryniedziwdz@las.pl";
        data[1][1] = "458799";
        data[1][2] = "Non restricted user";

        return data;
    }

}
