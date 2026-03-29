import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P54_InfiniteScrollHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(2000);

        java.util.List<WebElement> paragraphs = driver.findElements(By.cssSelector(".jscroll-added p, .infinite-scroll p"));
        System.out.println("Initial paragraph count: " + paragraphs.size());

        int scrollRounds = 4;
        for (int i = 0; i < scrollRounds; i++) {
            long lastHeight = (Long) js.executeScript("return document.body.scrollHeight");
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(2000);

            long newHeight = (Long) js.executeScript("return document.body.scrollHeight");
            System.out.println("Scroll " + (i + 1) + " - Old height: " + lastHeight + ", New height: " + newHeight);

            if (newHeight == lastHeight) {
                System.out.println("No more content to load - reached end of page");
                break;
            }
        }

        paragraphs = driver.findElements(By.cssSelector(".jscroll-added p, .infinite-scroll p"));
        System.out.println("Paragraph count after scrolling: " + paragraphs.size());

        long finalHeight = (Long) js.executeScript("return document.body.scrollHeight");
        System.out.println("Final page height: " + finalHeight + "px");

        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(1000);
        System.out.println("Scrolled back to top");

        driver.quit();
    }
}
