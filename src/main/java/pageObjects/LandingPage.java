package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    By signIn = By.xpath("//span[contains(.,'Login')]");
    By centerText = By.xpath(".//div[@class='text-center']/h2");
    By navBar = By.xpath("//*[contains(@class, 'nav navbar-nav navbar-right')]");


    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin()
    {
        return driver.findElement(signIn);
    }

    public WebElement getCenterText()
    {
        return driver.findElement(centerText);
    }

    public WebElement getCNavBar()
    {
        return driver.findElement(navBar);
    }

}
