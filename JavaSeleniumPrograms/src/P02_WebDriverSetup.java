import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P02_WebDriverSetup {

    public static void main(String[] args) {
        System.out.println("=== WebDriver Setup ===");
        System.out.println("ChromeDriver bridges WebDriver API and Chrome browser.");
        System.out.println("Flow: Test Code -> ChromeDriver -> Chrome Browser -> Website");
        System.out.println();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        System.out.println("Driver object created: " + driver.getClass().getSimpleName());

        driver.get("https://www.amazon.in");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL  : " + driver.getCurrentUrl());

        String pageSource = driver.getPageSource();
        System.out.println("Page source length: " + pageSource.length() + " characters");

        driver.quit();
        System.out.println("WebDriver session closed.");
    }
}
