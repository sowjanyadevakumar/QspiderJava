import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class P20_LocatorByXPath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Locator: By.xpath() ===");
        System.out.println("XPath = XML Path Language to navigate HTML DOM");
        System.out.println("Absolute XPath: /html/body/div[1]/...  (fragile)");
        System.out.println("Relative XPath: //tag[@attr='value']  (preferred)");
        System.out.println();

        driver.get("https://www.facebook.com");
        Thread.sleep(2000);

        System.out.println("--- Facebook Login using XPath ---");

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("testuser@gmail.com");
        System.out.println("Typed email  -> XPath: //input[@id='email']");

        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys("Test@1234");
        System.out.println("Typed pass   -> XPath: //input[@id='pass']");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
        System.out.println("Login button -> XPath: //button[@name='login'] | Text: " + loginBtn.getText());

        email.clear();
        pass.clear();

        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        System.out.println("\n--- Amazon XPath Strategies ---");

        try {
            WebElement searchInput = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
            searchInput.sendKeys("Samsung mobile");
            System.out.println("Amazon search (by id attr): typed 'Samsung mobile'");
            Thread.sleep(800);
            searchInput.clear();
        } catch (Exception e) {
            System.out.println("Amazon search XPath: " + e.getClass().getSimpleName());
        }

        try {
            List<WebElement> navLinks = driver.findElements(By.xpath("//a[contains(@class,'nav')]"));
            System.out.println("Nav links (contains class 'nav'): " + navLinks.size() + " found");

            WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign in']"));
            System.out.println("Sign In text element found: " + signIn.getText());
        } catch (Exception e) {
            System.out.println("Amazon nav XPath note: " + e.getClass().getSimpleName());
        }

        System.out.println("\n--- XPath Axes ---");
        System.out.println("//input[@id='email']/..          -> parent of email input");
        System.out.println("//div[@class='nav']//a           -> all <a> inside nav div");
        System.out.println("//button[contains(text(),'Cart')]-> button with 'Cart' text");
        System.out.println("(//input[@type='text'])[1]       -> first text input on page");

        driver.quit();
        System.out.println("\nBrowser closed.");
    }
}
