import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class P06_FirefoxOptions {

    public static void main(String[] args) {
        System.out.println("=== WebDriver Architecture: FirefoxDriver with Options ===");
        System.out.println("Test Code -> GeckoDriver (geckodriver.exe) -> Firefox -> Website");
        System.out.println();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--private");

        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("dom.webnotifications.enabled", false);
        profile.setPreference("geo.enabled", false);
        options.setProfile(profile);

        System.out.println("FirefoxOptions set: private mode, notifications disabled, geolocation off");

        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.amazon.in");

        System.out.println("Browser      : Firefox (GeckoDriver)");
        System.out.println("Page Title   : " + driver.getTitle());
        System.out.println("Current URL  : " + driver.getCurrentUrl());

        driver.quit();
        System.out.println("FirefoxDriver session ended.");
    }
}
