package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;

    private By email = By.xpath("//input[@id='user_email']");
    private By password = By.xpath("//input[@id='user_password']");
    private By submit = By.xpath("//input[@name='commit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail()
    {
        return driver.findElement(email);
    }

    public WebElement getPassword()
    {
        return driver.findElement(password);
    }

    public WebElement getSubmit()
    {
        return driver.findElement(submit);
    }
}
