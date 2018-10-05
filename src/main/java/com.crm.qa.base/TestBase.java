package com.crm.qa.base;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    public static WebDriver driver = null;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;
    public static Logger log = Logger.getLogger(TestBase.class);
    public static WebDriverWait wait;
    public static ChromeOptions options;
    public static WebElement element;
    public static FirefoxProfile testprofile;
    public static DesiredCapabilities dc;
    public static TestUtil testUtil;
    public static JavascriptExecutor js;


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

    public static void initialization (String browser) throws MalformedURLException, InterruptedException {
     //String browserName = prop.getProperty("browser");
        //singelton patern
        String browserName = browser;
        if (driver==null){
            if (browserName.equals("chrome")){
                /*capabilities = DesiredCapabilities.chrome();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
                //connection to hub
                options = new ChromeOptions();
                options.addArguments("disable-infobars");
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver();
                log.info("launching Chrome browser");
               // getRunTimeInfoMessage("info", driver.toString());
            } else if (browserName.equals("firefox")){
                testprofile = new FirefoxProfile();
                testprofile.setPreference("dom.webnotifications.enabled", false);
                dc = DesiredCapabilities.firefox();
                dc.setCapability(FirefoxDriver.PROFILE, testprofile);
                FirefoxOptions opt = new FirefoxOptions();
                opt.merge(dc);
                driver = new FirefoxDriver();
                /*capabilities = DesiredCapabilities.firefox();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
                log.info("launching FF browser");
            } else if (browserName.equals("IE")){
                driver = new InternetExplorerDriver();
                /*capabilities = DesiredCapabilities.internetExplorer();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
                log.info("launching IE browser");
            } else if (browserName.equals("EDGE")){
                driver = new EdgeDriver();
                /*capabilities = DesiredCapabilities.internetExplorer();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);*/
                log.info("launching EDGE browser");
            }
        }

        e_driver = new EventFiringWebDriver(driver);
        // Now create object of EventListerHandler to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 25);

        driver.get(prop.getProperty("url"));
        log.info("enetering application URL");
        //getRunTimeInfoMessage("info", prop.getProperty("url").toString());
    }

    public static void getRunTimeInfoMessage(String messageType, String message) throws InterruptedException {
        driver.get("http://freecrm.com/");

        // Check for jQuery on the page, add it if need be
        js.executeScript("if (!window.jQuery) {"
                + "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
                + "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
                + "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
       Thread.sleep(5000);

        // Use jQuery to add jquery-growl to the page
        js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

        //js.executeScript("$.getScript('/Users/NaveenKhunteta/Documents/workspace/Test/src/testcases/jquery.growl.js')");

        // Use jQuery to add jquery-growl styles to the page
        js.executeScript("$('head').append('<link rel=\"stylesheet\" "
                + "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
        Thread.sleep(5000);

        // jquery-growl w/ no frills
        js.executeScript("$.growl({ title: 'GET', message: '/' });");

        // jquery-growl w/ colorized output
        if (messageType.equals("error")){
            js.executeScript("$.growl.error({ title: 'ERROR', message: '"+message+"' });");
        } else if (messageType.equals("info")){
            js.executeScript("$.growl.notice({ title: 'Notice', message: '"+message+"' });");
        } else if (messageType.equals("warning")){
            js.executeScript("$.growl.warning({ title: 'Warning!', message: '"+message+"' });");
        }



    }



}
