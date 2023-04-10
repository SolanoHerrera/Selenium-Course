package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void testWysiwigEditor(){
        var editorPage = homePage.clickWyisiwigEditor();
        editorPage.clearTextArea();
        String text = "Hello World";
        editorPage.setTextArea(text);
        assertEquals(editorPage.getTextFromEditor(),text, "Editor text incorrect");
    }
}
