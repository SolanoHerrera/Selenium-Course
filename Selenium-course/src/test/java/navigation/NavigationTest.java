package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTo(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchTab("New Window");
    }
}
