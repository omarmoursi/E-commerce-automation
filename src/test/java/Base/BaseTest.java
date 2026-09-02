package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reader.ReadDataFromJson;
import utilshotandvideo.ReportUtil;
import utilshotandvideo.ScreenRecorderUtil;
import utilshotandvideo.ScreenshotUtil;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import static reader.ReadDataFromJson.dataModel;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected ReadDataFromJson readDataFromJson;
    ScreenshotUtil screenshotsUtil;
    ScreenRecorderUtil screenRecorderUtil;
    ReportUtil reportUtil;



    private static final String AD_BLOCK_RULES =
            "MAP *.googlesyndication.com 127.0.0.1," +
                    "MAP *.doubleclick.net 127.0.0.1," +
                    "MAP *.googletagmanager.com 127.0.0.1," +
                    "MAP *.google-analytics.com 127.0.0.1," +
                    "MAP *.googleadservices.com 127.0.0.1," +
                    "MAP *.adservice.google.com 127.0.0.1," +
                    "MAP *.fundingchoicesmessages.google.com 127.0.0.1";

    private ChromeOptions chromeOptions(boolean headless) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--host-resolver-rules=" + AD_BLOCK_RULES);
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--remote-allow-origins=*");
        if (headless) {
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");
        }
        return options;
    }

    private FirefoxOptions firefoxOptions(boolean headless) {
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);
        options.addPreference("dom.push.enabled", false);
        if (headless) {
            options.addArguments("--headless");
            options.addArguments("--width=1920", "--height=1080");
        }
        return options;
    }

    public void setUpBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome"          -> driver = new ChromeDriver(chromeOptions(false));
            case "headlesschrome"  -> driver = new ChromeDriver(chromeOptions(true));
            case "firefox"         -> driver = new FirefoxDriver(firefoxOptions(false));
            case "headlessfirefox" -> driver = new FirefoxDriver(firefoxOptions(true));
            default -> throw new IllegalArgumentException("متصفح غير مدعوم: " + browser);
        }
    }

    @Parameters("browser")
    @BeforeClass
    public void setUp(@Optional("chrome") String browser) throws FileNotFoundException {
        setUpBrowser(browser);
        driver.manage().window().maximize();
        driver.get(dataModel().URL);
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(Method method) throws Exception {
        driver.get(dataModel().URL);
        screenRecorderUtil.startRecord(method.getName());
    }
    @AfterMethod

    public void afterMethods(Method method, ITestResult result) throws Exception
    {
        screenshotsUtil=new ScreenshotUtil(driver);
       screenshotsUtil.takescreenshot(method.getName());
        reportUtil.setStatus(method,result);
        screenRecorderUtil.stopRecord();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) driver.quit();
    }

    @BeforeSuite
    public void beforeSuite() {
        reportUtil = new ReportUtil(driver);
        reportUtil.createReport();
    }

    @AfterSuite
    public void afterSuite() {
        reportUtil = new ReportUtil(driver);
        reportUtil.flushReport();
    }


}

/*


package Base;

import closead.CloseAd;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import Pages.HomePage;
//  import Utils.ScreenRecorderUtil;
//   import Utils.UtilsTests;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import static reader.ReadDataFromJson.dataModel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;

import java.util.List;
import java.util.Map;


 /*
public class BaseTest {


    WebDriver driver;

    //  UtilsTests utilsTests;
    protected HomePage homePage;
    public ChromeOptions chromeOptions;
    public FirefoxOptions firefoxOptions;
    public   CloseAd close;




    @Parameters("browser")
    @BeforeClass
    public void setUp(@Optional("chrome") String browser) throws FileNotFoundException {
        setUpBrowser(browser);
        driver.manage().window().maximize();
        driver.get(dataModel().URL);
        homePage = new HomePage(driver);

    }

    @Parameters("browser")
    public void setUpBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("headlessChrome")) {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("headlessfirefox")) {
            firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--headless");
            driver = new FirefoxDriver(firefoxOptions);
        }
    }

    @BeforeMethod
    public void goHome(Method method) throws Exception {
      //  utilsTests = new UtilsTests(driver);
      //  close = new CloseAd(driver);

        driver.get(dataModel().URL);
    //    ScreenRecorderUtil.startRecord(method.getName());
     //   utilsTests.createTestCaseInReport(method);
    }
/*
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
*/

/*
    @AfterMethod
    public void afterMethod(Method method, ITestResult result) throws Exception {
     //   utilsTests = new UtilsTests(driver);
     //   utilsTests.takeScreenShot(method);
      //  ScreenRecorderUtil.stopRecord();
      //  utilsTests.setStatus(method,result);
    }



    @BeforeSuite
    public void beforeSuite(){
        utilsTests = new UtilsTests(driver);
        utilsTests.createReport();
    }

    @AfterSuite
    public void afterSuite(){
        utilsTests = new UtilsTests(driver);
        utilsTests.flushReport();
    }
*/
/*
//}
*/
