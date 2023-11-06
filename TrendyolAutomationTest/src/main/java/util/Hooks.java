package util;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import java.util.Properties;

public class Hooks {

    WebDriver driver;
    Properties properties;
    //static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    @Before
    public void before() {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver(browser);
    }

    /*@After
    public void after() {
com.cucumber.listener.Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");

        com.cucumber.listener.Reporter.setSystemInfo("QA Tester : ", "Sema Nur Kızıl");//kendi bilgilerinizi ekleyin.
        com.cucumber.listener.Reporter.setSystemInfo("Application name : ", "Register Test  ");
        com.cucumber.listener.Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        com.cucumber.listener.Reporter.setSystemInfo("Department", "QA");
        com.cucumber.listener.Reporter.setTestRunnerOutput("Test execution Cucumber Report");
        driver.quit();
    }*/
}