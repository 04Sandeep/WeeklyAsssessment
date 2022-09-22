package MarksSpencer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver
{
        static WebDriver driver;

        public MouseOver(WebDriver driver)
        {
                this.driver = driver;
        }

        public static void mouseover()
        {
                Actions act = new Actions(driver);
                act.moveToElement(driver.findElement(By.xpath("//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]"))).perform();
                driver.findElement(By.xpath("//a[contains(text(),'View All')])[1]")).click();
        }

        }

