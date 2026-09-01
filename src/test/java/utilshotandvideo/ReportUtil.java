package utilshotandvideo;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class ReportUtil {

    WebDriver driver;
    protected static ExtentReports extent;
    protected static ExtentTest test;

    public ReportUtil(WebDriver driver) {
        this.driver = driver;
    }


    public void createReport(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("report/report.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("My Report");
        extent.attachReporter(spark);
    }
    public void setStatus(Method method, ITestResult result) {
        test = extent.createTest(method.getName());
        if (result.getStatus()==ITestResult.SUCCESS){
            test.pass("Test Pass");
        } else if (result.getStatus()==ITestResult.FAILURE) {
            test.fail("Test Fail");
        }else{
            test.skip("Test Skipped");
        }
        test.addScreenCaptureFromPath(method.getName()+".png");

        test.log(Status.INFO,"<a href='"+method.getName()+".avi'>Download Video</a>");

    }

    public void flushReport(){
        extent.flush();
    }
}





