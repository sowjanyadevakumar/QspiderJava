import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Arrays;

public class P05_ChromeOptions {

    public static void main(String[] args) {
        System.out.println("=== WebDriver Architecture: ChromeDriver with Options ===");
        System.out.println("Test Code -> ChromeDriver.exe -> Chrome Browser -> Website");
        System.out.println();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));

        System.out.println("ChromeOptions arguments set:");
        System.out.println("  start-maximized, disable-notifications, incognito mode");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com");

        System.out.println("Page Title   : " + driver.getTitle());
        System.out.println("Current URL  : " + driver.getCurrentUrl());
        System.out.println("Window size  : " + driver.manage().window().getSize());

        driver.quit();
        System.out.println("ChromeDriver session ended.");
    }
}
