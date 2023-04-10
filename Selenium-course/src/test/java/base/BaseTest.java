package base;


import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporters;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTest {

    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dolap\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporters());
        goHome();

        homePage = new HomePage(driver);

    }
        @BeforeMethod
        public void goHome(){
            driver.get("https://the-internet.herokuapp.com/");
        }

    @AfterClass
    public void turnDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File(new File("resources/screenshots/" + result.getName()) + "png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
