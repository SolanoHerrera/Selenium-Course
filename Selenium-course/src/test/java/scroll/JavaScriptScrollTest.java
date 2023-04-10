package scroll;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptScrollTest extends BaseTest {

    @Test
    public void testScrollToParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
