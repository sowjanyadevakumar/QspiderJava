import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;

public class P10_MultipleWindowsAndTabs {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com");
        System.out.println("Main Tab: " + driver.getTitle());
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window Handle: " + mainWindow);

        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        driver.get("https://www.amazon.in");
        System.out.println("\nNew Tab: " + driver.getTitle());
        String amazonHandle = driver.getWindowHandle();
        Thread.sleep(1500);

        driver.switchTo().newWindow(org.openqa.selenium.WindowType.WINDOW);
        driver.get("https://www.irctc.co.in");
        System.out.println("\nNew Window: " + driver.getTitle());
        Thread.sleep(1500);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("\nTotal open windows/tabs: " + allHandles.size());

        driver.switchTo().window(mainWindow);
        System.out.println("\nSwitched back to: " + driver.getTitle());

        driver.switchTo().window(amazonHandle);
        System.out.println("Switched to: " + driver.getTitle());

        driver.close();
        System.out.println("Amazon tab closed.");

        driver.switchTo().window(mainWindow);
        System.out.println("Active: " + driver.getTitle());

        driver.quit();
        System.out.println("All windows closed.");
    }
}
