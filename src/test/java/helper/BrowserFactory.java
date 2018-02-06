package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    private static WebDriver driver;

    public static WebDriver getBrowser(String browser){

//        if(driver!=null)return driver;

        if(browser.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver","classpath:BrowserDriver"+ File.separator+"chromedriver.exe");
            System.setProperty("webdriver.chrome.driver","src\\main\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.print("Called getBrowser");
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
            System.out.print("Called getBrowser");
        }else if(browser.equalsIgnoreCase("InternetExplorer")){
            driver = new InternetExplorerDriver();
            System.out.print("Called getBrowser");
        }
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGELOAD_TIMEOUT_SECONDS,TimeUnit.SECONDS);
//        driver.manage().window().maximize();

        return driver;
    }


}
