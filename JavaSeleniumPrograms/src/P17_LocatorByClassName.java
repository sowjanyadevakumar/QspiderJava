import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class P17_LocatorByClassName {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Locator: By.className() on Amazon ===");
        System.out.println("By.className() finds elements using CSS class attribute");
        System.out.println("Use for single class only (no spaces)");
        System.out.println();

        driver.get("https://www.amazon.in");
        Thread.sleep(2000);

        try {
            WebElement navLogo = driver.findElement(By.className("nav-logo-link"));
            System.out.println("Logo element found (className='nav-logo-link')");
            System.out.println("Tag name: " + navLogo.getTagName());
            System.out.println("Displayed: " + navLogo.isDisplayed());
        } catch (Exception e) {
            System.out.println("Note: className may vary - " + e.getClass().getSimpleName());
        }

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);

        try {
            List<WebElement> items = driver.findElements(By.className("_1AtVbE"));
            System.out.println("\nFlipkart product tiles (className='_1AtVbE'): " + items.size() + " found");
        } catch (Exception e) {
            System.out.println("Flipkart className note: " + e.getClass().getSimpleName());
        }

        System.out.println("\nfindElement(By.className()) -> finds FIRST matching element");
        System.out.println("findElements(By.className()) -> finds ALL matching elements (returns List)");

        driver.quit();
        System.out.println("Browser closed.");
    }
}
