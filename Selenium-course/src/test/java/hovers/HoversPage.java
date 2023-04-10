package hovers;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversPage extends BaseTest {

    @Test
    public void testHoversUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title incorrect");
        assertEquals(caption.getlinkText(),"View profile","Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/user/1"),"Link incorrect");
    }
}
