package Alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("C:\\Users\\dolap\\Downloads\\chromedriver_win32\\chromedriver.exe");
        assertEquals(fileUploadPage.getUploadedFile(),"chromedriver.exe","Upload Incorrect");
    }
}
