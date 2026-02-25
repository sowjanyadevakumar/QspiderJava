import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class P04_MultipleDriverTypes {

    static void runWithChrome(String url) {
        System.out.println("\n--- ChromeDriver ---");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Browser : Chrome");
        System.out.println("Title   : " + driver.getTitle());
        System.out.println("URL     : " + driver.getCurrentUrl());
        driver.quit();
        System.out.println("Chrome closed.");
    }

    static void runWithFirefox(String url) {
        System.out.println("\n--- FirefoxDriver ---");
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        driver.get(url);
        System.out.println("Browser : Firefox");
        System.out.println("Title   : " + driver.getTitle());
        System.out.println("URL     : " + driver.getCurrentUrl());
        driver.quit();
        System.out.println("Firefox closed.");
    }

    public static void main(String[] args) {
        System.out.println("=== WebDriver Class Diagram - Multiple Drivers ===");
        System.out.println("RemoteWebDriver implements WebDriver");
        System.out.println("  ChromeDriver   extends RemoteWebDriver");
        System.out.println("  FirefoxDriver  extends RemoteWebDriver");
        System.out.println("  EdgeDriver     extends RemoteWebDriver");
        System.out.println();
        System.out.println("Polymorphism: WebDriver driver = new ChromeDriver();");

        runWithChrome("https://www.irctc.co.in");
        runWithFirefox("https://www.irctc.co.in");
    }
}
