import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P53_BrokenLinksAndImages {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/broken_images");
        Thread.sleep(2000);

        java.util.List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total images found: " + images.size());

        int brokenCount = 0;
        for (WebElement img : images) {
            String src = img.getAttribute("src");
            boolean naturalWidth = (Boolean) ((JavascriptExecutor) driver)
                    .executeScript("return arguments[0].naturalWidth > 0;", img);
            if (!naturalWidth) {
                System.out.println("Broken image: " + src);
                brokenCount++;
            } else {
                System.out.println("Valid image: " + src);
            }
        }
        System.out.println("Total broken images: " + brokenCount);

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("\nTotal links on homepage: " + links.size());

        int emptyHrefCount = 0;
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href == null || href.isEmpty()) {
                System.out.println("Link with no href: " + link.getText());
                emptyHrefCount++;
            }
        }
        System.out.println("Links with empty/null href: " + emptyHrefCount);

        driver.quit();
    }
}
