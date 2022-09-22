package Test;

import MarksSpencer.MenuitemPage;
import MarksSpencer.MouseOver;
import org.openqa.selenium.WebDriver;

public class Pagefactory {
    WebDriver driver;
    public Pagefactory(WebDriver driver)
    {
        this.driver = driver;
    }
    private MenuitemPage menuitemPage;
    private MouseOver mouseOver;

    public MenuitemPage getMenuitemPage() {
        if (menuitemPage == null) {
            menuitemPage = new MenuitemPage(driver);
        }
        return menuitemPage;
    }

    public MouseOver getMouseOver() {
        if(mouseOver == null)
        {
            mouseOver = new MouseOver(driver);
        }
        return mouseOver;

    }
}

