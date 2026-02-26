import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_BrowserNavigation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Browser Navigation Commands ===");

        driver.get("https://www.flipkart.com");
        System.out.println("Opened: " + driver.getTitle());
        Thread.sleep(1500);

        driver.get("https://www.amazon.in");
        System.out.println("Navigated to: " + driver.getTitle());
        Thread.sleep(1500);

        driver.navigate().back();
        System.out.println("Back to: " + driver.getTitle());
        Thread.sleep(1500);

        driver.navigate().forward();
        System.out.println("Forward to: " + driver.getTitle());
        Thread.sleep(1500);

        driver.navigate().refresh();
        System.out.println("Refreshed: " + driver.getTitle());
        Thread.sleep(1000);

        driver.navigate().to("https://www.irctc.co.in");
        System.out.println("navigate().to(): " + driver.getTitle());
        Thread.sleep(1000);

        System.out.println("\nNavigation Summary:");
        System.out.println("driver.get(url)           - load new URL, resets history");
        System.out.println("driver.navigate().to(url) - load URL, keeps history");
        System.out.println("driver.navigate().back()  - browser Back button");
        System.out.println("driver.navigate().forward() - browser Forward button");
        System.out.println("driver.navigate().refresh() - browser Refresh (F5)");

        driver.quit();
    }
}
