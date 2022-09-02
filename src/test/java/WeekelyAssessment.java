import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WeekelyAssessment
{
          public static   WebDriver driver;

            public static void assesment()
            {
                System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.navigate().to("https://www.marksandspencer.com/c/help");

            }
            public static void menuitems()
            {
              driver.findElement(By.xpath( "//div[@class='group-of-rooms col-xs-24']/div/div[@class='list-group-item']['+x+']"));
            }
            public static void findastore()
           {
           driver.findElement(By.xpath("//span[@class = 'navigation-location-finder__large']")).click();
           }
            public static void moverover()
         {
        Actions action = new Actions(driver);
       WebElement we = driver.findElement(By.xpath("//html/body/div[15]/ul/li[4]/a"));
        action.moveToElement(we).build().perform();
         }
     public static void main(String[] args)
    {
        assesment();
        moverover();
        findastore();
        menuitems();

        }
    }
