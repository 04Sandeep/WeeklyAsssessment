package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
    protected static Pagefactory pageFactory;
    public static WebDriver driver;

    public static void assesement()
    {
        driver = new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        driver.navigate().to("https://www.marksandspencer.com/c/help");
        pageFactory = new Pagefactory(driver);
    }
}




