package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    static WebDriver driver;
    //static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static ThreadLocal<WebDriver> Driver2 = new ThreadLocal();
    static Properties properties;

    @Parameters("browser")
    public static WebDriver initialize_Driver(String browser) {

        properties = ConfigReader.getProperties();
        ChromeOptions options = null;
        if (browser.equals("Chrome")) {

            WebDriverManager.chromedriver().setup();
           options = new ChromeOptions();
            options.addArguments("--incognito");
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(ChromeOptions.CAPABILITY, options);
            options.merge(cap);
            //driver = new ChromeDriver(options);
            Driver2.set(new ChromeDriver(options));
            /*WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();*/
        } else if (browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            Driver2.set(new FirefoxDriver());
            //driver = new FirefoxDriver();
        } else {
            WebDriverManager.edgedriver().setup();//Bos gonderirse
            Driver2.set(new EdgeDriver());
            //driver = new EdgeDriver();
        }
        /*String url = properties.getProperty("url");
        int impWait = Integer.parseInt(properties.getProperty("implicityWait"));
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        driver.get(url);*/
        getDriver().manage().window().maximize();
        /*driver.manage().timeouts().pageLoadTimeout(impWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(pageWait, TimeUnit.SECONDS);*/
        return getDriver();

    }

    public static synchronized WebDriver getDriver(){
        //return driver;
        return Driver2.get();

    }


}