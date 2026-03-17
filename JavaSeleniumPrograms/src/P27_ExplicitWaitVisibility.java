import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P27_ExplicitWaitVisibility {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("#start button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement finishText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4")));
        System.out.println("Visible text: " + finishText.getText());

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.cssSelector("#start button")).click();

        WebElement loadedElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        System.out.println("Second page text: " + loadedElement.getText());

        driver.quit();
    }
}
