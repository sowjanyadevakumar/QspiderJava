import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class P19_LocatorByLinkText {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.irctc.co.in");
        Thread.sleep(2000);
        System.out.println("=== Locator: By.linkText() and By.partialLinkText() on IRCTC ===");
        System.out.println("linkText()        - exact full text of the <a> link");
        System.out.println("partialLinkText() - partial substring of the <a> link text");
        System.out.println();

        try {
            WebElement loginLink = driver.findElement(By.linkText("LOGIN"));
            System.out.println("Found by linkText('LOGIN'): " + loginLink.getText());
            System.out.println("Tag: " + loginLink.getTagName() + " | Displayed: " + loginLink.isDisplayed());
        } catch (Exception e) {
            System.out.println("linkText 'LOGIN' note: " + e.getClass().getSimpleName());
        }

        driver.get("https://www.amazon.in");
        Thread.sleep(2000);

        try {
            List<WebElement> cartLinks = driver.findElements(By.partialLinkText("Cart"));
            System.out.println("\nFound by partialLinkText('Cart') on Amazon: " + cartLinks.size() + " links");
            for (WebElement link : cartLinks) {
                System.out.println("  Link text: '" + link.getText() + "'");
            }
        } catch (Exception e) {
            System.out.println("partialLinkText 'Cart' note: " + e.getClass().getSimpleName());
        }

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);

        try {
            List<WebElement> loginLinks = driver.findElements(By.partialLinkText("Login"));
            System.out.println("\nFound by partialLinkText('Login') on Flipkart: " + loginLinks.size() + " links");
        } catch (Exception e) {
            System.out.println("partialLinkText 'Login' on Flipkart: " + e.getClass().getSimpleName());
        }

        driver.quit();
        System.out.println("\nBrowser closed.");
    }
}
