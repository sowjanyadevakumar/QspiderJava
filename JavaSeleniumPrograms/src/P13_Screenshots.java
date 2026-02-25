import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class P13_Screenshots {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("=== Taking Screenshots ===");

        driver.get("https://www.irctc.co.in");
        Thread.sleep(2000);
        captureScreenshot(driver, "irctc_homepage.png");

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        captureScreenshot(driver, "flipkart_homepage.png");

        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        captureScreenshot(driver, "amazon_homepage.png");

        driver.quit();
        System.out.println("Browser closed. Screenshots saved.");
    }

    static void captureScreenshot(WebDriver driver, String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.home") + "/Desktop/" + fileName);
        Files.copy(srcFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
    }
}
