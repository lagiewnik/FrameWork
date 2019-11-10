package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    private By signIn = By.xpath("//span[contains(.,'Login')]");
    private By centerText = By.xpath(".//div[@class='text-center']/h2");
    private By navBar = By.xpath("//*[contains(@class, 'nav navbar-nav navbar-right')]");
    private  By headerText = By.xpath("//*[contains(@class, 'video-banner')]//h3");
    private By popup = By.xpath("//button[text()='NO THANKS']");



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
    public WebElement getHeaderText()
    {
        return driver.findElement(headerText);
    }
    public WebElement getPopUp()
    {
        return driver.findElement(popup);
    }
    public int getPopUpSize()
    {
        return driver.findElements(popup).size();
    }

}
