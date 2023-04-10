package scroll;

import base.BaseTest;
import org.testng.annotations.Test;

public class ScrollToTableTest extends BaseTest {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
}
