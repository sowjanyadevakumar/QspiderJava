import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P51_DynamicElementWait {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#start button")).click();

        WebElement loadedText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
        System.out.println("Dynamically loaded text: " + loadedText.getText());

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        Thread.sleep(1000);

        WebElement removeBtn = driver.findElement(By.cssSelector("form#checkbox-example button"));
        removeBtn.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
        System.out.println("Checkbox removed from DOM");

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        System.out.println("Message after remove: " + message.getText());

        driver.findElement(By.cssSelector("form#checkbox-example button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
        System.out.println("Checkbox added back to DOM");

        WebElement enableBtn = driver.findElement(By.cssSelector("form#input-example button"));
        enableBtn.click();
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("form#input-example input")));
        inputField.sendKeys("Selenium Dynamic Wait");
        System.out.println("Typed in enabled input: " + inputField.getAttribute("value"));

        driver.quit();
    }
}
