package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }
    public void scrollToTable(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(table)).perform();
    }
}
