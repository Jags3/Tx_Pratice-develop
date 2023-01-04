package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DriverUtil {
    public static final String REMOTE = "BrowserStack";
    private static final Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
    private static final HashMap<String, String> checkLogin = new HashMap<String, String>();


    public static AndroidDriver<MobileElement> invokeArtistGrowthApp() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("device", System.getProperty("os.name"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.payfare.artistgrowth");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.payfare.paidapp.ui.authentication.WelcomeScreenActivity");
            try {
                GlobalUtil.setMDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Connection not established");
        }
        return (AndroidDriver<MobileElement>) GlobalUtil.getMDriver();
    }

    public static AndroidDriver<MobileElement> invokeA23Apps() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("device", System.getProperty("os.name"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "air.com.ace2three.mobile");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.a23.games.platform.BaseLoaderActivity");
            try {
                GlobalUtil.setMDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Connection not established");
        }
        return (AndroidDriver<MobileElement>) GlobalUtil.getMDriver();
    }

    public static AndroidDriver<MobileElement> invokeArtistGrowthApp1() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("device", System.getProperty("os.name"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.payfare.artistgrowth");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.payfare.paidapp.ui.authentication.WelcomeScreenActivity");
            try {
                GlobalUtil.setMDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (Throwable t) {
            System.out.println("Connection not established");
        }
        return (AndroidDriver<MobileElement>) GlobalUtil.getMDriver();
    }

    public static WebDriver getBrowser(String exeEnv, String browserName) {
        if (exeEnv.equalsIgnoreCase("Window")) {
            if (browserName.equalsIgnoreCase("CHROME")) {
                WebDriverManager.chromedriver().setup();
                GlobalUtil.setDriver(new ChromeDriver());
            } else if (browserName.equalsIgnoreCase("IE")) {
                WebDriverManager.iedriver().setup();
                GlobalUtil.setDriver(new InternetExplorerDriver());
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                WebDriverManager.firefoxdriver().setup();
                GlobalUtil.setDriver(new FirefoxDriver());

                //For Mac Operating System
            } else if (exeEnv.equalsIgnoreCase("MAC")) {
                if (browserName.equalsIgnoreCase("CHROME")) {
                    WebDriverManager.chromedriver().setup();
                    GlobalUtil.setDriver(new ChromeDriver());
                } else if (browserName.equalsIgnoreCase("IE")) {
                    WebDriverManager.iedriver().setup();
                    GlobalUtil.setDriver(new InternetExplorerDriver());
                } else if (browserName.equalsIgnoreCase("Firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    GlobalUtil.setDriver(new FirefoxDriver());
                } else if (browserName.equalsIgnoreCase("Safari")) {
                    GlobalUtil.setDriver(new SafariDriver());
                }
            }
        }
        //GlobalUtil.getDriver().get(Constant.URL);
        return GlobalUtil.getDriver();
    }

    public static AndroidDriver<MobileElement> invokeFlipkartSauceLab() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("device", System.getProperty("os.name"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.flipkart.android");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.flipkart.android.SplashActivity");
            try {
                GlobalUtil.setMDriver(new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Connection not established");
        }

        return (AndroidDriver<MobileElement>) GlobalUtil.getMDriver();
    }
}
