import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P38_DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(2000);

        WebElement sourceA = driver.findElement(By.id("column-a"));
        WebElement targetB = driver.findElement(By.id("column-b"));

        System.out.println("Before drag:");
        System.out.println("Column A: " + sourceA.findElement(By.tagName("header")).getText());
        System.out.println("Column B: " + targetB.findElement(By.tagName("header")).getText());

        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceA)
                .moveToElement(targetB)
                .release()
                .build()
                .perform();
        Thread.sleep(1000);

        sourceA = driver.findElement(By.id("column-a"));
        targetB = driver.findElement(By.id("column-b"));
        System.out.println("\nAfter drag:");
        System.out.println("Column A: " + sourceA.findElement(By.tagName("header")).getText());
        System.out.println("Column B: " + targetB.findElement(By.tagName("header")).getText());

        actions.dragAndDrop(sourceA, targetB).perform();
        Thread.sleep(1000);

        sourceA = driver.findElement(By.id("column-a"));
        targetB = driver.findElement(By.id("column-b"));
        System.out.println("\nAfter second drag:");
        System.out.println("Column A: " + sourceA.findElement(By.tagName("header")).getText());
        System.out.println("Column B: " + targetB.findElement(By.tagName("header")).getText());

        driver.quit();
    }
}
