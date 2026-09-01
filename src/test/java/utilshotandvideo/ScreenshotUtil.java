package utilshotandvideo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    WebDriver driver;


    public ScreenshotUtil(WebDriver driver)
    {
        this.driver=driver;
    }

    public  void takescreenshot(String name) throws IOException {

        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("reports/"+name+".png"));

    }








}
