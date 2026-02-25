import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_SeleniumToolsOverview {

    public static void main(String[] args) {
        System.out.println("=== Selenium Tools Overview ===");
        System.out.println();
        System.out.println("1. Selenium IDE");
        System.out.println("   - Browser plugin (Chrome/Firefox)");
        System.out.println("   - Record and playback test tool");
        System.out.println("   - No programming knowledge required");
        System.out.println("   - Exports to Java, Python, JS");
        System.out.println();
        System.out.println("2. Selenium WebDriver");
        System.out.println("   - Programmatic browser control via API");
        System.out.println("   - Supports Chrome, Firefox, Edge, Safari");
        System.out.println("   - Works with Java, Python, C#, JS, Ruby");
        System.out.println("   - Directly communicates with browser drivers");
        System.out.println();
        System.out.println("3. Selenium Grid");
        System.out.println("   - Runs tests in parallel across machines/browsers");
        System.out.println("   - Hub-Node architecture");
        System.out.println("   - Reduces total test execution time");
        System.out.println();
        System.out.println("--- Demo: WebDriver launching Flipkart ---");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        System.out.println("Selenium WebDriver opened: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        driver.quit();
        System.out.println("Browser closed.");
    }
}
