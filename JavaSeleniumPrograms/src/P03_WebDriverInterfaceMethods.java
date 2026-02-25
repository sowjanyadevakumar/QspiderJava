import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_WebDriverInterfaceMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        System.out.println("=== WebDriver Interface Key Methods ===");
        System.out.println("get(url)            - load a URL");
        System.out.println("getTitle()          - get page title");
        System.out.println("getCurrentUrl()     - get current URL");
        System.out.println("getPageSource()     - get page HTML");
        System.out.println("findElement(By)     - find single element");
        System.out.println("findElements(By)    - find list of elements");
        System.out.println("close()             - close current window");
        System.out.println("quit()              - close all windows + driver");
        System.out.println();

        driver.get("https://www.flipkart.com");
        System.out.println("get()        -> " + driver.getCurrentUrl());
        System.out.println("getTitle()   -> " + driver.getTitle());

        driver.manage().window().maximize();
        System.out.println("Window maximized");

        System.out.println("getWindowHandle() -> " + driver.getWindowHandle());
        System.out.println("getWindowHandles() count -> " + driver.getWindowHandles().size());

        driver.quit();
        System.out.println("quit() called - all windows closed.");
    }
}
