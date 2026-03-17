import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class P29_FluentWaitPolling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("#start button")).click();

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        WebElement result = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver d) {
                WebElement el = d.findElement(By.cssSelector("#finish h4"));
                if (el.isDisplayed()) {
                    return el;
                }
                return null;
            }
        });

        System.out.println("Fluent wait result: " + result.getText());

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.cssSelector("#input-example button")).click();

        WebElement input = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver d) {
                WebElement el = d.findElement(By.cssSelector("#input-example input"));
                if (el.isEnabled()) {
                    return el;
                }
                return null;
            }
        });

        input.sendKeys("Fluent Wait Test");
        System.out.println("Input value: " + input.getAttribute("value"));

        driver.quit();
    }
}
