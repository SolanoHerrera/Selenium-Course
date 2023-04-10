package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

private WebDriver driver;
private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
private By results = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickJsAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptJsAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(results).getText();
    }
    public void clickJsConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void dismissJsConfirm(){
        driver.switchTo().alert().dismiss();
    }
    public void clickJsPrompt() {
        driver.findElement(triggerPromptButton).click();
    }
    public void setInputText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void acceptJsPrompt(){
        driver.switchTo().alert().accept();
    }
}
