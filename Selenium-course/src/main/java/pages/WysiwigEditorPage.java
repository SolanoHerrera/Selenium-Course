package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwigEditorPage {

    private WebDriver driver;

    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    public WysiwigEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }
    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
