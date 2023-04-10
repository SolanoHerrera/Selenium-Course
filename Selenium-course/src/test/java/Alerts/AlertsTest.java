package Alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTest {

    @Test
    public void acceptAlertTest(){
        var alertsPage = homePage.clickJsAlerts();
        alertsPage.clickJsAlert();
        alertsPage.acceptJsAlert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert", "Result message incorrect");

    }
    @Test
    public void dismissAlertTest(){
        var alertsPage = homePage.clickJsAlerts();
        String text = "I am a JS Confirm";
        alertsPage.clickJsConfirm();
        assertEquals(alertsPage.getAlertText(),text,"Alert text incorrect");
        alertsPage.dismissJsConfirm();
    }
    @Test
    public void jsPromptAlertInput(){
        var alertsPage = homePage.clickJsAlerts();
        alertsPage.clickJsPrompt();
        String text = "Solano";
        alertsPage.setInputText(text);
        alertsPage.acceptJsPrompt();
        assertEquals(alertsPage.getResult(),"You entered: " + text, "Result message incorrect");
    }
}
