import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P28_ExplicitWaitClickable {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement removeBtn = driver.findElement(By.cssSelector("#checkbox-example button"));
        removeBtn.click();

        WebElement addBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("#checkbox-example button")));
        System.out.println("Button text after remove: " + addBtn.getText());
        addBtn.click();

        wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("#checkbox input")));
        System.out.println("Checkbox re-added successfully");

        WebElement enableBtn = driver.findElement(By.cssSelector("#input-example button"));
        enableBtn.click();

        WebElement textBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("#input-example input")));
        textBox.sendKeys("Selenium Waits Demo");
        System.out.println("Typed into enabled field: " + textBox.getAttribute("value"));

        driver.quit();
    }
}
