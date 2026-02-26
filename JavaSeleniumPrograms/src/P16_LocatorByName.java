import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P16_LocatorByName {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Locator: By.name() ===");
        System.out.println("By.name() finds element using the 'name' HTML attribute");
        System.out.println("Commonly used in login forms and search boxes");
        System.out.println();

        driver.get("https://www.google.com");
        Thread.sleep(1500);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Flipkart sale today");
        System.out.println("Typed in Google search box (name='q'): Flipkart sale today");
        Thread.sleep(1000);
        searchBox.clear();

        driver.get("https://www.irctc.co.in");
        Thread.sleep(2000);

        System.out.println("\nOpened IRCTC login page");
        System.out.println("IRCTC uses 'name' attributes on login form fields");
        System.out.println("Example: driver.findElement(By.name('userid'))");
        System.out.println("Example: driver.findElement(By.name('password'))");

        try {
            WebElement userId = driver.findElement(By.name("userid"));
            userId.sendKeys("test_user_irctc");
            System.out.println("Typed IRCTC userId (name='userid')");
            Thread.sleep(500);
            userId.clear();
        } catch (Exception e) {
            System.out.println("IRCTC page structure note: " + e.getClass().getSimpleName());
        }

        driver.quit();
        System.out.println("Browser closed.");
    }
}
