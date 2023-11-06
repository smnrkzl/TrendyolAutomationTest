package testRunners;

import com.cucumber.listener.Reporter;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

//import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import util.DriverFactory;

import java.io.File;


@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions", "util"},
        tags = "@Valid2",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
       //"html:Reports/ExtentReport/ExtentReportRegression.html"
                //"com.cucumber.listener.ExtentCucumberFormatter:target/test-output/Extent.html"
                //"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
        }
)
public class runner extends AbstractTestNGCucumberTests {

    //static WebDriver driver = DriverFactory.getDriver();
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
//"src/main/java/XMLFiles/extendReportSet.xml"
    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig(new File("src/main/java/XMLFiles/extendReportSet.xml"));

        Reporter.setSystemInfo("QA Tester : ", "Sema Nur Kızıl");
        Reporter.setSystemInfo("Application name : ", "Register Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");

    }

}