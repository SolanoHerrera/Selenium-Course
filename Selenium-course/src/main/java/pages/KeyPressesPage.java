package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By enterText = By.id("target");
    private By result = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void completeField(String text){
        driver.findElement(enterText).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
    public void enterPi(){
        completeField(Keys.chord(Keys.SHIFT, "p") + "=3.14");
    }

}
