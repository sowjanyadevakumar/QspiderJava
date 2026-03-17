import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P41_HoverAction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/hovers");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);

        java.util.List<WebElement> figures = driver.findElements(By.className("figure"));
        System.out.println("Total hoverable figures: " + figures.size());

        for (int i = 0; i < figures.size(); i++) {
            actions.moveToElement(figures.get(i)).perform();
            Thread.sleep(1000);

            WebElement caption = figures.get(i).findElement(By.className("figcaption"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(caption));

            String name = caption.findElement(By.tagName("h5")).getText();
            String profileLink = caption.findElement(By.tagName("a")).getAttribute("href");
            System.out.println("User " + (i + 1) + ": " + name);
            System.out.println("  Profile link: " + profileLink);
        }

        actions.moveToElement(figures.get(0)).perform();
        Thread.sleep(500);
        WebElement viewProfile = figures.get(0).findElement(By.tagName("a"));
        viewProfile.click();
        Thread.sleep(1000);

        System.out.println("\nNavigated to: " + driver.getCurrentUrl());
        System.out.println("Page says: " + driver.findElement(By.tagName("h1")).getText());

        driver.quit();
    }
}
