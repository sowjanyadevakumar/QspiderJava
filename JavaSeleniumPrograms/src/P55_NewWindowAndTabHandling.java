import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P55_NewWindowAndTabHandling {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/windows");
        Thread.sleep(1500);

        String mainWindow = driver.getWindowHandle();
        System.out.println("Main window handle: " + mainWindow);
        System.out.println("Main window title: " + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(1500);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Total windows open: " + allHandles.size());

        String newWindow = null;
        for (String handle : allHandles) {
            if (!handle.equals(mainWindow)) {
                newWindow = handle;
                break;
            }
        }

        driver.switchTo().window(newWindow);
        System.out.println("Switched to new window: " + driver.getTitle());
        System.out.println("New window URL: " + driver.getCurrentUrl());

        WebElement heading = driver.findElement(By.tagName("h3"));
        System.out.println("New window heading: " + heading.getText());

        driver.close();
        System.out.println("New window closed");

        driver.switchTo().window(mainWindow);
        System.out.println("Back to main window: " + driver.getTitle());
        System.out.println("Windows remaining: " + driver.getWindowHandles().size());

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        driver.get("https://the-internet.herokuapp.com/login");
        Thread.sleep(1000);
        System.out.println("\nOpened new tab: " + driver.getTitle());

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1500);
        System.out.println("Logged in from new tab: " + driver.getCurrentUrl());

        driver.quit();
    }
}
