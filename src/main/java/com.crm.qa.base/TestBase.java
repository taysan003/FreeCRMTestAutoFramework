package com.crm.qa.base;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



public class TestBase {
    public static DesiredCapabilities capabilities;
    public static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    public static Logger log = Logger.getLogger(TestBase.class);


    public TestBase(){

        try {

                prop = new Properties();
                FileInputStream ip = new FileInputStream("G:\\SeleniumProjects\\FreeCRMTestFramework\\src\\main\\java\\com.crm.qa.config\\config.properties");
                prop.load(ip);
                log.info("getting data from config file");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   // @Parameters({"browser"})
    public static void initialization () throws MalformedURLException {
     String browserName = prop.getProperty("browser");


        if (browserName.equals("chrome")){
            /*capabilities = DesiredCapabilities.chrome();
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
            //connection to hub
           driver = new ChromeDriver();
            log.info("launching Chrome browser");
        } else if (browserName.equals("FF")){
            driver = new FirefoxDriver();
            /*capabilities = DesiredCapabilities.firefox();
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
            log.info("launching FF browser");
        } else if (browserName.equals("IE")){
           driver = new InternetExplorerDriver();
            /*capabilities = DesiredCapabilities.internetExplorer();
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
            log.info("launching IE browser");
        }


        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
        log.info("enetering application URL");
}

}
