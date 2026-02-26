import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class P07_EdgeBrowserControl {

    public static void main(String[] args) {
        System.out.println("=== WebDriver Architecture: EdgeDriver ===");
        System.out.println("Test Code -> EdgeDriver (msedgedriver.exe) -> Edge -> Website");
        System.out.println();

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--inprivate");
        options.addArguments("--disable-notifications");

        System.out.println("Supported browsers and their drivers:");
        System.out.println("  Chrome  -> ChromeDriver (chromedriver.exe)");
        System.out.println("  Firefox -> GeckoDriver  (geckodriver.exe)");
        System.out.println("  Edge    -> EdgeDriver   (msedgedriver.exe)");
        System.out.println("  Safari  -> SafariDriver (built-in on macOS)");
        System.out.println();

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.irctc.co.in");

        System.out.println("Browser    : Microsoft Edge");
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("URL        : " + driver.getCurrentUrl());

        driver.quit();
        System.out.println("EdgeDriver session ended.");
    }
}
