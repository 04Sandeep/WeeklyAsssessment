package MarksSpencer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuitemPage {
    static WebDriver driver;
    public MenuitemPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void menuitemPage()
    {
        driver.findElement(By.xpath("//a[@class='nav-primary__menu-link icon--hdr-arrow-right']"));
    }
}








/*
      public static void moverover()
        {
            Actions action = new Actions(driver);
            WebElement we = driver.findElement(By.xpath("//html/body/div[15]/ul/li[4]/a"));
            action.moveToElement(we).build().perform();
        }
    }*/
