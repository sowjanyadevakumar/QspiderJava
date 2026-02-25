import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P12_ScrollingActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.flipkart.com");
        System.out.println("=== Scrolling on Flipkart ===");
        Thread.sleep(1500);

        System.out.println("\n--- Scroll Down by pixels ---");
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);
        System.out.println("Scrolled down 500px");

        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(1000);
        System.out.println("Scrolled down another 500px");

        System.out.println("\n--- Scroll to bottom of page ---");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1500);
        System.out.println("Scrolled to page bottom");

        System.out.println("\n--- Scroll to top of page ---");
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
        System.out.println("Scrolled back to top");

        System.out.println("\n--- Scroll by specific amount on Amazon ---");
        driver.get("https://www.amazon.in");
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(1000);
        System.out.println("Scrolled Amazon page down 1000px");

        driver.quit();
        System.out.println("Browser closed.");
    }
}
