package com.bluecrm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class Driver {

    //create a private constructor to remove access to this object
    private Driver(){}

    /*
    We make the WebDriver private, because we want to close access from outside the class.
    We are making it static, because we will use it in a static method.
     */
    //private static WebDriver driver; // default value = null

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
    Create a re-usable utility method which will return the same driver instance once we call it.
    - If an instance doesn't exist, it will create first, and then it will always return same instance.
     */
    public static WebDriver getDriver(){

        if(driverPool.get() == null){

            /*
            We will read our browserType from configuration.properties file.
            This way, we can control which browser is opened from outside our code.
             */

                        /*
            We will read our browserType from configuration.properties file.
            This way, we can control which browser is opened from outside our code.
             */
            String browserType="";
            if (System.getProperty("BROWSER") == null) {
                browserType = ConfigurationReader.getProperty("browser");
            } else {
                browserType = System.getProperty("BROWSER");
            }
            System.out.println("Browser: " + browserType);
            // Initialize WebDriver based on browser type
            switch (browserType) {
                case "remote-chrome":
                    try {
                        // assign your grid server address
                        String gridAddress = "100.27.0.96";
                        URL url = new URL("http://"+ gridAddress + ":4444/wd/hub");
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("--start-maximized");
                        driverPool.set(new RemoteWebDriver(url, chromeOptions));
                        //driverPool.set(new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"),desiredCapabilities));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote-firefox":
                    try {
                        // assign your grid server address
                        String gridAddress = "54.162.50.13";
                        URL url = new URL("http://"+ gridAddress + ":4444/wd/hub");
                        FirefoxOptions firefoxOptions=new FirefoxOptions();
                        firefoxOptions.addArguments("--start-maximized");
                        driverPool.set(new RemoteWebDriver(url, firefoxOptions));
                        //driverPool.set(new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"),desiredCapabilities));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "chrome":
                    driverPool.set(new ChromeDriver());
                    break;
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    break;
                case "edge":
                    driverPool.set(new EdgeDriver());
                    break;
                case "headless-chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless=new");
                    driverPool.set(new ChromeDriver(options));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid browser type specified in the configuration: " + browserType);
            }
//            String browserType = ConfigurationReader.getProperty("browser");
//
//            /*
//            Depending on the browserType returned from the configuration.properties
//            switch statement will determine the "case", and open the matching browser.
//             */
//            switch (browserType){
//                case "chrome":
//                    //WebDriverManager.chromedriver().setup();
//                    driverPool.set(new ChromeDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                    break;
//                case "firefox":
//                    //WebDriverManager.firefoxdriver().setup();
//                    driverPool.set(new FirefoxDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                    break;
//            }

        }

        return driverPool.get();

    }

    /*
    Create a new Driver.closeDriver(); it will use .quit() method to quit browsers, and then set the driver value back to null.
     */
    public static void closeDriver(){
        if (driverPool.get()!=null){
            /*
            This line will terminate the currently existing driver completely. It will not exist going forward.
             */
            driverPool.get().quit();
            /*
            We assign the value back to "null" so that my "singleton" can create a newer one if needed.
             */
            driverPool.remove();
        }
    }

}
