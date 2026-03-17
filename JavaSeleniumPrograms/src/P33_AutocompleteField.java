import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P33_AutocompleteField {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/auto-complete");
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement multiColorInput = driver.findElement(By.id("autoCompleteMultipleInput"));
        multiColorInput.sendKeys("Bl");
        Thread.sleep(1000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".auto-complete__menu")));

        java.util.List<WebElement> suggestions = driver.findElements(
                By.cssSelector(".auto-complete__option"));
        System.out.println("Suggestions for 'Bl':");
        for (WebElement s : suggestions) {
            System.out.println("  - " + s.getText());
        }

        suggestions.get(0).click();
        System.out.println("Selected first suggestion");

        multiColorInput.sendKeys("Re");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".auto-complete__menu")));
        driver.findElement(By.cssSelector(".auto-complete__option")).click();
        System.out.println("Selected second color");

        java.util.List<WebElement> selectedValues = driver.findElements(
                By.cssSelector(".auto-complete__multi-value__label"));
        System.out.println("\nAll selected colors:");
        for (WebElement val : selectedValues) {
            System.out.println("  - " + val.getText());
        }

        WebElement singleColorInput = driver.findElement(By.id("autoCompleteSingleInput"));
        singleColorInput.sendKeys("Gre");
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".auto-complete__menu")));
        driver.findElement(By.cssSelector(".auto-complete__option")).click();

        WebElement singleValue = driver.findElement(
                By.cssSelector(".auto-complete__single-value"));
        System.out.println("\nSingle select value: " + singleValue.getText());

        driver.quit();
    }
}
