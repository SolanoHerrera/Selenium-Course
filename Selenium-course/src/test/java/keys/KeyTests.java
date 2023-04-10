package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTest {

    @Test
    public void testBackSpace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.completeField("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
