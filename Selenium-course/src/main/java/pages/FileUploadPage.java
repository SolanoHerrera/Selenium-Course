package pages;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputFile).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }
    public String getUploadedFile(){
        return driver.findElement(uploadedFiles).getText();
    }
}
