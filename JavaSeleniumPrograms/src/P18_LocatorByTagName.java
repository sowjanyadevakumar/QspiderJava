import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class P18_LocatorByTagName {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Locator: By.tagName() on Amazon ===");
        System.out.println("By.tagName() finds elements by HTML tag: a, input, button, img, h1 etc.");
        System.out.println();

        driver.get("https://www.amazon.in");
        Thread.sleep(2000);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total <a> links on Amazon homepage: " + allLinks.size());

        List<WebElement> allImages = driver.findElements(By.tagName("img"));
        System.out.println("Total <img> tags on Amazon homepage: " + allImages.size());

        List<WebElement> allInputs = driver.findElements(By.tagName("input"));
        System.out.println("Total <input> fields on Amazon homepage: " + allInputs.size());

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);

        List<WebElement> flipkartLinks = driver.findElements(By.tagName("a"));
        System.out.println("\nTotal <a> links on Flipkart homepage: " + flipkartLinks.size());

        System.out.println("\nFirst 5 link texts on Flipkart:");
        for (int i = 0; i < Math.min(5, flipkartLinks.size()); i++) {
            String text = flipkartLinks.get(i).getText().trim();
            if (!text.isEmpty()) {
                System.out.println("  " + (i + 1) + ". " + text);
            }
        }

        driver.quit();
        System.out.println("\nBrowser closed.");
    }
}
